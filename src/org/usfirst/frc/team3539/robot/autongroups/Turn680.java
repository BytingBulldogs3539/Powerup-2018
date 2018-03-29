package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.A680;
import org.usfirst.frc.team3539.robot.profiles.Cal100;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Turn680 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public Turn680()
	{

		addSequential(new AutonMotionProfileEx(A680.PointsR, A680.PointsL, A680.kNumPoints));
	}
}
