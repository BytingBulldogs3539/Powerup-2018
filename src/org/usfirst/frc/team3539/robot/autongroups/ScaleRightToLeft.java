package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
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
public class ScaleRightToLeft extends CommandGroup
{
	public ScaleRightToLeft()
	{
	//	addParallel( new AutonElevatorArm(70,80, 4,3));
//		addSequential(new AutonMotionProfileEx2(firstcrossR.Points,firstcrossR.kNumPoints,true));
//		addSequential(new AutonIntakeCommand(-.4, .35));
//		addSequential(new IntakeSolenoidCommand());
//		addSequential(new AutonTurnGyroCommand(-150,3));
//		addParallel(new AutonElevatorArm(0,105,0,5));
//		addSequential(new AutonWaitCommand(.25));
//		addSequential(new AutonMotionProfileEx2(mpswitch3cube2.Points,mpswitch3cube2.kNumPoints,true));
//		addSequential(new IntakeSolenoidCommand());
//		addParallel(new AutonIntakeCommand(1,5));
//		
//		addSequential(new AutonWaitCommand(.2));
//		addSequential(new AutonTurnGyroCommand(-185,3));
//		addParallel( new AutonElevatorArm(80,90,0,3));
//		addSequential(new AutonWaitCommand(.2));
//		addSequential(new AutonMotionProfileEx2(mpswitch3cube2.Points,mpswitch3cube2.kNumPoints,true));
//		addSequential(new IntakeSolenoidCommand());
//
//		
//
//		addParallel( new AutonElevatorArm(70,90, 4,3));
//		addSequential(new AutonMotionProfileEx2(RightToLeft.Points,RightToLeft.kNumPoints,true));
//		addSequential(new AutonIntakeCommand(-.8, 1));
//
//		
//		
////		
////		addSequential(new IntakeSolenoidCommand());
////		addSequential(new AutonTurnEncoderCommand(97, 1));
////		addParallel( new AutonElevatorArm(0,105, 0,3));
////		addSequential(new AutonWaitCommand(.7));
////		


//	addSequential(new AutonMotionProfileEx2(getcube.Points,getcube.kNumPoints,true));
//	addSequential(new IntakeSolenoidCommand());
//	addParallel(new AutonIntakeCommand(1,1));
//	addSequential(new AutonWaitCommand(.7));
//	addParallel( new AutonElevatorArm(70,90, 0,3));
//
//	addSequential(new AutonTurnEncoderCommand(-160, 1));
//
//	addSequential(new AutonMotionProfileEx2(secondscale.Points,secondscale.kNumPoints,true));
//	addSequential(new IntakeSolenoidCommand());



	

		
	}
}