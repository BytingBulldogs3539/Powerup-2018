package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem
{
	TalonSRX lOne, lTwo, rOne, rTwo;

	public Elevator()
	{
		lOne = new TalonSRX(RobotMap.l1LifterMotor);
		lTwo = new TalonSRX(RobotMap.l2LifterMotor);
		rOne = new TalonSRX(RobotMap.r1LifterMotor);
		rTwo = new TalonSRX(RobotMap.r2LifterMotor);
	}

	public void setMotorPower(double speed)
	{
		lOne.set(ControlMode.PercentOutput, speed);
		lTwo.set(ControlMode.PercentOutput, speed);
		rOne.set(ControlMode.PercentOutput, -speed);
		rTwo.set(ControlMode.PercentOutput, -speed);
	}

	public void initDefaultCommand()
	{

	}
}
