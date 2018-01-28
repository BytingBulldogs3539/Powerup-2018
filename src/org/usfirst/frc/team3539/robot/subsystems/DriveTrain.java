package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem
{
	TalonSRX lf, lb, rf, rb, lm, rm;
	Drive drive;
	int error = 1000;
	WPI_TalonSRX talon;
	int loopAmount = 0;
	int loopCounter = 0;
	int allowedError = 0;

	public DriveTrain()
	{
		// gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

		lf = new TalonSRX(RobotMap.lf);
		rf = new TalonSRX(RobotMap.rf);

		lm = new TalonSRX(RobotMap.lm);
		rm = new TalonSRX(RobotMap.rm);

		lb = new TalonSRX(RobotMap.lb);
		rb = new TalonSRX(RobotMap.rb);



		lf.configPeakOutputForward(1, 10);
		lf.configPeakOutputReverse(-1, 10);

		rf.configPeakOutputForward(1, 10);
		rf.configPeakOutputReverse(-1, 10);

		rm.configPeakOutputForward(1, 10);
		rm.configPeakOutputReverse(-1, 10);

		lm.configPeakOutputForward(1, 10);
		lm.configPeakOutputReverse(-1, 10);

		lb.configPeakOutputForward(1, 10);
		lb.configPeakOutputReverse(-1, 10);

		rb.configPeakOutputForward(1, 10);
		rb.configPeakOutputReverse(-1, 10);

		lf.configNominalOutputForward(0, 10);
		rf.configNominalOutputForward(0, 10);
		lb.configNominalOutputForward(0, 10);
		rb.configNominalOutputForward(0, 10);

		lm.configNominalOutputForward(0, 10);
		rm.configNominalOutputForward(0, 10);
		lm.configNominalOutputReverse(0, 10);
		rm.configNominalOutputReverse(0, 10);

		lf.configNominalOutputReverse(0, 10);
		rf.configNominalOutputReverse(0, 10);
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

		// lf.configClosedloopRamp(1, 10);
		// rf.configClosedloopRamp(1, 10);

		lf.configAllowableClosedloopError(10, 0, 10);
		rf.configAllowableClosedloopError(10, 0, 10);
		
		setFollower();
		setInverted();
	}

	public void zeroEnc()
	{
		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		lf.getSensorCollection().setPulseWidthPosition(0, 10);
		rf.getSensorCollection().setPulseWidthPosition(0, 10);
		lf.setSelectedSensorPosition(lf.getSelectedSensorPosition(10), 0, 10);
		rf.setSelectedSensorPosition(rf.getSelectedSensorPosition(10), 0, 10);
	}

	public void setFollower()
	{
		lm.set(ControlMode.Follower, lf.getDeviceID());
		rm.set(ControlMode.Follower, rf.getDeviceID());
		lb.set(ControlMode.Follower, lf.getDeviceID());
		rb.set(ControlMode.Follower, rf.getDeviceID());
	}
	public void setInverted()
	{
		lf.setInverted(true);
		rf.setInverted(true);
		
		lm.setInverted(false);
		rm.setInverted(false);

		lb.setInverted(false);
		
		rb.setInverted(false);
	}

	public boolean lonTarget()
	{
		return false;
	}

	public boolean ronTarget()
	{
		return false;
	}

	public void driveArcade(double forward, double rotate)
	{
		drive.driveArcade(forward, rotate);
	}

	public void setPID(double P, double I, double D, double F)
	{
		lf.config_kF(0, F, 10);
		rf.config_kF(0, F, 10);
		lf.config_kP(0, P, 10);
		rf.config_kP(0, P, 10);
		lf.config_kI(0, I, 10);
		rf.config_kI(0, I, 10);
		lf.config_kD(0, D, 10);
		rf.config_kD(0, D, 10);
	}

	public void setSetpointDrive(double setpointinches)
	{
		zeroEnc();

		lb.set(ControlMode.Follower, RobotMap.lf);
		rb.set(ControlMode.Follower, RobotMap.rf);

		System.out.println("lbcontrol" + lb.getControlMode());
		System.out.println("rbcontrol" + rb.getControlMode());
		lf.set(ControlMode.Position, setpointinches);
		rf.set(ControlMode.Position, -setpointinches);
	}

	public void setSetpointTurn(double setpointdegrees)
	{
		zeroEnc();

		lb.set(ControlMode.Follower, RobotMap.lf);
		rb.set(ControlMode.Follower, RobotMap.rf);

		System.out.println("setpoint" + degreesToEnc(setpointdegrees));
		lf.set(ControlMode.Position, degreesToEnc(setpointdegrees));
		rf.set(ControlMode.Position, degreesToEnc(setpointdegrees));
	}

	public void DriveSpeed(double Velocity)
	{
		lb.set(ControlMode.Follower, RobotMap.lf);
		rb.set(ControlMode.Follower, RobotMap.rf);
		System.out.println("lbcontrol" + lb.getControlMode());
		System.out.println("rbcontrol" + rb.getControlMode());
		lf.set(ControlMode.Velocity, ftpsToEncps(Velocity));
		rf.set(ControlMode.Velocity, ftpsToEncps(-Velocity));
	}

	public double ftpsToEncps(double ftps)
	{

		return ftps * 394;
		// return ftps * 100.0;
	}

	public double degreesToEnc(double degrees)
	{
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	public void stopDrive()
	{
		driveArcade(0, 0);
	}

	public boolean onTarget()
	{
		if (lf.getClosedLoopError(0) <= allowedError && lf.getClosedLoopError(0) >= -allowedError && rf.getClosedLoopError(0) <= allowedError && rf.getClosedLoopError(0) >= -allowedError)
		{
			loopCounter++;
			System.out.println(loopCounter);
		}
		else
			loopCounter = 0;
		if (loopCounter >= loopAmount)
		{
			return true;
		}

		return false;
	}

	public void setLoopOnTarget(int LoopAmount)
	{
		loopAmount = LoopAmount;
	}

	public void setTargetAllowedError(int MotorTicks)
	{
		lf.configAllowableClosedloopError(0, MotorTicks, 10);
		rf.configAllowableClosedloopError(0, MotorTicks, 10);
		allowedError = MotorTicks;
	}

	public void zeroLoopCounter()
	{
		loopCounter = 0;
	}

	public double inchToEncoder(double inches)
	{
		return (inches / 12.56) * 4096;
	}

	@Override
	protected void initDefaultCommand()
	{
		setDefaultCommand(new DriveCommand());
	}

//	public void updateEnc()
//	{
//		SmartDashboard.putNumber("Right Enc", rf.getSelectedSensorPosition(0));
//		SmartDashboard.putNumber("Left Enc", lf.getSelectedSensorPosition(0));
//	}

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

}
