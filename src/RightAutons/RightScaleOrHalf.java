package RightAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRightToLeft;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.getcube;
import Profiles.righthalfcross;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightScaleOrHalf extends CommandGroup {

    public RightScaleOrHalf() {
    	
    	if ((Robot.gameData.charAt(1) == 'R'))
		{
			addSequential(new ScaleRight());
		}
		else
		{
			addSequential(new AutonMotionProfileEx2(righthalfcross.Points,righthalfcross.kNumPoints,true));
		}
	}
    }

