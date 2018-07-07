package org.usfirst.frc.team3539.robot.middleAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Middle extends CommandGroup {

    public Middle() {
    	if ((Robot.gameData.charAt(0) == 'L'))
		{
			addSequential(new MidSwitchRight());//TODO fix
		}
		else
		{
			addSequential(new MidSwitchRight());
		}
	}
    }

