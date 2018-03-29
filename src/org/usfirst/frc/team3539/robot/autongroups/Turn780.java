package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A780;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn780 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn780()
	{

		addSequential(new AutonMotionProfileEx(A780.PointsR, A780.PointsL, A780.kNumPoints));
	}
}
