package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonElevatorArm extends CommandGroup
{

	// Called to move the elevator and the pitch at the same time in auton.

	public AutonElevatorArm(double elevatorPos, int pitchPos)
	{
		addParallel(new ElevatorPositionCommand(elevatorPos));
		addSequential(new AutonPitchCommand(pitchPos));
	}
}
