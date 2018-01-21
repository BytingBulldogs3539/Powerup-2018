package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftCommand extends Command
{
	double power;
	
	public LiftCommand(double power)
	{
		requires(Robot.lifter);
		this.power = power;
	}

	protected void initialize()
	{
		Robot.lifter.lift(power);
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
		Robot.lifter.lift(0);
	}

	protected void interrupted()
	{
		end();
	}
}
