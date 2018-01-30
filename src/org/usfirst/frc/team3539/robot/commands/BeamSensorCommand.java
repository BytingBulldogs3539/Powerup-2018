package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class BeamSensorCommand extends Command
{
	public BeamSensorCommand()
	{
		requires(Robot.elevator);
	}

	protected void initialize()
	{
		System.out.println(Robot.elevator.isTriggered());
	}

	protected void execute()
	{
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
