package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.switchRight2;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchRight2 extends CommandGroup
{

	public RightSwitchRight2()
	{
		addSequential(new AutonElevatorArm(30, 90,0,0));
		addParallel(new AutonExtakeIntake(3.2));
		addSequential(new AutonMotionProfileEx(switchRight2.PointsR, switchRight2.PointsL, switchRight2.kNumPoints));
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
