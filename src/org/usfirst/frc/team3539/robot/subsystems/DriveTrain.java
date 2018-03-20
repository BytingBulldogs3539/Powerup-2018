package org.usfirst.frc.team3539.robot.subsystems;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;

import org.usfirst.frc.team3539.robot.PracMap;
import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.BulldogMotionProfile;
import org.usfirst.frc.team3539.robot.utilities.Drive;
import org.usfirst.frc.team3539.robot.logger.Log;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author 3539
 */
public final class DriveTrain extends Subsystem
{

	private ADXRS450_Gyro gyro;
	public TalonSRX lf, lb, rf, rb;
	private Drive drive;

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;

	@Log(level = 1) public int leftEncoderPos;
	@Log(level = 1) public int rightEncoderPos;
	@Log(level = 1) public int leftEncoderVel;
	@Log(level = 1) int rightEncoderVel;
	@Log(level = 1) double leftMotorPercent;
	@Log(level = 1) double rightMotorPercent;
	@Log(level = 1) double driveForwardStick;
	@Log(level = 1) double driveTurnStick;
	@Log(level = 1) double leftCurrent;
	@Log(level = 1) double rightCurrent;
	
	public DriveTrain()
	{

		gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

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

		drive = new Drive(rf, lf);

		lf.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 10, 10);
		rf.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 10, 10);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);

		lf.clearStickyFaults(0);
		rf.clearStickyFaults(0);
		lb.clearStickyFaults(0);
		rb.clearStickyFaults(0);

		// leftTrack = new BulldogMotionProfile(lf, "Left Track ");
		// rightTrack = new BulldogMotionProfile(rf, "Right Track ");

		 setBrakeMode(true);
		setFollower();
		setInverted();
		// Omar CTRE I hate you sometimes - Do not remove
		enableCurrentLimit();
		//enableRamp();

		// SmartDashboard.putData("Accelerometer", accelerometer);
		SmartDashboard.putData("Gyro", gyro);

		setSensorPhase(false);
	}
	
	public void updateLog()
	{
		leftEncoderPos = lf.getSelectedSensorPosition(0);
		rightEncoderPos = rf.getSelectedSensorPosition(0);
		leftEncoderVel = lf.getSelectedSensorVelocity(0);
		rightEncoderVel = rf.getSelectedSensorVelocity(0);
		driveForwardStick = Robot.oi.one.getLeftStickY();
		driveTurnStick = Robot.oi.one.getRightStickX();
		leftMotorPercent = lf.getMotorOutputPercent();
		rightMotorPercent = rf.getMotorOutputPercent();
		leftCurrent = lf.getOutputCurrent();
		rightCurrent = rf.getOutputCurrent();
		
	}

	public void setBrakeMode(boolean shouldBrakeMode)
	{
		if (shouldBrakeMode)
		{
			lf.setNeutralMode(NeutralMode.Brake);
			rf.setNeutralMode(NeutralMode.Brake);
			lb.setNeutralMode(NeutralMode.Brake);
			rb.setNeutralMode(NeutralMode.Brake);
		}
		else
		{
			lf.setNeutralMode(NeutralMode.Coast);
			rf.setNeutralMode(NeutralMode.Coast);
			lb.setNeutralMode(NeutralMode.Coast);
			rb.setNeutralMode(NeutralMode.Coast);
		}
	}

	private void setFollower()
	{

		lb.set(ControlMode.Follower, lf.getDeviceID());
		rb.set(ControlMode.Follower, rf.getDeviceID());
	}

	private void setInverted()
	{
		lf.setInverted(true);
		lb.setInverted(true);

		rf.setInverted(false);
		rb.setInverted(false);
	}

	@SuppressWarnings("unused")
	private void enableCurrentLimit()
	{
		lf.configPeakCurrentLimit(35, 10);
		rf.configPeakCurrentLimit(35, 10);

		lf.configPeakCurrentDuration(100, 10);
		rf.configPeakCurrentDuration(100, 10);

		lf.configContinuousCurrentLimit(30, 10);
		rf.configContinuousCurrentLimit(30, 10);

		lf.enableCurrentLimit(true); // TODO - Change to true and add rest of current code
		rf.enableCurrentLimit(true);
	}

	public void setSensorPhase(boolean phase)
	{
		rf.setSensorPhase(phase);
		lf.setSensorPhase(phase);
	}

	public void zeroEncoders()
	{
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
		//drive.driveArcade(Math.copySign(Math.pow(throttle, 2), throttle), Math.copySign(Math.pow(wheel, 2), wheel));
		drive.driveArcade(throttle * 0.8, wheel* 0.8);
	}

	public void setPID(double P, double I, double D, double F)
	{
		lf.config_kF(0, F, 10);

		lf.config_kP(0, P, 10);//change back just checking something

		lf.config_kI(0, I, 10);

		lf.config_kD(0, D, 10);

		rf.config_kF(0, F, 10);

		rf.config_kP(0, P, 10);

		rf.config_kI(0, I, 10);
		rf.config_kD(0, D, 10);

	}

	public void setSetpointDrive(double setpointinches)
	{
		lf.set(ControlMode.Position, inchToEncoder(setpointinches));
		rf.set(ControlMode.Position, inchToEncoder(setpointinches));
	}

	public void setSetpointTurn(double setpointdegrees)
	{
		zeroEncoders();

		System.out.println("setpoint: " + degreesToEncoder(setpointdegrees));

		lf.set(ControlMode.Position, -degreesToEncoder(setpointdegrees));
		rf.set(ControlMode.Position, degreesToEncoder(setpointdegrees));
	}

	public void enableRamp()
	{
		lf.configOpenloopRamp(.075, 0);
		rf.configOpenloopRamp(.075, 0);

	}

	public void disableRamp()
	{
		lf.configOpenloopRamp(0, 0);
		rf.configOpenloopRamp(0, 0);

	}

	public double degreesToEncoder(double degrees)
	{
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	public boolean onTarget()
	{
		if (Math.abs(lf.getClosedLoopError(0)) <= allowedErrorRange && Math.abs(rf.getClosedLoopError(0)) <= allowedErrorRange)
		{
			onTargetCounter++;
			System.out.println(onTargetCounter);
		}
		else
		{
			System.out.println(onTargetCounter);
			onTargetCounter = 0;
		}

		if (maxLoopNumber <= onTargetCounter)
		{
			System.out.println(onTargetCounter);

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

		this.maxLoopNumber = maxLoopNumber;
	}

	public double inchToEncoder(double inches)
	{
		System.out.println((inches / RobotMap.wheelCir) * 4096);
		return (inches / RobotMap.wheelCir) * 4096;
	}

	public void updateEncoders()
	{

//		if (logging)
//		{
//			log.print(lf.getSelectedSensorPosition(0) + "," + lf.getSelectedSensorVelocity(0) + "," + lf.getMotorOutputPercent() + "," + rf.getSelectedSensorPosition(0) + "," + rf.getSelectedSensorVelocity(0) + ","
//					+ rf.getMotorOutputPercent());
//			log.println("");
//		}
		
		SmartDashboard.putNumber("Right Encoder", rf.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Encoder", lf.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Right Enc VEL", rf.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("Left Enc VEL", lf.getSelectedSensorVelocity(0));
	}

	public void effectiveDriveArcade(double throttle, double wheel)
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

	// public BulldogMotionProfile leftTrack;
	// public BulldogMotionProfile rightTrack;
	//
	// public void setMotionProfile()
	// {
	// leftTrack.set();
	// rightTrack.set();
	//
	// }

	public void MotionProfile()
	{
		lf.changeMotionControlFramePeriod(5);
		rf.changeMotionControlFramePeriod(5);
	}

	// public boolean isFinished()
	// {
	// return leftTrack.isFinished();
	// }

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
		Motors.append(" lfMotorCurrent= " + lf.getOutputCurrent());
		Motors.append(" lfMotorVoltage = " + lf.getMotorOutputVoltage());

		lf.set(ControlMode.PercentOutput, 0);// set to 0

		Timer.delay(2);// wait before starting other motor

		lb.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append(" lbMotorCurrent= " + lb.getOutputCurrent());
		Motors.append(" lbMotorVoltage = " + lb.getMotorOutputVoltage());

		lb.set(ControlMode.PercentOutput, 0);

		Timer.delay(2);// wait before starting other motor

		rf.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append(" rfMotorCurrent= " + rf.getOutputCurrent());
		Motors.append(" rfMotorVoltage = " + rf.getMotorOutputVoltage());

		rf.set(ControlMode.PercentOutput, 0);

		Timer.delay(2);

		Timer.delay(2);

		rb.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append(" rbMotorCurrent= " + rb.getOutputCurrent());
		Motors.append(" rbMotorVoltage = " + rb.getMotorOutputVoltage());

		rb.set(ControlMode.PercentOutput, 0);
		Motors.toString();
	}

	// public void DisabledMotionProfile()// probably want new name
	// {
	// lf.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
	// // status 10 provides the trajectory target for motion profile AND motion magic
	// lf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	// rf.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
	// rf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	// }

	@Override
	protected void initDefaultCommand()
	{
		setDefaultCommand(new DriveCommand());
	}

	public void printEnc()
	{
		System.out.println(" leftPosition " + lf.getSelectedSensorPosition(0) + " rightPosition " + rf.getSelectedSensorPosition(0) + " rightVelocity " + rf.getSelectedSensorVelocity(0) + " leftVelocity " + lf.getSelectedSensorVelocity(0));
		System.out.println(" leftTragPos " + lf.getActiveTrajectoryPosition() + " leftTragVel " + lf.getActiveTrajectoryPosition());

		System.out.println(" RightTragPos " + rf.getActiveTrajectoryPosition() + " RightTragVel " + rf.getActiveTrajectoryVelocity());

	}
}
