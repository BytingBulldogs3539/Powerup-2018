package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftLeftScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.LeftReverseCube;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.RightReverseCube;
import org.usfirst.frc.team3539.robot.profiles.RightRightScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.ScaleReverse;
import org.usfirst.frc.team3539.robot.profiles.ShortScale;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;
import org.usfirst.frc.team3539.robot.profiles.forwardscale;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonLeftScaleLeftThenScale extends CommandGroup
{

	// Currently not used.

	public AutonLeftScaleLeftThenScale()
	{
		addParallel(new AutonElevatorArm(73, 45,2,0));
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, .4));
		addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));
		addParallel(new AutonElevatorArm(30,100,0,0));// change to 0 when confident 
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
		
		
		//go get second cube 
		addParallel(new AutonIntakeCommand(.7, 1.5));
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonWaitCommand(.4));
		
		addParallel(new AutonElevatorArm(30, 45,0,3));//73

		addSequential(new AutonMotionProfileEx(LeftReverseCube.PointsR, LeftReverseCube.PointsL, LeftReverseCube.kNumPoints));

//go to scale again
		addSequential(new AutonMotionProfileEx(ShortScale.PointsR, ShortScale.PointsL, ShortScale.kNumPoints));
		
		addSequential(new IntakeSolenoidCommand());

		//addSequential(new AutonIntakeCommand(-.6, 1));
		addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));


	
	}
}
