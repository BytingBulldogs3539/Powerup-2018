package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileCommand;

import org.usfirst.frc.team3539.robot.profiles.Straight8000;
import org.usfirst.frc.team3539.robot.profiles.cal200;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Straight315 extends CommandGroup
{

	public Straight315()
	{
		
		addSequential(new AutonMotionProfileCommand(Straight8000.PointsR, Straight8000.PointsL, Straight8000.kNumPoints));
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
