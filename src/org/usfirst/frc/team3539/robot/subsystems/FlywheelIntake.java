package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FlywheelIntake extends Subsystem
{
	TalonSRX lMotor, rMotor;

	public FlywheelIntake()
	{
		lMotor = new TalonSRX(RobotMap.lIntakeMotor);
		rMotor = new TalonSRX(RobotMap.rIntakeMotor);
	}

	public void setSpeed(int speed)
	{
		lMotor.set(ControlMode.PercentOutput, speed);
		rMotor.set(ControlMode.PercentOutput, speed);
	}

	public void initDefaultCommand()
	{
	}
}
