package org.usfirst.frc.team3539.robot.Leftautons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonLeftScaleLeftThenSwitch;
import org.usfirst.frc.team3539.robot.autongroups.LeftSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.LeftToRightSwich;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftLeftSwitchScaleRightSwitch extends CommandGroup
{
	public LeftLeftSwitchScaleRightSwitch()
	{
		System.out.println("Started leftleftswitchorscale");
		try
		{
			System.out.println("char at 0: " + Robot.gameData.charAt(0) + " char at 1: " + Robot.gameData);
			if (Robot.gameData.charAt(0) == 'L')
			{
				addSequential(new LeftSwitchLeft());
			}
			else if (Robot.gameData.charAt(1) == 'L')
			{
				addSequential(new AutonLeftScaleLeftThenSwitch());
			}
			else
			{
				addSequential(new LeftToRightSwich());
			}
		}
		catch (Exception e)
		{
			System.out.println("Catch");
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));

		}
	}
}
