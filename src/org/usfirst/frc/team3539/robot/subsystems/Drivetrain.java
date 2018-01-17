package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	TalonSRX lf, lb, rf, rb;

	public Drivetrain(String name, boolean isEnabled) {
		// super(name, isEnabled);

		// gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

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

		lf.configPeakOutputForward(.5, 1);
		lf.configPeakOutputReverse(0, 1);
		rf.configPeakOutputForward(.5, 1);
		rf.configPeakOutputReverse(0, 1);

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


	}

	public void driveTrain(double motor1, double motor2) {

		lf.set(ControlMode.PercentOutput, motor1);
		rf.set(ControlMode.PercentOutput, motor2);
		lb.set(ControlMode.PercentOutput, motor1);
		rb.set(ControlMode.PercentOutput, motor2);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
