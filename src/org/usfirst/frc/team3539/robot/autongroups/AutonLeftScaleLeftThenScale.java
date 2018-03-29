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
import org.usfirst.frc.team3539.robot.profiles.ScaleReverse;
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
		addParallel(new AutonElevatorArm(35, 45,0,0));
		addParallel(new AutonIntakeCommand(.4, 1));
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2)); // shoot
		//addSequential(new AutonWaitCommand(1));
		addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));
//		addSequential(new AutonMotionProfileEx(forwardscale.PointsR, forwardscale.PointsL, forwardscale.kNumPoints));


		addParallel(new AutonElevatorArm(0,100,0,0));
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
		addParallel(new AutonIntakeCommand(.7,2.3));
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonWaitCommand(.5));
		addSequential(new AutonMotionProfileEx(LeftReverseCube.PointsR, LeftReverseCube.PointsL, LeftReverseCube.kNumPoints));
		addParallel(new AutonElevatorArm(73, 45,2,0));
//		
		//if lines up
//		addSequential(new AutonMotionProfileEx(StraightScale.PointsR, StraightScale.PointsL, StraightScale.kNumPoints));
//		addSequential(new AutonIntakeCommand(-1, 1));
	//	addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));


	
	}
}
