package RightAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRightToLeft;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.crosslinestraight;
import Profiles.getcube;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightScaleOrStraight extends CommandGroup {

    public RightScaleOrStraight() {
    	
    	if ((Robot.gameData.charAt(1) == 'R'))
		{
			addSequential(new ScaleRight());
		}
		else
		{
			addSequential(new AutonMotionProfileEx2(crosslinestraight.Points,crosslinestraight.kNumPoints,true));
		}
	}
    }

