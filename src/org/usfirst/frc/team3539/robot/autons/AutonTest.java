package org.usfirst.frc.team3539.robot.autons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.autongroups.AutonElevatorArm;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.commands.TeleopElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.MidRightReverse;
import org.usfirst.frc.team3539.robot.profiles.MiddleRight;
import org.usfirst.frc.team3539.robot.profiles.RightReverseSpin;
import org.usfirst.frc.team3539.robot.profiles.RightRightScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.RightScaleToLeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.Straight533;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;
import org.usfirst.frc.team3539.robot.profiles.StraightSwitchCube;
import org.usfirst.frc.team3539.robot.profiles.TwoCubeReverse;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonTest extends CommandGroup
{

	public AutonTest()
	{
		System.out.println("RightScale started---------------");
		addParallel(new AutonElevatorArm(73, 45,2,0));
		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 1));
		addSequential(new AutonMotionProfileEx(RightRightScaleTurn.PointsR, RightRightScaleTurn.PointsL, RightRightScaleTurn.kNumPoints));
		
		addParallel(new AutonElevatorArm(0,100,0,0));

		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonMotionProfileEx(RightScaleToLeftSwitch.PointsR, RightScaleToLeftSwitch.PointsL, RightScaleToLeftSwitch.kNumPoints));
		addParallel(new AutonIntakeCommand(.7,2.3));
		addSequential(new AutonWaitCommand(.5));

		addSequential(new IntakeSolenoidCommand());
		

		
//cubetwo
		addParallel(new AutonIntakeCommand(.7,2));
		addSequential(new IntakeSolenoidCommand());
		addSequential(new AutonWaitCommand(.5));
		addSequential( new AutonElevatorArm(30,100,0,00));
	addParallel(new TeleopElevatorPositionCommand(30));
	addSequential(new AutonMotionProfileEx(Straight533.PointsR, Straight533.PointsL, Straight533.kNumPoints));
		addSequential(new AutonIntakeCommand(-1,1));
//		addSequential(new AutonMotionProfileEx(TwoCubeReverse.PointsR, TwoCubeReverse.PointsL, TwoCubeReverse.kNumPoints));
//		addSequential(new IntakeSolenoidCommand());
//		addParallel( new AutonElevatorArm(30,90,0,0));
//		addSequential(new AutonMotionProfileEx(MiddleRight.PointsR,MiddleRight.PointsL,MiddleRight.kNumPoints));
//		addSequential(new AutonIntakeCommand(-.7, 1));
//		addSequential(new AutonMotionProfileEx(MidRightReverse.PointsR,MidRightReverse.PointsL,MidRightReverse.kNumPoints));
//		addSequential(new IntakeSolenoidCommand());
//		addParallel(new AutonElevatorArm(0,100,0,0));
//		addSequential(new AutonMotionProfileEx(StraightSwitchCube.PointsR,StraightSwitchCube.PointsL,StraightSwitchCube.kNumPoints) );
//		addParallel(new AutonIntakeCommand(.5,1));
//		addSequential(new IntakeSolenoidCommand());

		
		
		
		
		
		
		
		
		
		
//		addParallel(new AutonElevatorArm(70, 45,2.5,0));
//		addParallel(new AutonIntakeCommand(.4, 1));
//		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints));
////	addSequential(new AutonElevatorArm(70, 45));
//
//		addSequential(new AutonIntakeCommand(-1, 2));
//		addSequential(new AutonElevatorArm(30,70,0,0));
//		//addSequential(new AutonMotionProfileEx(RightReverseSpin.PointsR, RightReverseSpin.PointsL, RightReverseSpin.kNumPoints));
//		addSequential(new AutonMotionProfileEx(Straight533.PointsR, Straight533.PointsL, Straight533.kNumPoints));
//		addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));

		
		// Ran when auton starts to select which direction the robot goes while in the center position.
		

	}
}
