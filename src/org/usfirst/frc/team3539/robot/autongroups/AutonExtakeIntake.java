package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonExtakeIntake extends CommandGroup
{

	// Called to hold the box in around corners or turns in auton.

	public AutonExtakeIntake(double T1)
	{
		addSequential(new AutonIntakeCommand(.4, T1));
	}
}
