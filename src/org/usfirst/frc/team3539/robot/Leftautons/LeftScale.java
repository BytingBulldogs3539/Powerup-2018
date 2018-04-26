package org.usfirst.frc.team3539.robot.Leftautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonLeftScaleLeftThenScale;
import org.usfirst.frc.team3539.robot.autongroups.LeftToRightScaleAuton2;
import org.usfirst.frc.team3539.robot.profiles.Dave;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import org.usfirst.frc.team3539.robot.profiles.LeftDave;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftScale extends CommandGroup
{
	public LeftScale()
	{
		try
		{
			if (Robot.gameData.charAt(1) == 'L')
			{
				addSequential(new AutonLeftScaleLeftThenScale());

			}
	
			else
			{
				//dave
				//addSequential(new AutonMotionProfileEx(LeftDave.PointsR, LeftDave.PointsL, LeftDave.kNumPoints,true));

				addSequential(new LeftToRightScaleAuton2());
			}
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
		}
	}
}
