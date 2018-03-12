package org.usfirst.frc.team3539.robot.autons;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveStraightAuton extends CommandGroup
{
	// This auton drives straight to the autoline

	public DriveStraightAuton()
	{
		addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
	}
}
