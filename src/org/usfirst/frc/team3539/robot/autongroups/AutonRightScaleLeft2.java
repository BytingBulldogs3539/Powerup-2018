package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.profiles.Reverse1000;
import org.usfirst.frc.team3539.robot.profiles.RightScaleLeft;


import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonRightScaleLeft2 extends CommandGroup
{

	public AutonRightScaleLeft2()
	{
		addParallel(new AutonElevatorArm(80, 45,0,0));
		addSequential(new AutonMotionProfileEx(RightScaleLeft.PointsR, RightScaleLeft.PointsL, RightScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2));
		addSequential(new AutonWaitCommand(1));
		addSequential(new AutonMotionProfileEx(Reverse1000.PointsR, Reverse1000.PointsL, Reverse1000.kNumPoints));

	}
}
