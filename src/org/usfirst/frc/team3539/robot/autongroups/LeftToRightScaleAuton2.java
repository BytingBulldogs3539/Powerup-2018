package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftToRightScale;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftToRightScaleAuton2 extends CommandGroup
{

	public LeftToRightScaleAuton2()
	{
		// addSequential( new AutonElevatorArm(70,45));
		// addSequential( new AutonElevatorArm(70,45));
		// addParallel(new AutonExtakeIntake(9));
		addParallel(new AutonElevatorArm(73, 40, 4.3, 6));
		addSequential(new AutonMotionProfileEx(LeftToRightScale.PointsR, LeftToRightScale.PointsL, LeftToRightScale.kNumPoints,true));
		// addSequential( new AutonElevatorArm(70,45,0));
		addSequential(new AutonWaitCommand(1));
		addSequential(new IntakeSolenoidCommand());
		//addSequential(new AutonIntakeCommand(-1, 1));
		// second cube
		// addSequential(new AutonMotionProfileEx(Straight533.PointsR, Straight533.PointsL, Straight533.kNumPoints));
		// addSequential(new AutonElevatorArm(30,20,0,2));
		// addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));
		// addSequential( new AutonElevatorArm(30,40,0,0));
		// addSequential(new AutonIntakeCommand(-1,1));

		// addSequential(new AutonElevatorArm(0,90));
		// addSequential(new AutonMotionProfileEx(LeftSwitchForwardCube.PointsR,LeftSwitchForwardCube.PointsL,LeftSwitchForwardCube.kNumPoints));
		// //addParallel(new AutonIntakeCommand(1,15));
		// addParallel(new AutonWaitElevator(30,.5));
		// addParallel(new AutonIntakeCommand(1,3));
		// addSequential(new IntakeSolenoidCommand());

		//
		// addParallel(new AutonElevatorCommand(30));
		// addSequential(new AutonIntakeCommand(1,2));

		// addParallel(new AutonElevatorCommand(30));
		// addParallel(new AutonIntakeCommand(1,2));

	}
}
