package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorManualCommand extends Command
{

	public ElevatorManualCommand()
	{
		requires(Robot.elevator);
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		Robot.elevator.setMotorPower(-Robot.oi.two.getLeftStickY());
		//System.out.println(Robot.elevator.getEncoder());
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
