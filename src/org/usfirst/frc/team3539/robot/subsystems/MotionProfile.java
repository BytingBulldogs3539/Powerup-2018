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
		public void run()//add to drive train last 
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
		case 0: 

			if (bStart)
			{
				startFilling();
			
				_setValue = SetValueMotionProfile.Enable;

				
				state = 1;
				loopTimeout = kNumLoopsTimeout;
				bStart = false;

				

			}

			break;
		case 1:
			if (status.btmBufferCnt > kMinPointsInTalon)//low level buffer
			{_setValue = SetValueMotionProfile.Enable; 
				state = 2;
				loopTimeout = kNumLoopsTimeout;
			}
			break;
		case 2: 

			if (status.isUnderrun == false)
			{
				loopTimeout = kNumLoopsTimeout;
			}
			
			if (status.activePointValid && status.isLast)
			{//set disable on last point
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

		startFilling(GeneratedMotionProfile.PointsL, GeneratedMotionProfile.kNumPoints,GeneratedMotionProfile.PointsR,
				GeneratedMotionProfile.kNumPoints);
	}

	private void startFilling(double[][] profileL, int totalCntL, double[][] profileR, int totalCntR)
	{

		TrajectoryPoint pointL = new TrajectoryPoint();
		TrajectoryPoint pointR = new TrajectoryPoint();
		if (status.hasUnderrun)
		{ 
			Left.clearMotionProfileHasUnderrun(0);
			Right.clearMotionProfileHasUnderrun(0); 
		}

		Left.clearMotionProfileTrajectories();//make sure nothing is interrupted
		Right.clearMotionProfileTrajectories();



		
		Left.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);
		Right.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);

		for (int i = 0; i < totalCntR; ++i)
		{
			double positionRotR = profileR[i][0];
			double velocityRPMR = profileR[i][1];
			pointR.position = positionRotR * 4096; 
			pointR.velocity = velocityRPMR * 4096 / 600.0; 
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

			pointL.position = positionRotL * 4096; // Convert Revolutions to Units
			pointL.velocity = velocityRPML * 4096 / 600.0; // Convert RPM to Units/100ms
			// point.headingDeg = 0; future feature(Thanks omar) 
			pointL.profileSlotSelect0 = 0; //there are multiple pid slots now
			pointR.profileSlotSelect0 = 0; 
		
			pointL.timeDur = GetTrajectoryDuration((int) profileL[iL][2]);
			pointL.zeroPos = false;

			if (iL == 0)
				pointL.zeroPos = true; 

			pointL.isLastPoint = false;
			if ((iL + 1) == totalCntL)
				pointL.isLastPoint = true; 

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

		Left.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		Left.setSensorPhase(true); 
		Left.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		Left.config_kF(0, 0.054, RobotMap.kTimeoutMs);
		Left.config_kP(0, 2.000, RobotMap.kTimeoutMs);
		Left.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		Left.config_kD(0, 20.0, RobotMap.kTimeoutMs);
		
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
