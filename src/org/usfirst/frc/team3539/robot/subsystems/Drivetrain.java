package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem
{
	TalonSRX lf, lb, rf, rb;

	public Drivetrain()
	{
		// gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
		
		lf = new TalonSRX(RobotMap.lf);
		lb = new TalonSRX(RobotMap.lb);
		rf = new TalonSRX(RobotMap.rf);
		rb = new TalonSRX(RobotMap.rb);

		lf.set(ControlMode.PercentOutput, 0);
		rf.set(ControlMode.PercentOutput, 0);

		rb.set(ControlMode.Follower, rf.getDeviceID());
		lb.set(ControlMode.Follower, lf.getDeviceID());

		// lf.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// rf.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// rbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		// lbMotor.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
		
		lf.configOpenloopRamp(2, 0);
		rf.configOpenloopRamp(2, 0);

		lf.configPeakOutputForward(.5, 1);
		lf.configPeakOutputReverse(0, 1);
		rf.configPeakOutputForward(.5, 1);
		rf.configPeakOutputReverse(0, 1);

		lf.configNominalOutputForward(.5, 1);
		rf.configNominalOutputForward(.5, 1);
		lf.configContinuousCurrentLimit(35, 0);
		rf.configContinuousCurrentLimit(35, 0);

		lf.enableCurrentLimit(true);
		rf.enableCurrentLimit(true);

	}

	public void drive(double left, double right)
	{
		lf.set(ControlMode.PercentOutput, left);
		rf.set(ControlMode.PercentOutput, right);
	}

	@Override
	protected void initDefaultCommand()
	{
	}

}
