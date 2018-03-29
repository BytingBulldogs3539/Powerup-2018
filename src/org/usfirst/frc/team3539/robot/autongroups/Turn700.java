package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A700;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn700 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn700()
	{

		addSequential(new AutonMotionProfileEx(A700.PointsR, A700.PointsL, A700.kNumPoints));
	}
}
