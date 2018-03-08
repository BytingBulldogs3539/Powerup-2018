package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftLeftSwitchOrLeftScale extends CommandGroup
{

	public LeftLeftSwitchOrLeftScale() {
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();

		if (gameData.charAt(0) == 'L')
		{
				addSequential(new LeftSwitchLeft());
		}
		else if(gameData.charAt(1)== 'L')
		{
			 	addSequential (new AutonLeftScaleLeft());
		}
   

    }
}
