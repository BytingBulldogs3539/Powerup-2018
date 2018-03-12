package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.RightTurnNewtest;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonCal50 extends CommandGroup
{

	// This auton drives 50 inches (Mainly for tuning PID).

	public AutonCal50()
	{

		addSequential(new AutonMotionProfileEx(RightTurnNewtest.PointsR, RightTurnNewtest.PointsL, RightTurnNewtest.kNumPoints));
	}
}
