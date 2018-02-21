package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDriveCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TestAuto extends CommandGroup
{
	public TestAuto()
	{
		addSequential(new AutonDriveCommand(100, 6));
		// addSequential(new AutonWaitCommand(2));
		// addSequential(new AutonTurnEncoderCommand(-90, 3));
		// addSequential(new AutonWaitCommand(2));
		// addSequential(new AutonDriveCommand(36, 6));
	}
}
