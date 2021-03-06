package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftStraightCubeSwitch;
import org.usfirst.frc.team3539.robot.profiles.MiddleLeft;
import org.usfirst.frc.team3539.robot.profiles.MiddleLeft2;
import org.usfirst.frc.team3539.robot.profiles.MiddleLeftPos;
import org.usfirst.frc.team3539.robot.profiles.StraightSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchLeft extends CommandGroup
{
	public MidSwitchLeft()
	{
		addParallel( new AutonElevatorArm(30,90,0,4));
		addSequential(new AutonMotionProfileEx(MiddleLeft.PointsR,MiddleLeft.PointsL,MiddleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-.7, 1));
		
		addSequential(new AutonMotionProfileEx(MiddleLeft2.PointsR,MiddleLeft2.PointsL,MiddleLeft2.kNumPoints));
		addParallel( new AutonElevatorArm(0,110,0,0));// change to 0 when confident 
		addSequential( new AutonWaitCommand(0.10));
		addParallel( new AutonIntakeCommand(1, 5));
		
		addSequential(new AutonMotionProfileEx(LeftStraightCubeSwitch.PointsR,LeftStraightCubeSwitch.PointsL,LeftStraightCubeSwitch.kNumPoints));
		addParallel( new AutonElevatorArm(35,90,0,0));
		addSequential(new AutonMotionProfileEx(MiddleLeftPos.PointsR,MiddleLeftPos.PointsL,MiddleLeftPos.kNumPoints));
		addSequential(new AutonMotionProfileEx(StraightSwitch.PointsR,StraightSwitch.PointsL,StraightSwitch.kNumPoints));

		addSequential(new AutonIntakeCommand(-.7, 1));
	}
}
