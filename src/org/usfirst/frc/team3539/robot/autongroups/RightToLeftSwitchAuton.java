package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.RightToLeftSwitch;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToLeftSwitchAuton extends CommandGroup
{
	public RightToLeftSwitchAuton()
	{
		addParallel(new AutonElevatorArm(30, 90, 0, 8)); // 30, 90, 2, 0
		addSequential(new AutonMotionProfileEx(RightToLeftSwitch.PointsR, RightToLeftSwitch.PointsL, RightToLeftSwitch.kNumPoints));
		addSequential(new AutonIntakeCommand(-.3, 1));
		addSequential(new AutonMotionProfileEx(RightSwitchReverse.PointsR, RightSwitchReverse.PointsL, RightSwitchReverse.kNumPoints));
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
	}
}
