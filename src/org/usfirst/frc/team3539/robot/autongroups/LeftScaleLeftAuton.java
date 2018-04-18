package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftLeftScaleTurn;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftScaleLeftAuton extends CommandGroup
{
	// Currently not used.

	public LeftScaleLeftAuton()
	{
		addParallel(new AutonElevatorArm(73, 45, 2, 0));
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, .4));
		addSequential(new AutonMotionProfileEx(LeftLeftScaleTurn.PointsR, LeftLeftScaleTurn.PointsL, LeftLeftScaleTurn.kNumPoints));
		addParallel(new AutonElevatorArm(30, 100, 0, 0));// change to 0 when confident
		addSequential(new IntakeSolenoidCommand());
		// addSequential(new AutonMotionProfileEx(StraightCube.PointsR, StraightCube.PointsL, StraightCube.kNumPoints));
	}
}
