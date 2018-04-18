package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A640;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn640 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn640()
	{
		addSequential(new AutonMotionProfileEx(A640.PointsR, A640.PointsL, A640.kNumPoints));
	}
}
