package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
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
		intakeSpeed = Math.max(intakeSpeed, -.6);
		Robot.intake.setMotorPower(Math.copySign(Math.sqrt(Math.abs(intakeSpeed)), intakeSpeed));
	
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
