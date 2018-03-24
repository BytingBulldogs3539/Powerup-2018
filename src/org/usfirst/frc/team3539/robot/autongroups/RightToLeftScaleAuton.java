package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleTurnReverse;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.RightToLeftScale;
import org.usfirst.frc.team3539.robot.profiles.RightToLeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.ScaleReverse;
import org.usfirst.frc.team3539.robot.profiles.Straight533;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToLeftScaleAuton extends CommandGroup
{

	public RightToLeftScaleAuton()
	{
//		
	//addSequential( new AutonElevatorArm(70,45));
		//addParallel(new AutonExtakeIntake(9));
		addParallel(new AutonElevatorArm(70, 40,4.3,0));
		addSequential(new AutonMotionProfileEx(RightToLeftScale.PointsR,RightToLeftScale.PointsL,RightToLeftScale.kNumPoints));
	//	addSequential( new AutonElevatorArm(70,45,0));
		addSequential(new AutonWaitCommand(1));
		addSequential(new AutonIntakeCommand(-1,1));
		
		//turn and go to second cube 
		addSequential(new AutonMotionProfileEx(LeftScaleTurnReverse.PointsR, LeftScaleTurnReverse.PointsL, LeftScaleTurnReverse.kNumPoints));
		addSequential(new AutonElevatorArm(0,100,0,0));
	//	addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));
//		

		

	//	addSequential(new AutonMotionProfileEx(ScaleReverse.PointsR,ScaleReverse.PointsL,ScaleReverse.kNumPoints));
//		addSequential(new AutonElevatorArm(0,90));
//		addSequential(new AutonMotionProfileEx(LeftSwitchForwardCube.PointsR,LeftSwitchForwardCube.PointsL,LeftSwitchForwardCube.kNumPoints));
//		//addParallel(new AutonIntakeCommand(1,15));
//		addParallel(new AutonWaitElevator(30,.5));
//		addParallel(new AutonIntakeCommand(1,3));
//		addSequential(new IntakeSolenoidCommand());
		


		
		
//
//		addParallel(new AutonElevatorCommand(30));
//		addSequential(new AutonIntakeCommand(1,2));



		//addParallel(new AutonElevatorCommand(30));
		//addParallel(new AutonIntakeCommand(1,2));
		
	}
}
