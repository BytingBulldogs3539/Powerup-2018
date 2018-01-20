package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem 
{
	TalonSRX lf, lb, rf, rb;
	Drive drive;
	private ADXRS450_Gyro gyro;
	
	public Drivetrain(String name, boolean isEnabled)
	{
		gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
		//super(name, isEnabled);
		
		//gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

		lf = new TalonSRX(RobotMap.lf);
		lb = new TalonSRX(RobotMap.lb);
		rf = new TalonSRX(RobotMap.rf);
		rb = new TalonSRX(RobotMap.rb);
		

		lf.set(ControlMode.PercentOutput, 0);
		rf.set(ControlMode.PercentOutput, 0);
		
		//rf.changeControlMode(TalonControlMode.PercentVbus);
		// rbMotor.changeControlMode(TalonControlMode.PercentVbus);
		// lbMotor.changeControlMode(TalonControlMode.PercentVbus);
	
		//rb.changeControlMode(TalonControlMode.Follower);
		//lb.changeControlMode(TalonControlMode.Follower);

		rb.set(ControlMode.PercentOutput, 0);
		lb.set(ControlMode.PercentOutput, 0);
		lf.set(ControlMode.PercentOutput,0.0);
		rf.set(ControlMode.PercentOutput,0.0);
		// rbMotor.changeControlMode(TalonControlMode.PercentVbus);
		// lbMotor.changeControlMode(TalonControlMode.PercentVbus);
//******************
		rb.set(ControlMode.Follower,rf.getDeviceID());
		lb.set(ControlMode.Follower, lf.getDeviceID());
//*******************
		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		// rbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// lbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		lf.configNominalOutputForward(0, 0);
		lf.configNominalOutputReverse(0, 0);
		rf.configNominalOutputForward(0, 0);
		rf.configNominalOutputReverse(0, 0);

	
	
		lf.configPeakOutputForward(1, 0);
		lf.configPeakOutputReverse(-1, 0);
		rf.configPeakOutputForward(1, 0);
		rf.configPeakOutputReverse(-1, 0);
		lb.configPeakOutputForward(1, 0);
		lb.configPeakOutputReverse(-1, 0);
		rb.configPeakOutputForward(1, 0);
		rb.configPeakOutputReverse(-1, 0);
		rf.configContinuousCurrentLimit(35,0);
		lf.configContinuousCurrentLimit(35,0);
		lf.enableCurrentLimit(true);
		rf.enableCurrentLimit(true);

		lf.setNeutralMode(NeutralMode.Brake);
		rf.setNeutralMode(NeutralMode.Brake);
		drive = new Drive(rf,lf);
		
	}
	
	public void driveArcade(double forward, double rotate)
	{
		drive.driveArcade(forward, rotate);
	}
	public void stopDrive()
	{
		drive.driveArcade(0, 0);
	}

	public void setRight(double Power)
	{
		rf.set(ControlMode.PercentOutput, Power);
	}
	public void setLeft(double Power)
	{
		lf.set(ControlMode.PercentOutput, Power);
	}
	public int getREnc()
	{
		return rf.getSensorCollection().getPulseWidthPosition();
		
		
	}
	public int getLEnc()
	{
		return lf.getSensorCollection().getPulseWidthPosition();
	}
	
	public double getBalEnc()
	{
		return getLEnc()+getREnc()/2;
	}
	public double getGyro()
	{
		return gyro.getAngle();
	}
	public void zeroEncoder()
	{
		lb.setSelectedSensorPosition(0, 0, 10);
		rb.setSelectedSensorPosition(0, 0, 10);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
		
	}

}
