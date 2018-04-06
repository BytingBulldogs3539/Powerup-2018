package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.ClimbCommand;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climb extends Subsystem
{
	private TalonSRX ClimbMotor;
	

	public Climb()
	{
		ClimbMotor = new TalonSRX(RobotMap.climbMotor);
		ClimbMotor.setNeutralMode(NeutralMode.Brake);


	}

	public void setMotorPower(double power)
	{
		ClimbMotor.set(ControlMode.PercentOutput, power);
	}
	
	

	public void initDefaultCommand()
	{
		setDefaultCommand(new ClimbCommand());

		
	}
}
