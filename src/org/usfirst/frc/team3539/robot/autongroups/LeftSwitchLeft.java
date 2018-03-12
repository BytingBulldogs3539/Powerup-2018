package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchLeftProfile;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSwitchLeft extends CommandGroup
{

	public LeftSwitchLeft()
	{
		//
		addSequential(new AutonElevatorArm(30, 90));
		addParallel(new AutonIntakeCommand(.7, 1));
		// addParallel(new AutonExtakeIntake(4));
		addSequential(new AutonMotionProfileEx(LeftSwitchLeftProfile.PointsR, LeftSwitchLeftProfile.PointsL, LeftSwitchLeftProfile.kNumPoints));
		addSequential(new AutonIntakeCommand(-.5, 1));

		addSequential(new AutonMotionProfileEx(LeftSwitchReverse.PointsR, LeftSwitchReverse.PointsL, LeftSwitchReverse.kNumPoints));
		// addSequential(new AutonElevatorArm(0,90));
		// addSequential(new AutonMotionProfileEx(LeftSwitchForwardCube.PointsR,LeftSwitchForwardCube.PointsL,LeftSwitchForwardCube.kNumPoints));
		// //addParallel(new AutonIntakeCommand(1,15));
		// addParallel(new AutonWaitElevator(30,.5));
		// addParallel(new AutonIntakeCommand(1,3));
		// addSequential(new IntakeSolenoidCommand());

		//
		// addParallel(new AutonElevatorCommand(30));
		// addSequential(new AutonIntakeCommand(1,2));

		// addParallel(new AutonElevatorCommand(30));
		// addParallel(new AutonIntakeCommand(1,2));

		addSequential(new AutonIntakeCommand(-1, 1));

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
