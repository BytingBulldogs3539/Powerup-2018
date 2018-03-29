package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A600;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn600 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn600()
	{

		addSequential(new AutonMotionProfileEx(A600.PointsR, A600.PointsL, A600.kNumPoints));
	}
}
