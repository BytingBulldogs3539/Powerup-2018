package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Utilizes Climbing subsystem to climb 
 */

public class ClimbCommand extends Command
{

	public ClimbCommand()
	{
		requires(Robot.climb);
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		double x = -Robot.oi.one.getRightTrigger() + (Robot.oi.one.getLeftTrigger());
		Robot.climb.setMotorPower(x);
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.climb.setMotorPower(0);
	}

	protected void interrupted()
	{
		end();
	}
}
