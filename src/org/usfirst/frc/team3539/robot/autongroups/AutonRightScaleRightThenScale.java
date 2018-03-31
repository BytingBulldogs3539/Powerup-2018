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
import org.usfirst.frc.team3539.robot.profiles.StraightScale;
import org.usfirst.frc.team3539.robot.profiles.TwoCubeReverse;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonRightScaleRightThenScale extends CommandGroup
{

	public AutonRightScaleRightThenScale()
	{
		System.out.println("RightScale started---------------");
		addParallel(new AutonElevatorArm(73, 45,2,0));
		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 1));
		addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));
//		
	
		addParallel(new AutonElevatorArm(30,20,0,0));
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
		addParallel(new AutonIntakeCommand(.7,2.3));
	//	addSequential(new IntakeSolenoidCommand());
		//addSequential(new AutonWaitCommand(.5));
		addSequential(new AutonMotionProfileEx(RightReverseCube.PointsR, RightReverseCube.PointsL, RightReverseCube.kNumPoints));
	//	addParallel(new AutonElevatorArm(73, 45,0,0));
//		
		//if lines up
		//addSequential(new AutonMotionProfileEx(StraightScale.PointsR, StraightScale.PointsL, StraightScale.kNumPoints));
	//	addSequential(new AutonIntakeCommand(-1, 1));
//		addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));


	}
}
