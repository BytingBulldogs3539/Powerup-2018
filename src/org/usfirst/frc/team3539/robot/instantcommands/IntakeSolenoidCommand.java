package org.usfirst.frc.team3539.robot.instantcommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */

public class IntakeSolenoidCommand extends InstantCommand
{
	public IntakeSolenoidCommand()
	{
	}

	protected void initialize()
	{
		Robot.solenoids.intakeSol.toggle();
	}
}
