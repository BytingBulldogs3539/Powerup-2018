package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A800;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn800 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn800()
	{

		addSequential(new AutonMotionProfileEx(A800.PointsR, A800.PointsL, A800.kNumPoints));
	}
}
