package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A720;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn720 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn720()
	{

		addSequential(new AutonMotionProfileEx(A720.PointsR, A720.PointsL, A720.kNumPoints));
	}
}
