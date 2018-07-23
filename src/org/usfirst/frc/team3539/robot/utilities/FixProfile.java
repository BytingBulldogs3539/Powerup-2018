package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.utilities.MotionProfileExample.PeriodicRunnable;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FixProfile
{
	private static final int kMinPointsInTalon = 5;

	TalonSRX rf, lf;
	double[][] pointsR, pointsL;
	int total;
	private MotionProfileStatus _status = new MotionProfileStatus();
	private MotionProfileStatus statusR = new MotionProfileStatus();

	public SetValueMotionProfile _setValue = SetValueMotionProfile.Disable;
	private boolean started = false;
	
	public  FixProfile(double[][] right, double[][] left, int tot)
	{
		pointsR = right;
		pointsL = left;
		total = tot;
		rf = Robot.driveTrain.rf;
		lf = Robot.driveTrain.lf;
	}

	
	class PeriodicRunnable implements java.lang.Runnable {
	    public void run() {
	    	lf.processMotionProfileBuffer();  rf.processMotionProfileBuffer(); 
	    }
	}
	Notifier _notifer = new Notifier(new PeriodicRunnable());
	public void Init()
	{
		
		System.out.println("-------------------Init-----------------");

		Robot.driveTrain.setPID(SmartDashboard.getNumber("drivePea", RobotMap.drivePea), SmartDashboard.getNumber("driveEye", RobotMap.driveEye), SmartDashboard.getNumber("driveDee", RobotMap.driveDee),
				SmartDashboard.getNumber("driveFFF", RobotMap.driveFFF));
		Robot.driveTrain.rf.configMotionProfileTrajectoryPeriod(0, 10);// should be 0S
		Robot.driveTrain.lf.configMotionProfileTrajectoryPeriod(0, 10);// should be 0
		Robot.driveTrain.rf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, 10);
		Robot.driveTrain.lf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, 10);
		Robot.driveTrain.rf.setSelectedSensorPosition(0, 0, 10);
		Robot.driveTrain.lf.setSelectedSensorPosition(0, 0, 10);
		lf.changeMotionControlFramePeriod(5);
		rf.changeMotionControlFramePeriod(5);
		Robot.driveTrain.rf.set(ControlMode.MotionProfile, _setValue.value);
		Robot.driveTrain.lf.set(ControlMode.MotionProfile, _setValue.value);
		fill();
	}
	public void fill() {
		_notifer.startPeriodic(0.005);

		startFilling(pointsR,total,pointsL);
	}

	private void setTalonValue()
	{

		Robot.driveTrain.rf.set(ControlMode.MotionProfile, _setValue.value);
		Robot.driveTrain.lf.set(ControlMode.MotionProfile, _setValue.value);
	}

	private TrajectoryDuration GetTrajectoryDuration(int durationMs)
	{
		/* create return value */
		TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_0ms;
		/* convert duration to supported type */
		retval = retval.valueOf(durationMs);
		/* check that it is valid */
		if (retval.value != durationMs)
		{
			DriverStation.reportError("Trajectory Duration not supported - use configMotionProfileTrajectoryPeriod instead", false);
		}
		/* pass to caller */
		return retval;
	}

	public void start()
	{ 
		System.out.println( "starting--------------");
		if ((_status.btmBufferCnt > kMinPointsInTalon)&& !started) {
			/* start (once) the motion profile */	_setValue = SetValueMotionProfile.Enable;
			started = true;
		}
		
		
		if (_status.activePointValid && _status.isLast) {
			/*
			 * because we set the last point's isLast to true, we will
			 * get here when the MP is done
			 */
			_setValue = SetValueMotionProfile.Hold;
			started = false;
		}
		setTalonValue();
	}
	
	private void startFilling(double[][] profileR, int totalCnt, double[][] profileL)
	{
		System.out.println("-------------------Start FIlling-----------------");

		TrajectoryPoint point = new TrajectoryPoint();
		TrajectoryPoint pointR = new TrajectoryPoint();

		for (int i = 0; i < totalCnt; ++i)
		{
			System.out.println(i);
			double positionRot = profileL[i][0];
			double positionRotR = profileR[i][0];

			double velocityRPM = profileL[i][1];
			double velocityRPMR = profileR[i][1];

			/* for each point, fill our structure and pass it to API */
			point.position = positionRot * 4096; // Convert Revolutions to Units
			pointR.position = positionRotR * 4096; // Convert Revolutions to Units

			point.velocity = velocityRPM * 4096 / 600.0; // Convert RPM to Units/100ms
			pointR.velocity = velocityRPMR * 4096 / 600.0; // Convert RPM to Units/100ms

			point.headingDeg = 0; /* future feature - not used in this example */
			pointR.headingDeg = 0; /* future feature - not used in this example */

			point.profileSlotSelect0 = 0; /* which set of gains would you like to use [0,3]? */
			pointR.profileSlotSelect0 = 0; /* which set of gains would you like to use [0,3]? */

			point.profileSlotSelect1 = 0; /* future feature - not used in this example - cascaded PID [0,1], leave zero */
			pointR.profileSlotSelect1 = 0; /* future feature - not used in this example - cascaded PID [0,1], leave zero */

			point.timeDur = GetTrajectoryDuration((int) profileL[i][2]);
			pointR.timeDur = GetTrajectoryDuration((int) profileR[i][2]);

			point.zeroPos = false;
			pointR.zeroPos = false;

			if (i == 0)
			{
				point.zeroPos = true; /* set this to true on the first point */
				pointR.zeroPos = true; /* set this to true on the first point */

			}
			point.isLastPoint = false;
			pointR.isLastPoint = false;

			if ((i + 1) == totalCnt)
			{
				point.isLastPoint = true; /* set this to true on the last point */
				pointR.isLastPoint = true; /* set this to true on the last point */

			}
			lf.pushMotionProfileTrajectory(point);
			rf.pushMotionProfileTrajectory(pointR);
		}
	}
	
	public void reset() {
		/*
		 * Let's clear the buffer just in case user decided to disable in the
		 * middle of an MP, and now we have the second half of a profile just
		 * sitting in memory.
		 */
		lf.clearMotionProfileTrajectories();
		rf.clearMotionProfileTrajectories();

		/* When we do re-enter motionProfile control mode, stay disabled. */
		_setValue = SetValueMotionProfile.Disable;
	}
}
