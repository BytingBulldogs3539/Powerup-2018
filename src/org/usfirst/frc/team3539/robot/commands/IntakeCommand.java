package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * utilizes the intake subsystem to intake 
 * implemnts a 
 */
public class IntakeCommand extends Command
{

	public IntakeCommand()
	{
		requires(Robot.intake);
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		double intakeSpeed = -Robot.oi.two.getLeftTrigger() + Robot.oi.two.getRightTrigger();
		intakeSpeed = Math.copySign(Math.sqrt(Math.abs(intakeSpeed)), intakeSpeed); // applies a root function then copies the sign of the value prior to root
		intakeSpeed = Math.max(intakeSpeed, -.75);// caps the intaking speed to 75%
		
		Robot.intake.setMotorPower(intakeSpeed);
	
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.intake.setMotorPower(0);
	}

	protected void interrupted()
	{
		end();
	}
}
