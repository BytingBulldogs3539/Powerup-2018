package org.usfirst.frc.team3539.robot.Leftautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonLeftScaleLeft;
import org.usfirst.frc.team3539.robot.autongroups.LeftSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.LeftToRightScaleAuton2;
import org.usfirst.frc.team3539.robot.autongroups.LeftToRightSwich;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftLeftSwitchScaleRightScale extends CommandGroup
{

	public LeftLeftSwitchScaleRightScale()
	{

		try
		{
			if (Robot.gameData.charAt(1) == 'L')
			{
				addSequential(new AutonLeftScaleLeft());

			}
			else if (Robot.gameData.charAt(0) == 'L')
			{
				addSequential(new LeftSwitchLeft());

			}
			else
			{
				addSequential(new LeftToRightScaleAuton2());
			}
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}

	}
}
