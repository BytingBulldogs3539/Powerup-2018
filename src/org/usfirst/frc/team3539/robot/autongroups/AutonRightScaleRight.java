package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.Reverse1000;
import org.usfirst.frc.team3539.robot.profiles.RightScaleRight;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.SwitchLeft2;
import org.usfirst.frc.team3539.robot.profiles.switchRight2;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonRightScaleRight extends CommandGroup
{

	public AutonRightScaleRight()
	{
		addParallel( new AutonElevatorArm(75,45));
		addParallel(new AutonIntakeCommand(.4, 1));

		addSequential(new AutonMotionProfileEx(RightScaleRight.PointsR,RightScaleRight.PointsL,RightScaleRight.kNumPoints));
	addSequential(new AutonIntakeCommand(-.5,2));
	addSequential(new AutonWaitCommand(1));
	addSequential(new AutonMotionProfileEx(RightSwitchReverse.PointsR,RightSwitchReverse.PointsL,RightSwitchReverse.kNumPoints));

	
		//	addParallel(new AutonExtakeIntake(3.2));

		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
