package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.RightReverseCube;
import org.usfirst.frc.team3539.robot.profiles.RightRightScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.ShortScale;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightDoubleScale extends CommandGroup
{

	public RightDoubleScale()
	{
		System.out.println("RightScale started---------------");
		addParallel(new AutonElevatorArm(73, 80, 1, 0));
		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints,true));
		addSequential(new AutonIntakeCommand(-1, .4));
		addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));
//		addParallel(new AutonElevatorArm(30, 110, 0, 0));// change to 0 when ready
//		addSequential(new IntakeSolenoidCommand());
//		addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
//
//		addParallel(new AutonIntakeCommand(1, 1.5));
//		addSequential(new IntakeSolenoidCommand());
		//addSequential(new AutonWaitCommand(.4));

	//	addParallel(new AutonElevatorArm(73, 80, 0, 3));

	//	addSequential(new AutonMotionProfileEx(RightReverseCube.PointsR, RightReverseCube.PointsL, RightReverseCube.kNumPoints));

		
		
		
		
		
		// go to scale again
	//	addSequential(new AutonMotionProfileEx(ShortScale.PointsR, ShortScale.PointsL, ShortScale.kNumPoints));

		// addSequential(new AutonIntakeCommand(-.4, 1));// shoot
	//	addSequential(new IntakeSolenoidCommand());

		// addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));

	}
}
