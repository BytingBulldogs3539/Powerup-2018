package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

@SuppressWarnings("unused")
public class ClimbCommand extends Command
{
	private double speed = 0;

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
		// System.out.println("climbing power"+x);
	//	System.out.println("climb speed" + x);
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
	}
}
