package org.usfirst.frc.team3539.robot.Rightautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonElevatorArm;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.RightSwitchRight2;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftScaleAuton;
import org.usfirst.frc.team3539.robot.autongroups.RightToLeftSwitchAuton;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import org.usfirst.frc.team3539.robot.profiles.RightReverseSpin;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.Straight533;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitch extends CommandGroup
{

	public RightSwitch()
	{
		try
		{

			if (Robot.gameData.charAt(0) == 'R')
			{
				addSequential(new RightSwitchRight2());
			}
		
			else 
			{

				addSequential(new RightToLeftSwitchAuton());
			}
		
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));

		}

	}
}
