package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDriveCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DefaultAuton extends CommandGroup
{

	public DefaultAuton()
	{
		addSequential(new AutonDriveCommand(30, 2));
		addSequential(new AutonTurnEncoderCommand(45, 20));
		addSequential(new AutonDriveCommand(54, 3));
		addSequential(new AutonTurnEncoderCommand(-45, 20));
		addSequential(new AutonDriveCommand(48, 3));
		addSequential(new AutonPitchCommand(3750));
		addSequential(new AutonWaitCommand(1));
		addSequential(new AutonIntakeCommand(1, 2));
		

	}
}
