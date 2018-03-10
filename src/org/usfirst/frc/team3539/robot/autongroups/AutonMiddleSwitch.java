package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonMiddleSwitch extends CommandGroup
{

	public AutonMiddleSwitch()
	{
		
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
