package org.usfirst.frc.team3539.robot.Rightautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleRightThenScale;
import org.usfirst.frc.team3539.robot.autongroups.RightSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftScaleAutonAndSwitch;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightRightDoubleScaleOrRightSwitch extends CommandGroup
{
	public RightRightDoubleScaleOrRightSwitch()
	{
		try
		{
			if (Robot.gameData.charAt(1) == 'R')
			{
				addSequential(new AutonRightScaleRightThenScale());
			}
			else
			{
				addSequential(new RightToLeftScaleAutonAndSwitch());
			}
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}
	}
}
