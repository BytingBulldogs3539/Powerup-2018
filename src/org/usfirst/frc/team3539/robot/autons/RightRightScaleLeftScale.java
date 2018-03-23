package org.usfirst.frc.team3539.robot.autons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.RightSwitchRight2;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftScaleAuton;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftSwitchAuton;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightRightScaleLeftScale extends CommandGroup
{

	public RightRightScaleLeftScale()
	{
		try
		{

			if (Robot.gameData.charAt(1) == 'R')
			{
				addSequential(new AutonRightScaleRight());

			}
			
			else if (Robot.gameData.charAt(1) == 'L')
			{
				//addSequential(new RightToLeftSwitchAuton());
				addSequential(new RightToLeftScaleAuton());
				///addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
			}
	
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}

	}
}
