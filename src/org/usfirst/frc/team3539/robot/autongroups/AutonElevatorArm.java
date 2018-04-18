package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.commands.TeleopElevatorPositionCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonElevatorArm extends CommandGroup
{

	// Called to move the elevator and the pitch at the same time in auton.

	public AutonElevatorArm(double elevatorPos, int pitchPos,double time,double intakeTime)
	{
		addSequential(new AutonWaitCommand(time));
		addParallel(new AutonIntakeCommand(.4, intakeTime));
		addParallel(new TeleopElevatorPositionCommand(elevatorPos));
		addSequential(new AutonPitchCommand(pitchPos));
	}
}
