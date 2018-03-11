package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleLeft;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.Reverse1000;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.SwitchLeft2;
import org.usfirst.frc.team3539.robot.profiles.switchRight2;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonLeftScaleLeft extends CommandGroup
{

	// Currently not used.

	public AutonLeftScaleLeft()
	{
		addParallel(new AutonElevatorArm(75, 45));
		addParallel(new AutonIntakeCommand(.4, 1));
		addSequential(new AutonMotionProfileEx(LeftScaleLeft.PointsR, LeftScaleLeft.PointsL, LeftScaleLeft.kNumPoints));
		addSequential(new AutonIntakeCommand(-1, 2)); // shoot
		addSequential(new AutonWaitCommand(1));
		addSequential(new AutonMotionProfileEx(LeftSwitchReverse.PointsR, LeftSwitchReverse.PointsL, LeftSwitchReverse.kNumPoints));
	}
}
