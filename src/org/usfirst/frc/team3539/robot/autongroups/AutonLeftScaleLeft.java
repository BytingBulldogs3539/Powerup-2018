package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;

import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonLeftScaleLeft extends CommandGroup
{

	// Currently not used.

	public AutonLeftScaleLeft()
	{
		addParallel(new AutonElevatorArm(75, 45));
		addParallel(new AutonIntakeCommand(.4, 1));
<<<<<<< HEAD
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR,LeftScaleLeft.PointsL,LeftScaleLeft.kNumPoints));
	addSequential(new AutonIntakeCommand(-.5,2)); // shoot
	addSequential(new AutonWaitCommand(1));
	addSequential(new AutonMotionProfileEx(LeftSwitchReverse.PointsR,LeftSwitchReverse.PointsL,LeftSwitchReverse.kNumPoints));


		//	addParallel(new AutonExtakeIntake(3.2));

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
=======
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2)); // shoot
		addSequential(new AutonWaitCommand(1));
		addSequential(new AutonMotionProfileEx(LeftSwitchReverse.PointsR, LeftSwitchReverse.PointsL, LeftSwitchReverse.kNumPoints));
>>>>>>> 19b22d74ca6e974dcd9f8ddef79c0dd556335c38
	}
}
