package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.RightSwitch;
import Profiles.RightSwitchReverse;
import Profiles.RightToLeft;
import Profiles.firstscale;
import Profiles.getcube;
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
public class SwitchRight extends CommandGroup
{
	public SwitchRight()
	{
	
		addParallel( new AutonElevatorArm(30,90, 0,3));
		addSequential(new AutonMotionProfileEx2(RightSwitch.Points,RightSwitch.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-.8, 1));
		addSequential(new IntakeSolenoidCommand());
		
		
		addSequential(new AutonMotionProfileEx2(RightSwitchReverse.Points,RightSwitchReverse.kNumPoints,true));
		addParallel( new AutonElevatorArm(0,105, 0,3));
		addSequential(new AutonWaitCommand(.7));
		



	

		
	}
}