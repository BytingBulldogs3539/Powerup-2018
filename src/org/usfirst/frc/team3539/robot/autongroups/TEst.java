package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnGyroCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.LeftToRight;
import Profiles.RightSwitch;
import Profiles.RightSwitchReverse;
import Profiles.RightToLeft;
import Profiles.Scale3000;
import Profiles.firstscale;
import Profiles.getcube;
import Profiles.mScaleR;
import Profiles.mpswitch2;
import Profiles.mpswitch3cube2;
import Profiles.mpswitch4rev;
import Profiles.mpswitch5finish;
import Profiles.mptest;
import Profiles.reverse;
import Profiles.secondscale;
import Profiles.wtfbetter;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TEst extends CommandGroup
{
	public TEst()
	{
	
		addSequential(new AutonTurnGyroCommand(90, 5));
		
		
		



	

		
	}
}