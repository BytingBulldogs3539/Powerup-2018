package LeftAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleLeft;
import org.usfirst.frc.team3539.robot.autongroups.ScaleLeftToRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRightToLeft;
import org.usfirst.frc.team3539.robot.autongroups.SwitchLeft;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSwitch extends CommandGroup {

    public LeftSwitch() {
    	if ((Robot.gameData.charAt(0) == 'L'))
		{
			addSequential(new SwitchLeft());
		}
		else
		{
			addSequential(new ScaleLeftToRight());
		}
	}
    }

