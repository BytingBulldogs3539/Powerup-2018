package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;

import NewAndImproved.AutonMotionProfileEx2;
import Profiles.mLeft;
import Profiles.mRight;
import Profiles.mpswitch2;
import Profiles.mpswitch3cube2;
import Profiles.mptest;
import Profiles.reverse;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchLeft extends CommandGroup
{
	public MidSwitchLeft()
	{
		addParallel( new AutonElevatorArm(30,90,0,4.5));
		addSequential(new AutonMotionProfileEx2(mLeft.Points,mLeft.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-.7, 0.5));

		addSequential(new AutonMotionProfileEx2(mLeft.Points,mLeft.kNumPoints,false));
		//addParallel( new AutonElevatorArm(0,110,0,0));// change to 0 when confident   put back after test 
		addSequential(new IntakeSolenoidCommand());
		addSequential( new AutonWaitCommand(0.10));
		addParallel( new AutonIntakeCommand(.9, 2));


		addSequential(new AutonMotionProfileEx2(mpswitch3cube2.Points,mpswitch2.kNumPoints,true));
		addSequential(new IntakeSolenoidCommand());
		addSequential( new AutonWaitCommand(0.30));


		addParallel( new AutonElevatorArm(35,90,0,0));
		addSequential(new AutonMotionProfileEx2(mpswitch3cube2.Points,mpswitch2.kNumPoints,false));
		addSequential(new AutonMotionProfileEx2(mLeft.Points,mLeft.kNumPoints,true));

		addSequential(new AutonIntakeCommand(-.7, 1));
	}
}