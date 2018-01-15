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

	private TalonSRX intakeMotor1;
	private TalonSRX intakeMotor2;

	public Intake()
	{
		intakeMotor1 = new TalonSRX(RobotMap.intakeMotorTalon1);
		intakeMotor2 = new TalonSRX(RobotMap.intakeMotorTalon2);
	}

	public void setMotorPower(double power)
	{
		intakeMotor1.set(ControlMode.PercentOutput, power);
		intakeMotor2.set(ControlMode.PercentOutput, power);
	}

	public void initDefaultCommand()
	{
	}

}
