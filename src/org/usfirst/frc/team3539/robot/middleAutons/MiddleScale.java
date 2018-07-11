package org.usfirst.frc.team3539.robot.middleAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRightAndScale;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleScale extends CommandGroup {

    public MiddleScale() {
    	if ((Robot.gameData.charAt(0) == 'L'))
		{
			addSequential(new MidSwitchRightAndScale());//TODO fix
		}
		else
		{
			addSequential(new MidSwitchRightAndScale());
		}
	}
    }

