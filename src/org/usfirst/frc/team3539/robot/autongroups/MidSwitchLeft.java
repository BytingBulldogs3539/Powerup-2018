package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchLeft extends CommandGroup
{

	public MidSwitchLeft()
	{
		addParallel( new AutonElevatorArm());
		addParallel(new AutonExtakeIntake(2.2));
		addSequential(new AutonMotionProfileEx(LeftSwitch.PointsR,LeftSwitch.PointsL,LeftSwitch.kNumPoints));
		
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
