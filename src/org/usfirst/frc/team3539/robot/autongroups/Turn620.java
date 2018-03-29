package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A620;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn620 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn620()
	{

		addSequential(new AutonMotionProfileEx(A620.PointsR, A620.PointsL, A620.kNumPoints));
	}
}
