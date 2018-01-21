package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem
{
	private TalonSRX intakeMotorLeft;
	private TalonSRX intakeMotorRight;

	public Intake()
	{
		intakeMotorLeft = new TalonSRX(RobotMap.lIntakeMotor);
		intakeMotorRight = new TalonSRX(RobotMap.rIntakeMotor);
	}

	public void setMotorPower(double power)
	{
		intakeMotorLeft.set(ControlMode.PercentOutput, power);
		intakeMotorRight.set(ControlMode.PercentOutput, -power);
	}

	public void initDefaultCommand()
	{
	}
}
