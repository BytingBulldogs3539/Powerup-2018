package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A740;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn740 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn740()
	{
		addSequential(new AutonMotionProfileEx(A740.PointsR, A740.PointsL, A740.kNumPoints));
	}
}
