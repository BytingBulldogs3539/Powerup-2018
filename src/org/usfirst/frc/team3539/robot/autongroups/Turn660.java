package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A660;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn660 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn660()
	{
		addSequential(new AutonMotionProfileEx(A660.PointsR, A660.PointsL, A660.kNumPoints));
	}
}
