package org.usfirst.frc.team3539.robot.Rightautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.RightDoubleScale;
import org.usfirst.frc.team3539.robot.autongroups.RightSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftSwitchAuton;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightRightSwitchScaleLeftSwitch extends CommandGroup
{
	public RightRightSwitchScaleLeftSwitch()
	{
		try
		{
			if (Robot.gameData.charAt(0) == 'R')
			{
				addSequential(new RightSwitchRight());
			}
			else if (Robot.gameData.charAt(1) == 'R')
			{
				addSequential(new RightDoubleScale());
			}
			else 
			{
				addSequential(new RightToLeftSwitchAuton());

				//addSequential(new RightToLeftSwitchAuton());
			}
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}
	}
}
