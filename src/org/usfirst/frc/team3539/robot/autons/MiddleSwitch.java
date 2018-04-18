package org.usfirst.frc.team3539.robot.autons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleSwitch extends CommandGroup
{

	public MiddleSwitch()
	{
		// Ran when auton starts to select which direction the robot goes while in the center position.
		try
		{
			if ((Robot.gameData.charAt(0) == 'L'))
			{
				addSequential(new MidSwitchLeft());
			}
			else
			{
				addSequential(new MidSwitchRight());
			}
		}
		catch (Exception e)
		{

		}
	}
}
