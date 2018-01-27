package org.usfirst.frc.team3539.robot.autoncommands;

import edu.wpi.first.wpilibj.command.Command;

public class AutonWait extends Command
{
	double seconds;
	
	public AutonWait(double seconds)
	{
		this.seconds = seconds;
	}
	
	protected void initialize()
	{
		this.setTimeout(seconds);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return isTimedOut();
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
		end();
	}
}
