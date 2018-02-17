package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ElevatorZeroCommand extends InstantCommand
{
	public ElevatorZeroCommand()
	{
		requires(Robot.elevator);
	}

	protected void initialize()
	{
		//Robot.elevator.zeroEncoders();
	}
}

