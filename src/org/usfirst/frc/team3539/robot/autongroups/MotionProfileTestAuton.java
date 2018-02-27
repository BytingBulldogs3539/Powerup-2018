package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team3539.robot.profiles.GeneratedMotionProfile;
import org.usfirst.frc.team3539.robot.profiles.cal;

/**
 *
 */
public class MotionProfileTestAuton extends CommandGroup
{

	public MotionProfileTestAuton()
	{
		addSequential(new AutonMotionProfileCommand(cal.PointsL, cal.PointsR, cal.kNumPoints));

	}
}
