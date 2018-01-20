package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem 
{
	TalonSRX lf, lb, rf, rb;
	Drive drive;
	
	public Drivetrain(String name, boolean isEnabled)
	{
		lf = new TalonSRX(RobotMap.lf);
		lb = new TalonSRX(RobotMap.lb);
		rf = new TalonSRX(RobotMap.rf);
		rb = new TalonSRX(RobotMap.rb);

		lf.set(ControlMode.PercentOutput, 0);
		rf.set(ControlMode.PercentOutput, 0);

		// rf.changeControlMode(TalonControlMode.PercentVbus);
		// rbMotor.changeControlMode(TalonControlMode.PercentVbus);
		// lbMotor.changeControlMode(TalonControlMode.PercentVbus);
		// rb.changeControlMode(TalonControlMode.Follower);
		// lb.changeControlMode(TalonControlMode.Follower);

		rb.set(ControlMode.PercentOutput, 0);
		lb.set(ControlMode.PercentOutput, 0);

		// lf.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// rf.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// rbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// lbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);

		// lf.configOutputVoltage(0.0f, -0.0f);
		// lf.configPeakOutputVoltage(12.0f, -12.0f);
		// rf.configNominalOutputVoltage(0.0f, -0.0f);
		// rf.configPeakOutputVoltage(12.0f, -12.0f);

		lf.configPeakOutputForward(0, 1);
		lf.configPeakOutputReverse(-1, 1);
		rf.configPeakOutputForward(0, 1);
		rf.configPeakOutputReverse(-1, 1);

		lb.configPeakOutputForward(0, 1);
		lb.configPeakOutputReverse(-1, 1);
		rb.configPeakOutputForward(0, 1);
		rb.configPeakOutputReverse(-1, 1);

		// lf.configMaxOutputVoltage(12);
		// rf.configMaxOutputVoltage(12);
		// rf.setCurrentLimit(40);
		// lf.setCurrentLimit(40);

		lf.configNominalOutputForward(.5, 1);
		rf.configNominalOutputForward(.5, 1);
		lf.configContinuousCurrentLimit(35, 0);
		rf.configContinuousCurrentLimit(35, 0);

		lf.enableCurrentLimit(true);
		rf.enableCurrentLimit(true);
		drive = new Drive(rf,lf);
	}
	
	public void driveArcade(double forward, double rotate)
	{
		System.out.println(forward+" "+rotate);
		drive.driveArcade(forward, rotate);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
		
	}

	public void stopDrive()
	{
		// TODO Auto-generated method stub
		driveArcade(0,0);
	}

}
