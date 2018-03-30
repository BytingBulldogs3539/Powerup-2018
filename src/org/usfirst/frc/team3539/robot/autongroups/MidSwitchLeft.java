package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.profiles.MiddleLeft;
import org.usfirst.frc.team3539.robot.profiles.MiddleLeftReverse;
import org.usfirst.frc.team3539.robot.profiles.MiddleRight;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;
import org.usfirst.frc.team3539.robot.profiles.StraightCubeReverse;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchLeft extends CommandGroup
{

	public MidSwitchLeft()
	{
		addSequential( new AutonElevatorArm(30,90,0,0));
		addParallel(new AutonExtakeIntake(4));
		addSequential(new AutonMotionProfileEx(MiddleLeft.PointsR,MiddleLeft.PointsL,MiddleLeft.kNumPoints));
	//	addSequential(new AutonExtakeDrive(2));
		addSequential(new AutonIntakeCommand(-.7, 1));
		addSequential(new  AutonWaitCommand(1));
		addSequential(new AutonMotionProfileEx(MiddleLeftReverse.PointsR,MiddleLeftReverse.PointsL,MiddleLeftReverse.kNumPoints));

		
//		//if lines up 
//				addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));
//				addSequential(new  AutonWaitCommand(.5));
//				addParallel(new AutonIntakeCommand(.7,1));
//
//				addSequential(new AutonMotionProfileEx(StraightCubeReverse.PointsR,StraightCubeReverse.PointsL,StraightCubeReverse.kNumPoints));
//				addParallel( new AutonElevatorArm(30,90,0,0));
//				addSequential(new AutonMotionProfileEx(MiddleRight.PointsR,MiddleRight.PointsL,MiddleRight.kNumPoints));
//				addSequential(new AutonIntakeCommand(-.7, 1));
//	
	}
}
