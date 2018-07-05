package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchRight extends CommandGroup
{
	public MidSwitchRight()
	{
		addParallel( new AutonElevatorArm(30,90,0,4));
		//addSequential(new AutonMotionProfileEx2(MiddleLeft.PointsR,MiddleLeft.PointsL,MiddleLeft.kNumPoints));TODO: make new profiles
		addSequential(new AutonIntakeCommand(-.7, 1));
	//	TODO: make new profiles
		//addSequential(new AutonMotionProfileEx(MiddleLeft2.PointsR,MiddleLeft2.PointsL,MiddleLeft2.kNumPoints));
		addParallel( new AutonElevatorArm(0,110,0,0));// change to 0 when confident 
		addSequential( new AutonWaitCommand(0.10));
		addParallel( new AutonIntakeCommand(1, 5));
	//	TODO: make new profiles
		//addSequential(new AutonMotionProfileEx(LeftStraightCubeSwitch.PointsR,LeftStraightCubeSwitch.PointsL,LeftStraightCubeSwitch.kNumPoints));
		addParallel( new AutonElevatorArm(35,90,0,0));
	//	addSequential(new AutonMotionProfileEx(MiddleLeftPos.PointsR,MiddleLeftPos.PointsL,MiddleLeftPos.kNumPoints));
	//	addSequential(new AutonMotionProfileEx(StraightSwitch.PointsR,StraightSwitch.PointsL,StraightSwitch.kNumPoints));

		addSequential(new AutonIntakeCommand(-.7, 1));
	}
}