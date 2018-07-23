package RightAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRightToLeft;
import org.usfirst.frc.team3539.robot.autongroups.SwitchRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitch extends CommandGroup {

    public RightSwitch() {
    	if ((Robot.gameData.charAt(0) == 'R'))
		{
			addSequential(new SwitchRight());
		}
		else
		{
			addSequential(new ScaleRightToLeft());
		}
	}
    }

