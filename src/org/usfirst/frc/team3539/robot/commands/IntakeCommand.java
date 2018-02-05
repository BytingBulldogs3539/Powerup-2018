package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class IntakeCommand extends InstantCommand
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
		Robot.intake.setMotorPower(0);
	}

	protected void interrupted()
	{
		end();
	}
}
