package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeCommand extends Command
{
	double power;

	public IntakeCommand(double power)
	{
		requires(Robot.intake);
		this.power = power;
	}

	protected void initialize()
	{
		Robot.intake.setMotorPower(power);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
		end();
	}
}
