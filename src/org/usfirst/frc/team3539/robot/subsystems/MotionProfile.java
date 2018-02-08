package org.usfirst.frc.team3539.robot.subsystems;


//d@D
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.MotionProfileCommand;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotionProfile extends Subsystem {

	private SetValueMotionProfile _setValue = SetValueMotionProfile.Disable;

	private MotionProfileStatus status = new MotionProfileStatus();
	private int _loopTimeout = -1;
	private int _state = 0;
	private boolean _bStart = false;
	private static final int kMinPointsInTalon = 1;
	private static final int kNumLoopsTimeout = 10;

	double _pos = 0, _vel = 0, _heading = 0;

	TalonSRX Left = new TalonSRX(RobotMap.lf);
	TalonSRX Right = new TalonSRX(RobotMap.rf);
//	SetValueMotionProfile value = SetValueMotionProfile.Enable;
	

	public MotionProfile() {
	
		Left.changeMotionControlFramePeriod(5);
		Right.changeMotionControlFramePeriod(5);

	
	}

	private TrajectoryDuration GetTrajectoryDuration(int durationMs) {
		TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_0ms;
		retval = retval.valueOf(durationMs);

		return retval;
	}

	public void Control() {
System.out.println("control");	
	switch (_state) {
	case 0: /* wait for application to tell us to start an MP */
		System.out.println("case0");

		if (_bStart) {
			
			System.out.println("inside if");
		
			_setValue = SetValueMotionProfile.Disable;
			startFilling();
			/*
			 * MP is being sent to CAN bus, wait a small amount of time
			 */
			_state = 1;
			_loopTimeout = kNumLoopsTimeout;
			_bStart = false;
			
			//System.out.println("case 0 ends");
			
		}			System.out.println("case 0 ends");

		break;
	case 1: /*
			 * wait for MP to stream to Talon, really just the first few
			 * points
			 */
		System.out.println("case1");

		/* do we have a minimum numberof points in Talon */
	System.out.println("Low level buffer count"+status.btmBufferCnt);
		if (status.btmBufferCnt > kMinPointsInTalon) {
			/* start (once) the motion profile */
			_setValue = SetValueMotionProfile.Enable;
			/* MP will start once the control frame gets scheduled */
			_state = 2;
			_loopTimeout = kNumLoopsTimeout;
		}
		break;
	case 2: /* check the status of the MP */
		/*
		 * 
		 * if talon is reporting things are good, keep adding to our
		 * timeout. Really this is so that you can unplug your talon in
		 * the middle of an MP and react to it.
		 */
		System.out.println("case2");

		if (status.isUnderrun == false) {
			_loopTimeout = kNumLoopsTimeout;
		}
		/*
		 * If we are executing an MP and the MP finished, start loading
		 * another. We will go into hold state so robot servo's
		 * position.
		 */
		if (status.activePointValid && status.isLast) {
			/*
			 * because we set the last point's isLast to true, we will
			 * get here when the MP is done
			 */
			_setValue = SetValueMotionProfile.Hold;
			_state = 0;
			_loopTimeout = -1;
		}
		break;
	}
//		Left.getMotionProfileStatus(status);
//		_heading = Left.getActiveTrajectoryHeading();
//		_pos = Left.getActiveTrajectoryPosition();
//		_vel = Left.getActiveTrajectoryVelocity();
	}

	private void startFilling() {
		/* since this example only has one talon, just update that one */
		System.out.println("filling");

		startFilling(profiles.GeneratedMotionProfile.Points, profiles.GeneratedMotionProfile.kNumPoints);
	}

	private void startFilling(double[][] profile, int totalCnt) {

		/* create an empty point */
		TrajectoryPoint point = new TrajectoryPoint();

		/* did we get an underrun condition since last time we checked ? */
		if (status.hasUnderrun) {

			Left.clearMotionProfileHasUnderrun(0);
			// Right as well soon
		}
		/*
		 * just in case we are interrupting another MP and there is still buffer points
		 * in memory, clear it.
		 */
		Left.clearMotionProfileTrajectories();
		// right as well soon

		/*
		 * set the base trajectory period to zero, use the individual trajectory period
		 * below
		 */
		Left.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);

		/* This is fast since it's just into our TOP buffer */
		for (int i = 0; i < totalCnt; ++i) {
			double positionRot = profile[i][0];
			double velocityRPM = profile[i][1];
			System.out.println(status.btmBufferCnt);
			
			/* for each point, fill our structure and pass it to API */
			point.position = positionRot * 4096; // Convert Revolutions to Units
			point.velocity = velocityRPM * 4096 / 600.0; // Convert RPM to Units/100ms
			// point.headingDeg = 0; /* future feature - not used in this example*/
			point.profileSlotSelect0 = 0; /* which set of gains would you like to use [0,3]? */
			// point.profileSlotSelect1 = 0; /* future feature - not used in this example -
			// cascaded PID [0,1], leave zero */
			point.timeDur = GetTrajectoryDuration((int) profile[i][2]);
			point.zeroPos = false;
			if (i == 0)
				point.zeroPos = true; /* set this to true on the first point */

			point.isLastPoint = false;
			if ((i + 1) == totalCnt)
				point.isLastPoint = true; /* set this to true on the last point */

			Left.pushMotionProfileTrajectory(point);
			System.out.println("push");

		}

	}

public 	void startMotionProfile() {
	System.out.println("start = true");
		_bStart = true;
	}

	public void initDefaultCommand() {

		setDefaultCommand(new MotionProfileCommand());
	}

public void setMotionProfile()
{
	Left.set(ControlMode.MotionProfile,_setValue.value);
	
	}
	public void Disabled()
	{
		System.out.println("Disabled");

		Left.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		Left.setSensorPhase(true); /* keep sensor and motor in phase */
		Left.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		Left.config_kF(0, 0.076, RobotMap.kTimeoutMs);
		Left.config_kP(0, 2.000, RobotMap.kTimeoutMs);
		Left.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		Left.config_kD(0, 20.0, RobotMap.kTimeoutMs);

		/* Our profile uses 10ms timing */
		Left.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs); 
		/*
		 * status 10 provides the trajectory target for motion profile AND
		 * motion magic
		 */
		Left.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	}

}
