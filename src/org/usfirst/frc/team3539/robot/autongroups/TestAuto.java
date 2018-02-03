package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDrive;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnWheels;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWait;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TestAuto extends CommandGroup
{
	public TestAuto()
	{
		addSequential(new AutonDrive(60));
		addSequential(new AutonWait(2));
		addSequential(new AutonTurnWheels(-90, 3));
		addSequential(new AutonWait(2));
		addSequential(new AutonDrive(36));
	}
}
