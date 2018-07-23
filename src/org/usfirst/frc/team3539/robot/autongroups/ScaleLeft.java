package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnGyroCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.RightToLeft;
import Profiles.ScaleL;
import Profiles.firstscale;
import Profiles.firstscaleL;
import Profiles.getcube;
import Profiles.getcubeL;
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
public class ScaleLeft extends CommandGroup
{
	public ScaleLeft()
	{
		addParallel( new AutonElevatorArm(75,90, 1.5,3));
		addSequential(new AutonMotionProfileEx2(firstscaleL.Points,firstscaleL.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-.8, 1));
		addSequential(new IntakeSolenoidCommand());
		//addSequential(new AutonTurnEncoderCommand(97, 1));
		addSequential(new AutonTurnGyroCommand(-150,3));
		addParallel( new AutonElevatorArm(0,105, 0,3));
		
		addSequential(new AutonWaitCommand(.7));
		


	addSequential(new AutonMotionProfileEx2(getcubeL.Points,getcubeL.kNumPoints,true));
	addSequential(new IntakeSolenoidCommand());
	addParallel(new AutonIntakeCommand(1,1));
	addSequential(new AutonWaitCommand(.7));
	addParallel( new AutonElevatorArm(70,90, 0,3));

	//addSequential(new AutonTurnEncoderCommand(-175, 1.25));
	addSequential(new AutonTurnGyroCommand(130,3));

	addSequential(new AutonMotionProfileEx2(mpswitch3cube2.Points,mpswitch3cube2.kNumPoints,true));
	addSequential(new IntakeSolenoidCommand());

		
		
		
		
		
		
		/*   // OLD 2 CUBE LEFT
		
		addParallel( new AutonElevatorArm(75,90, 2,3));
		addSequential(new AutonMotionProfileEx2(ScaleL.Points,ScaleL.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-.8, 1));
		addSequential(new IntakeSolenoidCommand());
	//	addSequential(new AutonTurnEncoderCommand(-89, 1));
		addSequential(new AutonTurnGyroCommand(-90,3));
		addParallel( new AutonElevatorArm(0,105, 0,3));
	addSequential(new AutonWaitCommand(.7));
		


	addSequential(new AutonMotionProfileEx2(getcubeL.Points,getcubeL.kNumPoints,true));
	addSequential(new IntakeSolenoidCommand());
	addParallel(new AutonIntakeCommand(1,1));
	addSequential(new AutonWaitCommand(.7));
	addParallel( new AutonElevatorArm(70,90, 0,3));

	//addSequential(new AutonTurnEncoderCommand(150, 1));
	addSequential(new AutonTurnGyroCommand(150,3));
	addSequential(new AutonMotionProfileEx2(secondscale.Points,secondscale.kNumPoints,true));
	addSequential(new IntakeSolenoidCommand());

	
*/
		
	}
}