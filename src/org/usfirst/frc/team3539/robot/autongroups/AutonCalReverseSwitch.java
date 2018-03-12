package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonCalReverseSwitch extends CommandGroup
{

	// This auton drives 66 inches backwards (usually called after the scale auton).

	public AutonCalReverseSwitch()
	{

		addSequential(new AutonMotionProfileEx(LeftSwitchReverse.PointsR, LeftSwitchReverse.PointsL, LeftSwitchReverse.kNumPoints));

	}
}
