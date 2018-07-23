package org.usfirst.frc.team3539.robot.instantcommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ShiftSolenoidCommand extends InstantCommand
{
	public ShiftSolenoidCommand()
	{
		requires(Robot.solenoids);
	}

	protected void initialize()
	{
		Robot.solenoids.shifterSol.toggle();
	}
}
