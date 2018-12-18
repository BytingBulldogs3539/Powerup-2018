package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnGyroCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;

import NewAndImproved.AutonMotionProfileEx2;
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
public class ScaleRight extends CommandGroup
{
	public ScaleRight()
	{
	
		addParallel( new AutonElevatorArm(75,90, 1.5,3));
		addSequential(new AutonMotionProfileEx2(firstscale.Points,firstscale.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-.8, 1));
		addSequential(new IntakeSolenoidCommand());
		//addSequential(new AutonTurnEncoderCommand(97, 1));
		addSequential(new AutonTurnGyroCommand(150,3));
		addParallel( new AutonElevatorArm(0,105, 0,3));
		
		addSequential(new AutonWaitCommand(.7));
		


	addSequential(new AutonMotionProfileEx2(getcube.Points,getcube.kNumPoints,true));
	addSequential(new IntakeSolenoidCommand());
	addParallel(new AutonIntakeCommand(1,3));
	addSequential(new AutonWaitCommand(.7));
	addParallel( new AutonElevatorArm(70,90, 0,3));

	//addSequential(new AutonTurnEncoderCommand(-175, 1.25));
	addSequential(new AutonTurnGyroCommand(-125,3));

	addSequential(new AutonMotionProfileEx2(secondscale.Points,secondscale.kNumPoints,true));
	addSequential(new AutonIntakeCommand(-.38, 1));
	//addSequential(new IntakeSolenoidCommand());

	

		
	}
}