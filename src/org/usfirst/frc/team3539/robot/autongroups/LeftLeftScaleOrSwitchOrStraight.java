package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonGameDataCheck;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftLeftScaleOrSwitchOrStraight extends CommandGroup
{

	public LeftLeftScaleOrSwitchOrStraight()
	{

		addSequential(new AutonGameDataCheck());
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
				addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));
			}
		}
		catch (Exception e)
		{
			addSequential(new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints));

		}

	}
}
