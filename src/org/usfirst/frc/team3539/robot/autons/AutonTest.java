package org.usfirst.frc.team3539.robot.autons;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autongroups.AutonElevatorArm;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.profiles.RightReverseSpin;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.Straight533;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonTest extends CommandGroup
{

	public AutonTest()
	{
		addParallel(new AutonElevatorArm(70, 45));
		addParallel(new AutonIntakeCommand(.4, 1));
		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR, RightScaleRight.PointsL, RightScaleRight.kNumPoints));
//	addSequential(new AutonElevatorArm(70, 45));

		addSequential(new AutonIntakeCommand(-1, 2));
		addSequential(new AutonElevatorArm(30,70));
		//addSequential(new AutonMotionProfileEx(RightReverseSpin.PointsR, RightReverseSpin.PointsL, RightReverseSpin.kNumPoints));
		addSequential(new AutonMotionProfileEx(Straight533.PointsR, Straight533.PointsL, Straight533.kNumPoints));
		addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));

		
		// Ran when auton starts to select which direction the robot goes while in the center position.
		

	}
}
