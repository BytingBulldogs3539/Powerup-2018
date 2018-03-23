package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;

import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;

import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.ScaleReverse;
import org.usfirst.frc.team3539.robot.profiles.forwardscale;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonLeftScaleLeft extends CommandGroup
{

	// Currently not used.

	public AutonLeftScaleLeft()
	{
		addParallel(new AutonElevatorArm(35, 45,0,0));
		addParallel(new AutonIntakeCommand(.4, 1));
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2)); // shoot
		//addSequential(new AutonWaitCommand(1));
		addSequential(new AutonMotionProfileEx(ScaleReverse.PointsR, ScaleReverse.PointsL, ScaleReverse.kNumPoints));
//		addSequential(new AutonMotionProfileEx(forwardscale.PointsR, forwardscale.PointsL, forwardscale.kNumPoints));

	
	
	}
}
