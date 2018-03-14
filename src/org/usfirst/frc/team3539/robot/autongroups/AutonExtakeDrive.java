package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDriveSlow;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonExtakeDrive extends CommandGroup
{
	// Called to hold the box in around corners or turns in auton.

	public AutonExtakeDrive(double T1)
	{
		addSequential(new AutonDriveSlow(-.4, .5));

		//addSequential(new DriveExtake2(2));
		addSequential(new AutonIntakeCommand(-.4, T1));

//		addParallel(new AutonDriveSlow(-.4, 2));
//		addParallel(new AutonWaitCommand(3));
//		addSequential(new AutonIntakeCommand(-.4, T1));

		
	}
}
