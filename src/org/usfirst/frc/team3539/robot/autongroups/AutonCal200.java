package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.profiles.cal200;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonCal200 extends CommandGroup
{
	// This auton drives 200 inches (Mainly for tuning PID).

	public AutonCal200()
	{
		addSequential(new AutonMotionProfileEx(cal200.PointsR, cal200.PointsL, cal200.kNumPoints));
	}
}
