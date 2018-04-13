package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonElevatorCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.MiddleRight;
import org.usfirst.frc.team3539.robot.profiles.MiddleRight2;
import org.usfirst.frc.team3539.robot.profiles.MiddleRightPos;
import org.usfirst.frc.team3539.robot.profiles.MiddleRightReverse;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;
import org.usfirst.frc.team3539.robot.profiles.StraightCubeReverse;
import org.usfirst.frc.team3539.robot.profiles.StraightCubeSwitch;
import org.usfirst.frc.team3539.robot.profiles.StraightSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchRight extends CommandGroup
{

	public MidSwitchRight()
	{
		addParallel( new AutonElevatorArm(30,90,0,4));
		addSequential(new AutonMotionProfileEx(MiddleRight.PointsR,MiddleRight.PointsL,MiddleRight.kNumPoints));
		addSequential(new AutonIntakeCommand(-.7, .4));
		
		addSequential(new AutonMotionProfileEx(MiddleRight2.PointsR,MiddleRight2.PointsL,MiddleRight2.kNumPoints));
		addParallel( new AutonElevatorArm(30,100,0,0));// change to 0 when confident 
		addSequential( new AutonWaitCommand(0.10));
		addParallel( new AutonIntakeCommand(1, 5));
		
		addSequential(new AutonMotionProfileEx(StraightCubeSwitch.PointsR,StraightCubeSwitch.PointsL,StraightCubeSwitch.kNumPoints));
		addParallel( new AutonElevatorArm(2,90,0,0));
		addSequential(new AutonMotionProfileEx(MiddleRightPos.PointsR,MiddleRightPos.PointsL,MiddleRightPos.kNumPoints));
		addSequential(new AutonMotionProfileEx(StraightSwitch.PointsR,StraightSwitch.PointsL,StraightSwitch.kNumPoints));

		addSequential(new AutonIntakeCommand(-.7, 1));


	//	addSequential(new IntakeSolenoidCommand());

//		addSequential(new AutonMotionProfileEx(MiddleRightReverse.PointsR,MiddleRightReverse.PointsL,MiddleRightReverse.kNumPoints));
//		addSequential (new IntakeSolenoidCommand());
//		addSequential( new AutonElevatorCommand(0));
//		
		
		//if lines up 
//		addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));
//		addSequential(new  AutonWaitCommand(.5));
//		addParallel(new AutonIntakeCommand(.7,1));
//
//		addSequential(new AutonMotionProfileEx(StraightCubeReverse.PointsR,StraightCubeReverse.PointsL,StraightCubeReverse.kNumPoints));
//		addParallel( new AutonElevatorArm(30,90,0,0));
//		addSequential(new AutonMotionProfileEx(MiddleRight.PointsR,MiddleRight.PointsL,MiddleRight.kNumPoints));
//		addSequential(new AutonIntakeCommand(-.7, 1));
//		
//	

	}
}
