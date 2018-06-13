package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.DaveScale;
import org.usfirst.frc.team3539.robot.profiles.LeftLeftScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.LeftReverseCube;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;
import org.usfirst.frc.team3539.robot.profiles.LeftStraightCube;
import org.usfirst.frc.team3539.robot.profiles.Reverse1000;
import org.usfirst.frc.team3539.robot.profiles.ShortScale;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonLeftScaleLeftThenScale extends CommandGroup
{
	// Currently not used.

	public AutonLeftScaleLeftThenScale()
	{
		// dave
//		addParallel(new AutonElevatorArm(73, 45, 3, 8));
//		addSequential(new AutonMotionProfileEx(DaveScale.PointsR, DaveScale.PointsL, DaveScale.kNumPoints,true));
//		addSequential(new AutonIntakeCommand(-1, .4));
					
		//real
		addParallel(new AutonElevatorArm(73, 45, 2, 0));
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-1, .4));
		addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));
		addParallel(new AutonElevatorArm(0, 100, 0, 0));// first one change to 0 when confident, 30 for test
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonWaitCommand(.4));

		addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));

		// go get second cube
		addParallel(new AutonIntakeCommand(.7, 1.5));
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonWaitCommand(.4));

		addParallel(new AutonElevatorArm(70, 45, 0, 3));// 73

		addSequential(new AutonMotionProfileEx(LeftReverseCube.PointsR, LeftReverseCube.PointsL, LeftReverseCube.kNumPoints));

		// go to scale again
		addSequential(new AutonMotionProfileEx(ShortScale.PointsR, ShortScale.PointsL, ShortScale.kNumPoints));

		addSequential(new IntakeSolenoidCommand());

		// addSequential(new AutonIntakeCommand(-.6, 1));
		addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));
	}
}
