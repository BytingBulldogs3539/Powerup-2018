package LeftAutons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleLeft;
import org.usfirst.frc.team3539.robot.autongroups.ScaleLeftToRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.ScaleRightToLeft;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.crosslinestraight;
import Profiles.getcube;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftScaleOrStraight extends CommandGroup {

    public LeftScaleOrStraight() {
    	
    	if ((Robot.gameData.charAt(1) == 'L'))
		{
			addSequential(new ScaleLeft());
		}
		else
		{
			addSequential(new AutonMotionProfileEx2(crosslinestraight.Points,crosslinestraight.kNumPoints,true));
		}
	}
    }
