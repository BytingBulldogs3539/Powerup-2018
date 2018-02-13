package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.profiles.GeneratedMotionProfile;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author 3539
 */
public final class DriveTrain extends Subsystem
{
	private ADXL362 accelerometer;
	private ADXRS450_Gyro gyro;
	private TalonSRX lf, lb, rf, rb;
	private Drive drive;

	public DriveTrain()
	{
		gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
		accelerometer = new ADXL362(SPI.Port.kOnboardCS1, Accelerometer.Range.k8G);

		lf = new TalonSRX(RobotMap.lf);
		rf = new TalonSRX(RobotMap.rf);

		lb = new TalonSRX(RobotMap.lb);
		rb = new TalonSRX(RobotMap.rb);

		double peakOut = 1;// 1 is full ouput
		lf.configPeakOutputForward(peakOut, 10);
		lf.configPeakOutputReverse(-peakOut, 10);
		rf.configPeakOutputForward(peakOut, 10);
		rf.configPeakOutputReverse(-peakOut, 10);

		lb.configPeakOutputForward(peakOut, 10);
		lb.configPeakOutputReverse(-peakOut, 10);
		rb.configPeakOutputForward(peakOut, 10);
		rb.configPeakOutputReverse(-peakOut, 10);

		// Nominal is the default output when given no instruction
		lf.configNominalOutputForward(0, 10);
		rf.configNominalOutputForward(0, 10);

		lf.configNominalOutputReverse(0, 10);
		rf.configNominalOutputReverse(0, 10);

		lb.configNominalOutputForward(0, 10);
		rb.configNominalOutputForward(0, 10);

		lb.configNominalOutputReverse(0, 10);
		rb.configNominalOutputReverse(0, 10);

		// lb.setNeutralMode(NeutralMode.Brake);
		// rb.setNeutralMode(NeutralMode.Brake);
		//
		// lf.setNeutralMode(NeutralMode.Brake);
		// rf.setNeutralMode(NeutralMode.Brake);

		drive = new Drive(rf, lf);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);

		setFollower();
		// setInverted();
		// enableCurrentLimit();

		SmartDashboard.putData("Accelerometer", accelerometer);
		SmartDashboard.putData("Gyro", gyro);
	}

	private void setFollower()
	{
		lb.set(ControlMode.Follower, lf.getDeviceID());
		rb.set(ControlMode.Follower, rf.getDeviceID());
	}

	private void setInverted()
	{
		lf.setInverted(true);
		rf.setInverted(true);

		lb.setInverted(false);
		rb.setInverted(false);
	}

	private void enableCurrentLimit()
	{
		lf.enableCurrentLimit(true);
		rf.enableCurrentLimit(true);
	}

	public void zeroEncoders()
	{
		lf.getSensorCollection().setPulseWidthPosition(0, 10);
		rf.getSensorCollection().setPulseWidthPosition(0, 10);

		lf.setSelectedSensorPosition(0, 0, 10);
		rf.setSelectedSensorPosition(0, 0, 10);
	}

	public void zeroGyro()
	{
		gyro.reset();
	}

	public double getHeading()
	{
		return gyro.getAngle();
	}

	public void calibrateGyro()
	{
		gyro.calibrate();
	}

	public void driveArcade(double throttle, double wheel)
	{
		drive.driveArcade(throttle, wheel);
	}

	public void setPID(double P, double I, double D, double F)
	{
		// lf.config_kF(0, F, 10);
		// rf.config_kF(0, F, 10);
		//
		// lf.config_kP(0, P, 10);
		// rf.config_kP(0, P, 10);
		//
		// lf.config_kI(0, I, 10);
		// rf.config_kI(0, I, 10);
		//
		// lf.config_kD(0, D, 10);
		// rf.config_kD(0, D, 10);
	}

	public void setSetpointDrive(double setpointinches)
	{
		zeroEncoders();

		System.out.println("lbcontrol: " + lb.getControlMode());
		System.out.println("rbcontrol: " + rb.getControlMode());

		lf.set(ControlMode.Position, inchToEncoder(setpointinches));
		rf.set(ControlMode.Position, inchToEncoder(setpointinches));
	}

	public void setSetpointTurn(double setpointdegrees)
	{
		zeroEncoders();

		System.out.println("setpoint: " + degreesToEncoder(setpointdegrees));

		lf.set(ControlMode.Position, degreesToEncoder(setpointdegrees));
		rf.set(ControlMode.Position, degreesToEncoder(setpointdegrees));
	}

	public double degreesToEncoder(double degrees)
	{
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;

	public boolean onTarget()
	{
		if (Math.abs(lf.getClosedLoopError(0)) <= allowedErrorRange
				&& Math.abs(rf.getClosedLoopError(0)) <= allowedErrorRange)
		{
			onTargetCounter++;
		}
		else
		{
			onTargetCounter = 0;
		}

		if (maxLoopNumber <= onTargetCounter)
		{
			return true;
		}

		return false;
	}

	public void setupOnTarget(int ticks, int maxLoopNumber)
	{
		// zero the on target counter
		onTargetCounter = 0;

		lf.configAllowableClosedloopError(0, ticks, 10);
		rf.configAllowableClosedloopError(0, ticks, 10);

		// set tolerance in ticks
		allowedErrorRange = ticks;
	}

	public double inchToEncoder(double inches)
	{
		return (inches / RobotMap.wheelCir) * 4096;
	}

	public void updateEncoders()
	{
		SmartDashboard.putNumber("Right Encoder", rf.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Encoder", lf.getSelectedSensorPosition(0));
	}

	public void effectiveArcadeDrive(double throttle, double wheel)
	{
		wheel = applyDeadband(wheel, RobotMap.wheelDeadband);
		throttle = applyDeadband(throttle, RobotMap.throttleDeadband);

		// Apply a sin function that's scaled to make it feel better.
		final double wheelDenominator = Math.sin(Math.PI / 2.0 * RobotMap.wheelNonLinearity);
		wheel = Math.sin(Math.PI / 2.0 * RobotMap.wheelNonLinearity * wheel) / wheelDenominator;

		// Apply a tan function that's scaled to make it feel better.
		final double throttleDenominator = Math.tan(Math.PI / 2.0 * RobotMap.throttleNonLinearity);
		throttle = Math.tan(Math.PI / 2.0 * RobotMap.throttleNonLinearity * throttle) / throttleDenominator;

		// Decrease wheel by __% at high speed
		if (Math.abs(throttle) > RobotMap.throttleHighPass)
		{
			wheel = wheel * RobotMap.highSpeedWheel;
		}

		driveArcade(throttle, wheel);
	}

	public double applyDeadband(double value, double deadband)
	{
		// if abs(val) > abs(deadband) return val; else return 0.0;
		return (Math.abs(value) > Math.abs(deadband)) ? value : 0.0;
	}

	public void testTalons()
	{
		StringBuilder Motors = new StringBuilder(1000);

		lf.set(ControlMode.PercentOutput, 0);
		lb.set(ControlMode.PercentOutput, 0);
		rf.set(ControlMode.PercentOutput, 0);
		rb.set(ControlMode.PercentOutput, 0);

		lf.set(ControlMode.PercentOutput, .5);// set to .5
		Timer.delay(2);// wait
		System.out.println("--------");
		Motors.append("  lfMotorCurrent= " + lf.getOutputCurrent());
		Motors.append("  lfMotorVoltage = " + lf.getMotorOutputVoltage());

		lf.set(ControlMode.PercentOutput, 0);// set to 0

		Timer.delay(2);// wait before starting other motor

		lb.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append("  lbMotorCurrent= " + lb.getOutputCurrent());
		Motors.append("  lbMotorVoltage = " + lb.getMotorOutputVoltage());

		lb.set(ControlMode.PercentOutput, 0);

		Timer.delay(2);// wait before starting other motor

		rf.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append("  rfMotorCurrent= " + rf.getOutputCurrent());
		Motors.append("  rfMotorVoltage = " + rf.getMotorOutputVoltage());

		rf.set(ControlMode.PercentOutput, 0);

		Timer.delay(2);

		Timer.delay(2);

		rb.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append("  rbMotorCurrent= " + rb.getOutputCurrent());
		Motors.append("  rbMotorVoltage = " + rb.getMotorOutputVoltage());

		rb.set(ControlMode.PercentOutput, 0);
		Motors.toString();
	}

	private SetValueMotionProfile setValue = SetValueMotionProfile.Disable;
	private MotionProfileStatus statusR = new MotionProfileStatus();
	private MotionProfileStatus statusL = new MotionProfileStatus();

	Notifier process = new Notifier(new PeriodicRunnable());
	boolean finish = false;

	private int loopTimeout = -1;
	private static final int kNumLoopsTimeout = 10;

	public void MotionProfile()
	{

		lf.changeMotionControlFramePeriod(5);
		rf.changeMotionControlFramePeriod(5);

	}

	private TrajectoryDuration GetTrajectoryDuration(int durationMs)
	{
		TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_0ms;
		retval = retval.valueOf(durationMs);

		return retval;
	}

	public boolean GetFinish()
	{
		return finish;
	}

	public void setMotionProfile()
	{
		// lf.setInverted(true);
		if (statusR.btmBufferCnt > 100 && statusL.btmBufferCnt > 100)
		{
			System.out.println("print btm buffercn is true");
			setValue = SetValueMotionProfile.Enable;

		}
		rf.set(ControlMode.MotionProfile, setValue.value);

		lf.set(ControlMode.MotionProfile, setValue.value);
		rf.getMotionProfileStatus(statusR);
		lf.getMotionProfileStatus(statusL);
		System.out.println("status R" + statusR.btmBufferCnt);

		System.out.println("status L" + statusL.btmBufferCnt);

		if (statusL.isLast && statusR.isLast && statusL.activePointValid && statusR.activePointValid)
		{
			// finish = true;
			System.out.println("finished");
			setValue = SetValueMotionProfile.Disable;
		}
	}

	public void MotionProfileReset()
	{
		setValue = SetValueMotionProfile.Disable;

		lf.clearMotionProfileTrajectories();
		rf.clearMotionProfileTrajectories();
		lf.setSelectedSensorPosition(0, 0, 10);
		rf.setSelectedSensorPosition(0, 0, 10);

	}

	// public void Enable() {
	// setValue = SetValueMotionProfile.Enable;
	//
	// }

	public void startFilling()
	{

		startFilling(GeneratedMotionProfile.PointsL, GeneratedMotionProfile.kNumPoints, GeneratedMotionProfile.PointsR,
				GeneratedMotionProfile.kNumPoints);
		// Timer.delay(5);
		process.startPeriodic(0.005);
	}

	private void startFilling(double[][] profileL, int totalCntL, double[][] profileR, int totalCntR)
	{

		TrajectoryPoint pointL = new TrajectoryPoint();
		TrajectoryPoint pointR = new TrajectoryPoint();
		if (statusR.hasUnderrun || statusL.hasUnderrun)
		{
			lf.clearMotionProfileHasUnderrun(0);
			rf.clearMotionProfileHasUnderrun(0);
		}

		lf.clearMotionProfileTrajectories();// make sure nothing is interrupted
		rf.clearMotionProfileTrajectories();

		lf.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);
		rf.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);

		for (int i = 0; i < totalCntL; ++i)
		{
			double positionRotR = profileR[i][0];
			double positionRotL = profileL[i][0];

			double velocityRPMR = profileR[i][1];
			double velocityRPML = profileL[i][1];

			pointR.position = positionRotR * 4096;
			pointR.velocity = velocityRPMR * 4096 / 600.0;
			pointL.position = positionRotL * 4096; // Convert Revolutions to Units
			pointL.velocity = velocityRPML * 4096 / 600.0; // Convert RPM to Units/100ms

			pointL.timeDur = GetTrajectoryDuration((int) profileL[i][2]);
			pointR.timeDur = GetTrajectoryDuration((int) profileR[i][2]);
			pointR.zeroPos = false;
			pointL.zeroPos = false;
			pointR.isLastPoint = false;
			pointL.isLastPoint = false;

			pointL.profileSlotSelect0 = 0; // there are multiple pid slots now
			pointR.profileSlotSelect0 = 0;

			if (i == 0)
				pointR.zeroPos = true;
			pointL.zeroPos = true;

			if ((i + 1) == totalCntL)
				pointL.isLastPoint = true;

			if ((i + 1) == totalCntR)
				pointR.isLastPoint = true; /* set this to true on the last point */

			lf.pushMotionProfileTrajectory(pointL);
			rf.pushMotionProfileTrajectory(pointR);
		}

	}

	public void DisabledMotionProfile()// probably want new name

	{

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		lf.setSensorPhase(true);
		lf.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		lf.config_kF(0, 0.074, RobotMap.kTimeoutMs);
		lf.config_kP(0, .200, RobotMap.kTimeoutMs);
		lf.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		lf.config_kD(0, 1.0, RobotMap.kTimeoutMs);

		lf.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		lf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);

		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rf.setSensorPhase(true); /* keep sensor and motor in phase */
		rf.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);

		rf.config_kF(0, 0.054, RobotMap.kTimeoutMs);
		rf.config_kP(0, .100, RobotMap.kTimeoutMs);
		rf.config_kI(0, 0.0, RobotMap.kTimeoutMs);
		rf.config_kD(0, 1.0, RobotMap.kTimeoutMs);

		rf.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		rf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	}

	class PeriodicRunnable implements java.lang.Runnable
	{
		public void run()// add to drive train last
		{

			lf.processMotionProfileBuffer();
			rf.processMotionProfileBuffer();

		}
	}

	@Override
	protected void initDefaultCommand()
	{
		setDefaultCommand(new DriveCommand());
	}
}
