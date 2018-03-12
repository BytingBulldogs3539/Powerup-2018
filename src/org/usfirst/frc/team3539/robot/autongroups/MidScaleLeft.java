package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.MiddleScaleLeft;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidScaleLeft extends CommandGroup
{

	public MidScaleLeft()
	{
		addParallel(new AutonElevatorArm(85, 45));
		addSequential(new AutonMotionProfileEx(MiddleScaleLeft.PointsR, MiddleScaleLeft.PointsL, MiddleScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2));

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
