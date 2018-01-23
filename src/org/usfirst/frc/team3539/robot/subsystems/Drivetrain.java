package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem
{
	TalonSRX lf, lb, rf, rb;

	Drive drive;
	int error = 1000;

	public Drivetrain()
	{
		// gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

		lf = new TalonSRX(RobotMap.lf);
		lb = new TalonSRX(RobotMap.lb);
		rf = new TalonSRX(RobotMap.rf);
		rb = new TalonSRX(RobotMap.rb);

		lf.configPeakOutputForward(1, 1);
		lf.configPeakOutputReverse(-1, 1);
		rf.configPeakOutputForward(1, 1);
		rf.configPeakOutputReverse(-1, 1);

		lb.configPeakOutputForward(1, 1);
		lb.configPeakOutputReverse(-1, 1);
		rb.configPeakOutputForward(1, 1);
		rb.configPeakOutputReverse(-1, 1);

		lf.configNominalOutputForward(0, 1);
		rf.configNominalOutputForward(0, 1);
		lb.configNominalOutputForward(0, 1);
		rb.configNominalOutputForward(0, 1);

		lf.configNominalOutputReverse(0, 1);
		rf.configNominalOutputReverse(0, 1);
		lb.configNominalOutputReverse(0, 1);
		rb.configNominalOutputReverse(0, 1);

		drive = new Drive(rf, rb, lf, lb);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);

		// lf.configClosedloopRamp(1, 10);
		// rf.configClosedloopRamp(1, 10);

		lf.configAllowableClosedloopError(error, 0, 10);
		rf.configAllowableClosedloopError(error, 0, 10);
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

	public void setPID(double P, double I, double D)
	{
		lf.config_kP(0, P, 1);
		rf.config_kP(0, P, 1);
		lf.config_kI(0, I, 1);
		rf.config_kI(0, I, 1);
		lf.config_kD(0, D, 1);
		rf.config_kD(0, D, 1);
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

		System.out.println("lbcontrol" + lb.getControlMode());
		System.out.println("rbcontrol" + rb.getControlMode());
		lf.set(ControlMode.Position, degreesToEnc(setpointdegrees));
		rf.set(ControlMode.Position, degreesToEnc(setpointdegrees));
	}

	public double degreesToEnc(double degrees)
	{
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	public void stopDrive()
	{
		driveArcade(0, 0);
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

}
