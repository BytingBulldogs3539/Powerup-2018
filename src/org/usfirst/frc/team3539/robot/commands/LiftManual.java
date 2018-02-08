package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftManual extends Command
{

	public LiftManual()
	{
		requires(Robot.elevator);
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		Robot.elevator.setMotorPower(Robot.oi.two.getLeftStickY());
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.elevator.setMotorPower(0);
	}

	protected void interrupted()
	{
		end();
	}
}
