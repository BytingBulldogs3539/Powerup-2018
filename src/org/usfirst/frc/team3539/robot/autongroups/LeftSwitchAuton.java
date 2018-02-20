package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDriveCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileCommand;
import org.usfirst.frc.team3539.robot.commands.PitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.test;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitchAuton extends CommandGroup
{
	public LeftSwitchAuton()
	{
		addSequential(new AutonMotionProfileCommand(test.PointsL, test.PointsR, test.kNumPoints));
		addParallel(new ElevatorPositionCommand(25));
		addParallel(new PitchCommand(90));

		// depending how we want to drop cube
		addSequential(new AutonIntakeCommand(-1, 1));// addSequential(new IntakeSolenoidCommand());

	}
}
