package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RangeCommand extends Command
{

	public RangeCommand()
	{
		requires(Robot.rangeSystem);
	}

	protected void initialize()
	{
		
	}

	protected void execute()
	{
		System.out.println(Robot.rangeSystem.getDistance());
	}

	protected boolean isFinished()
	{
		return true;
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
		end();
	}
}
