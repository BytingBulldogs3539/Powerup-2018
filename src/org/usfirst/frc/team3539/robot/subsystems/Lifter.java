package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem
{
	TalonSRX l1liftMotor = new TalonSRX(RobotMap.l1LifterMotor);
	TalonSRX l2liftMotor = new TalonSRX(RobotMap.l2LifterMotor);
	TalonSRX r1liftMotor = new TalonSRX(RobotMap.r1LifterMotor);
	TalonSRX r2liftMotor = new TalonSRX(RobotMap.r2LifterMotor);

	public void initDefaultCommand()
	{

	}

	public void upLift(double speed)
	{
		l1liftMotor.set(ControlMode.PercentOutput, speed);
		l2liftMotor.set(ControlMode.PercentOutput, speed);
		r1liftMotor.set(ControlMode.PercentOutput, speed);
		r2liftMotor.set(ControlMode.PercentOutput, speed);
	}

	public void downLift(double speed)
	{
		l1liftMotor.set(ControlMode.PercentOutput, -speed);
		l2liftMotor.set(ControlMode.PercentOutput, -speed);
		r1liftMotor.set(ControlMode.PercentOutput, -speed);
		r2liftMotor.set(ControlMode.PercentOutput, -speed);
	}

	public void stop()
	{
		l1liftMotor.set(ControlMode.PercentOutput, 0);
		l2liftMotor.set(ControlMode.PercentOutput, 0);
		r1liftMotor.set(ControlMode.PercentOutput, 0);
		r2liftMotor.set(ControlMode.PercentOutput, 0);
	}
}
