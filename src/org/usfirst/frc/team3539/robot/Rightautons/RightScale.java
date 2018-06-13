package org.usfirst.frc.team3539.robot.Rightautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleRightThenSwitch;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftScaleAutonAndSwitch;
import org.usfirst.frc.team3539.robot.profiles.Dave;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightScale extends CommandGroup
{
	public RightScale()
	{
		try
		{
			if (Robot.gameData.charAt(1) == 'R')
			{
				addSequential(new AutonRightScaleRightThenSwitch());
			}
			
			else
			{
				addSequential(new RightToLeftScaleAutonAndSwitch());
				
				//dave // half field 
				//addSequential(new AutonMotionProfileEx(Dave.PointsR, Dave.PointsL, Dave.kNumPoints,true));
				
			}
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}
	}
}