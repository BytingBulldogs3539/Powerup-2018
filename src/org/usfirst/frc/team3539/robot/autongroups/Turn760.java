package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A760;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn760 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn760()
	{

		addSequential(new AutonMotionProfileEx(A760.PointsR, A760.PointsL, A760.kNumPoints));
	}
}
