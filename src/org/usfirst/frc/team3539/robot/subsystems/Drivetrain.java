package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteSystem;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteTalon;

public class Drivetrain extends ByteSystem 
{
	ByteTalon lf, lb, rf, rb;
	
	public Drivetrain(String name, boolean isEnabled)
	{
		super(name, isEnabled);
		
		//gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

		lf = new ByteTalon(this, RobotMap.lf,"lf");
		lb = new ByteTalon(this, RobotMap.lb,"lb");
		rf = new ByteTalon(this, RobotMap.rf,"rf");
		rb = new ByteTalon(this, RobotMap.rb,"rb");

		lf.changeControlMode(TalonControlMode.PercentVbus);
		rf.changeControlMode(TalonControlMode.PercentVbus);
		// rbMotor.changeControlMode(TalonControlMode.PercentVbus);
		// lbMotor.changeControlMode(TalonControlMode.PercentVbus);

		rb.changeControlMode(TalonControlMode.Follower);
		lb.changeControlMode(TalonControlMode.Follower);

		rb.set(rf.getDeviceID());
		lb.set(lf.getDeviceID());

		//lf.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		//rf.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// rbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// lbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);

		lf.configNominalOutputVoltage(0.0f, -0.0f);
		lf.configPeakOutputVoltage(12.0f, -12.0f);

		rf.configNominalOutputVoltage(0.0f, -0.0f);
		rf.configPeakOutputVoltage(12.0f, -12.0f);

		lf.configMaxOutputVoltage(12);
		rf.configMaxOutputVoltage(12);
		rf.setCurrentLimit(40);
		lf.setCurrentLimit(40);

		lf.EnableCurrentLimit(true);
		rf.EnableCurrentLimit(true);

		//drive = new RobotDrive(lfMotor, rfMotor);
		// drive = new RobotDrive(lfMotor, lbMotor, rfMotor, rbMotor);
		//drive.setSafetyEnabled(false);

		lf.setSafetyEnabled(false);
		rf.setSafetyEnabled(false);
		lb.setSafetyEnabled(false);
		rb.setSafetyEnabled(false);
	}
	
	public void driveArcade(double forward, double rotate)
	{
		
	}

}
