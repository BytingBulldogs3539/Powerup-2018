package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonRightScaleRight extends CommandGroup
{

	public AutonRightScaleRight()
	{
		System.out.println("RightScale started---------------");
		addParallel(new AutonElevatorArm(70, 45));
		addParallel(new AutonIntakeCommand(.4, 1));
		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2));
		addSequential(new AutonMotionProfileEx(RightSwitchReverse.PointsR, RightSwitchReverse.PointsL, RightSwitchReverse.kNumPoints));
	}
}
