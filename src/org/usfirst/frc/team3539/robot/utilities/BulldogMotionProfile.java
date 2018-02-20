package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.profiles.GeneratedMotionProfile;
import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Notifier;

public class BulldogMotionProfile
{

	private TalonSRX talon;
	public MotionProfileStatus status = new MotionProfileStatus(); 
	public SetValueMotionProfile setValue = SetValueMotionProfile.Disable;
	
	public BulldogMotionProfile(TalonSRX talon)
	{
		this.talon = talon;
		this.reset();
		
	}
	
	Notifier process = new Notifier(new PeriodicRunnable());
	
	class PeriodicRunnable implements java.lang.Runnable
	{
		public void run()// add to drive train last
		{
			talon.processMotionProfileBuffer();
			System.out.print(talon.getActiveTrajectoryPosition());
			System.out.println(talon.getActiveTrajectoryVelocity());
		}
	}
	
	public void configure()// probably want new name

	{
		talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		
	//	talon.setSensorPhase(true);
		talon.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		talon.config_kF(0, 0.054, RobotMap.kTimeoutMs);
		talon.config_kP(0, .100, RobotMap.kTimeoutMs);
		talon.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		talon.config_kD(0, 1.0, RobotMap.kTimeoutMs);

		talon.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		talon.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	}
	
//	public void startFilling(GeneratedMotionProfile profile)
//	{
//
//		startFilling(profile.PointsL, profile.kNumPoints);
//		// Timer.delay(5);
//	//	process.startPeriodic(0.005);
//	}
	
	public void startFilling(double[][] profile, int totalCnt)
	{
		process.startPeriodic(0.005);
		TrajectoryPoint point = new TrajectoryPoint();

		if (status.hasUnderrun)
		{
			talon.clearMotionProfileHasUnderrun(0);

		}

		talon.clearMotionProfileTrajectories();// make sure nothing is interrupted

		talon.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);

		for (int i = 0; i < totalCnt; ++i)
		{
			double positionRot = profile[i][0];
			double velocityRPM = profile[i][1];

			//318
			point.position = (positionRot/478) * 4096;
			point.velocity = ((velocityRPM*50)) * 4096 / 600.0;
			point.timeDur = GetTrajectoryDuration((int) profile[i][2]);
			point.headingDeg = 0;
			
			point.zeroPos = false;
			point.isLastPoint = false;

			point.profileSlotSelect0 = 0; // there are multiple pid slots now
			point.profileSlotSelect1 = 0;
			
			if (i == 0)
				point.zeroPos = true;

			if ((i + 1) == totalCnt)
				point.isLastPoint = true; /* set this to true on the last point */

			talon.pushMotionProfileTrajectory(point);
		}

	}
	
	public void set()
	{
		talon.getMotionProfileStatus(status);
		System.out.print("statusCnt"+status.btmBufferCnt);
		
		if (status.btmBufferCnt > 10 )
		{
			System.out.println("print btm buffercn is true");
			setValue = SetValueMotionProfile.Enable;

		}
		talon.set(ControlMode.MotionProfile, setValue.value);
		talon.getMotionProfileStatus(status);

		if (status.isLast && status.activePointValid )
		{
			// finish = true;
			System.out.println("finished");
			setValue = SetValueMotionProfile.Disable;
		}
	}
	
	public void reset()
	{
		setValue = SetValueMotionProfile.Disable;

		talon.clearMotionProfileTrajectories();
		talon.setSelectedSensorPosition(0, 0, 10);
	}
	
	private TrajectoryDuration GetTrajectoryDuration(int durationMs)
	{
		TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_10ms;
		retval = retval.valueOf(durationMs);

		return retval;
	}
}
