package org.usfirst.frc.team3539.robot.Rightautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleRightThenSwitch;
import org.usfirst.frc.team3539.robot.autongroups.RightSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftScaleAuton;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftSwitchAuton;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import org.usfirst.frc.team3539.robot.profiles.RightToLeftScale;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightRightScaleSwitchLeftScale extends CommandGroup
{

	public RightRightScaleSwitchLeftScale()
	{
		try
		{

			if (Robot.gameData.charAt(1) == 'R')
			{
				addSequential(new AutonRightScaleRightThenSwitch());

			}
			else if (Robot.gameData.charAt(0) == 'R')
			{
				addSequential(new RightSwitchRight());

			}
			else 
			{
				addSequential(new RightToLeftScaleAuton());

			}
	
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}

	}
}
