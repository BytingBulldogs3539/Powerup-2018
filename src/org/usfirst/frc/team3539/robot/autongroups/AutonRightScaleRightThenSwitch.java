package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.commands.TeleopElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.RightReverseCube;
import org.usfirst.frc.team3539.robot.profiles.RightRightScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.RightScaleToLeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.Straight533;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;
import org.usfirst.frc.team3539.robot.profiles.TwoCubeReverse;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonRightScaleRightThenSwitch extends CommandGroup
{

	public AutonRightScaleRightThenSwitch()
	{
		System.out.println("RightScale started---------------");
		addParallel(new AutonElevatorArm(73, 45, 1.8, 0));
		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 1));
		addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));
		

		// if lines up
		if (Robot.gameData.charAt(0) == 'R')
		{
//			addParallel(new AutonElevatorArm(30, 100, 0, 0));// change 30 to zero when confidentt
//			addSequential(new IntakeSolenoidCommand());
//			addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
//			addParallel(new AutonIntakeCommand(.5, 1));
//			addSequential(new IntakeSolenoidCommand());
//			addSequential(new AutonWaitCommand(.5));
//			// puts cube in switch
//			addSequential(new TeleopElevatorPositionCommand(30));
//			addSequential(new AutonMotionProfileEx(Straight533.PointsR, Straight533.PointsL, Straight533.kNumPoints));
//			addSequential(new AutonIntakeCommand(-1, 1));

		}
		else 
		{
			
//			addParallel(new AutonElevatorArm(30,100,0,0));// change to 0
//			addSequential(new IntakeSolenoidCommand());
//		//	addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
//
//			addParallel(new AutonIntakeCommand(.7, 1.5));
//			addSequential(new IntakeSolenoidCommand());
//			addSequential(new AutonWaitCommand(.4));
//			
//			//addParallel(new AutonElevatorArm(73, 45,0,3));

		//	addSequential(new AutonMotionProfileEx(RightReverseCube.PointsR, RightReverseCube.PointsL, RightReverseCube.kNumPoints));

	//go to scale again
//			addSequential(new AutonMotionProfileEx(ShortScale.PointsR, ShortScale.PointsL, ShortScale.kNumPoints));
//			
//			addSequential(new IntakeSolenoidCommand());
	//
//			addSequential(new AutonIntakeCommand(-.6, 1));
			//addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));
//do scale again
			
		}
		

	}
}
