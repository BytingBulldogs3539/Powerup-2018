package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.RobotMap;
import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Notifier;

public class BulldogMotionProfile
{
	
	private String name;
	private TalonSRX talon;
<<<<<<< HEAD
	private MotionProfileStatus status = new MotionProfileStatus();
	private SetValueMotionProfile setValue = SetValueMotionProfile.Disable;
	private boolean isFinished;
=======
	public MotionProfileStatus status = new MotionProfileStatus();
	public SetValueMotionProfile setValue = SetValueMotionProfile.Disable;
	public boolean motionFinish = false;
>>>>>>> 73632ae5b055ca3604c344e58d502e4c38334c45

	public BulldogMotionProfile(TalonSRX talon, String name)
	{
		this.talon = talon;
		this.name = name;
	}

	private Notifier process = new Notifier(new PeriodicRunnable());

	class PeriodicRunnable implements java.lang.Runnable
	{
		public void run()// add to drive train last
		{
			talon.processMotionProfileBuffer();
<<<<<<< HEAD
=======
			
			// System.out.print(talon.getActiveTrajectoryPosition());
			// System.out.println(talon.getActiveTrajectoryVelocity());
>>>>>>> 73632ae5b055ca3604c344e58d502e4c38334c45
		}
	}

	public void configure()// probably want new name
	{
		isFinished = false;
		
		talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);

		// talon.setSensorPhase(true);
		talon.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

<<<<<<< HEAD
=======
		// talon.config_kF(0, 0.054, RobotMap.kTimeoutMs);
		// talon.config_kP(0, .100, RobotMap.kTimeoutMs);
		// talon.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		// talon.config_kD(0, 1.0, RobotMap.kTimeoutMs);

>>>>>>> 73632ae5b055ca3604c344e58d502e4c38334c45
		talon.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		talon.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	}

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

			point.position = (positionRot / 478) * 4096; //Prac 478mm Tina 318mm
			point.velocity = ((velocityRPM * 6.6) * 4096 / 600.0);
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

	public boolean finish()
	{
		//System.out.println(motionFinish);
		return motionFinish;
	}

	public void set()
	{
		talon.getMotionProfileStatus(status);
<<<<<<< HEAD
		System.out.println("statusCnt" + status.btmBufferCnt);
=======
		// System.out.print("statusCnt" + status.btmBufferCnt);
>>>>>>> 73632ae5b055ca3604c344e58d502e4c38334c45

		if (status.btmBufferCnt > 5)
		{
			System.out.println("print btm buffercn is true");
			setValue = SetValueMotionProfile.Enable;
		}
		
		talon.set(ControlMode.MotionProfile, setValue.value);
		talon.getMotionProfileStatus(status);
<<<<<<< HEAD

		System.out.println("tragectory position" + talon.getActiveTrajectoryPosition());
		System.out.println("EncPos" + talon.getSelectedSensorPosition(0));
		System.out.println("tragectory Velocity" + talon.getActiveTrajectoryVelocity());
		System.out.println("EncVel" + talon.getSelectedSensorVelocity(0));

		if (status.isLast && status.activePointValid)
		{
			process.stop();

			isFinished = true;
			System.out.println(name + "Finished");
=======
System.out.println("bufferCNt"+status.btmBufferCnt);
		if (status.isLast && status.activePointValid)
		{
			// finish = true;
			System.out.println("finished");
			motionFinish = true;
>>>>>>> 73632ae5b055ca3604c344e58d502e4c38334c45
			setValue = SetValueMotionProfile.Disable;
		}
	}

	public boolean isFinished()
	{
		return isFinished;
	}

	public void resetProfile()
	{
<<<<<<< HEAD
		isFinished = false;
		
=======
		motionFinish = false;

>>>>>>> 73632ae5b055ca3604c344e58d502e4c38334c45
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
