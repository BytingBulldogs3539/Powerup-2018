package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonWaitElevator extends CommandGroup
{
	public AutonWaitElevator(double elevatorPos, double wait)
	{
		addSequential(new AutonWaitCommand(wait));
		addSequential(new ElevatorPositionCommand(elevatorPos));
	}
}
