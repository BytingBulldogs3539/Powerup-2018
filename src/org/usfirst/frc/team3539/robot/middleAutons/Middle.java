package org.usfirst.frc.team3539.robot.middleAutons;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Middle extends CommandGroup {

    public Middle() {
    	if ((Robot.gameData.charAt(0) == 'L'))
		{
			addSequential(new MidSwitchLeft());
		}
		else
		{
			addSequential(new MidSwitchRight());
		}
	}
    }
}
