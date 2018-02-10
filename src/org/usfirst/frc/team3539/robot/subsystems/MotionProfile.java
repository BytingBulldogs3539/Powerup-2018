package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
//d@D
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.MotionProfileCommand;
import org.usfirst.frc.team3539.robot.profiles.*;
import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotionProfile extends Subsystem
{

	private SetValueMotionProfile _setValue = SetValueMotionProfile.Disable;
	Notifier process = new Notifier(new PeriodicRunnable());
	private MotionProfileStatus status = new MotionProfileStatus();
	private int loopTimeout = -1;
	private int state = 0;
	private boolean bStart = false;
	private static final int kMinPointsInTalon = 1;
	private static final int kNumLoopsTimeout = 10;

	double pos = 0, vel = 0, heading = 0;
	
	TalonSRX Left = new TalonSRX(RobotMap.lf);
	TalonSRX LeftSlave = new TalonSRX(RobotMap.lb);

	TalonSRX Right = new TalonSRX(RobotMap.rf);
	TalonSRX RightSlave = new TalonSRX(RobotMap.rb);

	// SetValueMotionProfile value = SetValueMotionProfile.Enable;

	class PeriodicRunnable implements java.lang.Runnable
	{
		public void run()
		{
			
			Left.processMotionProfileBuffer();
			Right.processMotionProfileBuffer();

		}
	}

	public boolean start()
	{
		return bStart;
	}

	public MotionProfile()
	{

		Left.changeMotionControlFramePeriod(5);
		Right.changeMotionControlFramePeriod(5);

	}

	private TrajectoryDuration GetTrajectoryDuration(int durationMs)
	{
		TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_0ms;
		retval = retval.valueOf(durationMs);

		return retval;
	}

	public void Process()
	{
		process.startPeriodic(.005);
	}

	public void Control()
	{
		switch (state)
		{
		case 0: /* wait for application to tell us to start an MP */

			if (bStart)
			{
				startFilling();
				// System.out.println("startFilling");
				_setValue = SetValueMotionProfile.Enable;

				// MP is being sent to CAN bus, wait a small amount of time

				state = 1;
				loopTimeout = kNumLoopsTimeout;
				bStart = false;

				// System.out.println("case 0 ends");

			}

			break;
		case 1:
			// System.out.println("case1");
			if (status.btmBufferCnt > kMinPointsInTalon)
			{/* do we have a minimum numberof points in Talon */
				_setValue = SetValueMotionProfile.Enable; /* start (once) the motion profile */
				/* MP will start once the control frame gets scheduled */
				state = 2;
				loopTimeout = kNumLoopsTimeout;
			}
			break;
		case 2: /* check the status of the MP */

			// System.out.println("case2");
			/*
			 * if talon is reporting things are good, keep adding to our timeout. Really this is so that you can unplug your talon in the middle of an MP and react to it.
			 */

			if (status.isUnderrun == false)
			{
				loopTimeout = kNumLoopsTimeout;
			}
			/*
			 * If we are executing an MP and the MP finished, start loading another. We will go into hold state so robot servo's position.
			 */
			if (status.activePointValid && status.isLast)
			{
				/*
				 * because we set the last point's isLast to true, we will get here when the MP is done
				 */
				_setValue = SetValueMotionProfile.Disable;
				state = 0;
				loopTimeout = -1;
			}
			break;
		}
		Left.getMotionProfileStatus(status);
		heading = Left.getActiveTrajectoryHeading();
		pos = Left.getActiveTrajectoryPosition();
		vel = Left.getActiveTrajectoryVelocity();
	}

	private void startFilling()
	{

		startFilling(GeneratedMotionProfile.Points, GeneratedMotionProfile.kNumPoints,GeneratedMotionProfile.Points,
				GeneratedMotionProfile.kNumPoints);
	}

	private void startFilling(double[][] profileL, int totalCntL, double[][] profileR, int totalCntR)
	{

		/* create an empty point */
		TrajectoryPoint pointL = new TrajectoryPoint();
		TrajectoryPoint pointR = new TrajectoryPoint();
		if (status.hasUnderrun)
		{ /* did we get an underrun condition since last time we checked ? */
			Left.clearMotionProfileHasUnderrun(0);
			Right.clearMotionProfileHasUnderrun(0); // Right as well soon
		}

		Left.clearMotionProfileTrajectories(); /*
												 * just in case we are interrupting another MP and there is still buffer point in memory, clear it.
												 */
		Right.clearMotionProfileTrajectories();

		// right as well soon

		/*
		 * set the base trajectory period to zero, use the individual trajectory period below
		 */
		Left.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);
		Right.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);

		/* This is fast since it's just into our TOP buffer */
		for (int i = 0; i < totalCntR; ++i)
		{
			double positionRotR = profileR[i][0];
			double velocityRPMR = profileR[i][1];
			pointR.position = positionRotR * 4096; // Convert Revolutions to Units
			pointR.velocity = velocityRPMR * 4096 / 600.0; // Convert RPM to Units/100ms
			pointR.timeDur = GetTrajectoryDuration((int) profileR[i][2]);
			pointR.zeroPos = false;
			pointR.isLastPoint = false;

			if (i == 0)
				pointR.zeroPos = true;

			if ((i + 1) == totalCntR)
				pointR.isLastPoint = true; /* set this to true on the last point */

		}

		for (int iL = 0; iL < totalCntL; ++iL)
		{
			double positionRotL = profileL[iL][0];
			double velocityRPML = profileL[iL][1];

			// System.out.println(status.btmBufferCnt);

			/* for each point, fill our structure and pass it to API */
			pointL.position = positionRotL * 4096; // Convert Revolutions to Units
			pointL.velocity = velocityRPML * 4096 / 600.0; // Convert RPM to Units/100ms
			// point.headingDeg = 0; /* future feature - not used in this example*/
			pointL.profileSlotSelect0 = 0; /* which set of gains would you like to use [0,3]? */
			pointR.profileSlotSelect0 = 0; /* which set of gains would you like to use [0,3]? */
			// point.profileSlotSelect1 = 0; /* future feature - not used in this example -
			// cascaded PID [0,1], leave zero */
			pointL.timeDur = GetTrajectoryDuration((int) profileL[iL][2]);
			pointL.zeroPos = false;

			if (iL == 0)
				pointL.zeroPos = true; /* set this to true on the first point */

			pointL.isLastPoint = false;
			if ((iL + 1) == totalCntL)
				pointL.isLastPoint = true; /* set this to true on the last point */

			Left.pushMotionProfileTrajectory(pointL);
			Right.pushMotionProfileTrajectory(pointR);

		}
	}

	public void startMotionProfile()
	{
		bStart = true;

	}

	public void SetMotionFalse()
	{
		bStart = false;
	}

	public void initDefaultCommand()
	{

		setDefaultCommand(new MotionProfileCommand());
	}

	public void setMotionProfile()
	{
		Left.set(ControlMode.MotionProfile, _setValue.value);
		Left.setInverted(true);
		LeftSlave.set(ControlMode.Follower, Left.getBaseID());
		Right.set(ControlMode.MotionProfile, _setValue.value);
		RightSlave.set(ControlMode.Follower, Right.getBaseID());

	}

	public void Disabled()
	{
		// System.out.println("Disabled");

		Left.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		Left.setSensorPhase(true); /* keep sensor and motor in phase */
		Left.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		Left.config_kF(0, 0.054, RobotMap.kTimeoutMs);
		Left.config_kP(0, 2.000, RobotMap.kTimeoutMs);
		Left.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		Left.config_kD(0, 20.0, RobotMap.kTimeoutMs);

		/* Our profile uses 10ms timing */
		Left.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		Left.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);

		Right.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		Right.setSensorPhase(true); /* keep sensor and motor in phase */
		Right.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		Right.config_kF(0, 0.054, RobotMap.kTimeoutMs);
		Right.config_kP(0, 2.000, RobotMap.kTimeoutMs);
		Right.config_kI(0, .0, RobotMap.kTimeoutMs);
		Right.config_kD(0, 20.0, RobotMap.kTimeoutMs);

		/* Our profile uses 10ms timing */
		Right.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		Right.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	}

	public void ResetENC()
	{
		Left.setSelectedSensorPosition(0, 0, 0);
		Right.setSelectedSensorPosition(0, 0, 0);

	}

	public void Reset()
	{
		Left.clearMotionProfileTrajectories();
		Right.clearMotionProfileTrajectories();
		/* When we do re-enter motionProfile control mode, stay disabled. */
		_setValue = SetValueMotionProfile.Disable;
		/* When we do start running our state machine start at the beginning. */
		state = 0;
		loopTimeout = -1;
		/*
		 * If application wanted to start an MP before, ignore and wait for next button press
		 */
		bStart = false;
	}

	public void print()
	{
		System.out.println("LEftposition" + Left.getSelectedSensorPosition(0));
		System.out.println("Rightposition" + Right.getSelectedSensorPosition(0));
		System.out.println("LEftvelocity" + Left.getSelectedSensorVelocity(0));
		System.out.println("Rightvelocity" + Right.getSelectedSensorVelocity(0));

	}

}
