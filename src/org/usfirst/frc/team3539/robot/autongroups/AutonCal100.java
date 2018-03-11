package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.Cal100;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchForwardCube;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.RightForwardCube;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.SwitchLeft2;
import org.usfirst.frc.team3539.robot.profiles.switchRight2;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonCal100 extends CommandGroup
{
	// This auton drives 100 inches (Mainly for tuning PID).

	public AutonCal100()
	{

		addSequential(new AutonMotionProfileEx(Cal100.PointsR, Cal100.PointsL, Cal100.kNumPoints));
	}
}
