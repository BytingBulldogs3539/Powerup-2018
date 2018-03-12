package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonCal100 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public AutonCal100()
	{

		addSequential(new AutonMotionProfileEx(Cal100.PointsR, Cal100.PointsL, Cal100.kNumPoints));
	}
}
