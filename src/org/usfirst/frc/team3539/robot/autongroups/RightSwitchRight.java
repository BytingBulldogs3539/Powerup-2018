package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.RightSwitch;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchRight extends CommandGroup
{

	public RightSwitchRight()
	{
		addParallel(new AutonElevatorArm(30, 90,0,3.2));
		addSequential(new AutonMotionProfileEx(RightSwitch.PointsR, RightSwitch.PointsL, RightSwitch.kNumPoints));
		addSequential(new AutonIntakeCommand(-.5, 1));

		addSequential(new AutonMotionProfileEx(RightSwitchReverse.PointsR, RightSwitchReverse.PointsL, RightSwitchReverse.kNumPoints));
		// second cube
		// addSequential(new AutonElevatorArm(0,90));
		// addSequential(new AutonMotionProfileEx(RightForwardCube.PointsR,RightForwardCube.PointsL,RightForwardCube.kNumPoints));
		// addParallel(new AutonWaitElevator(30,.5));
		// addParallel(new AutonIntakeCommand(1,3));
		// addSequential(new IntakeSolenoidCommand());
	}
}
