package org.usfirst.frc.team3539.robot.instantcommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.Elevator.ElevatorPosition;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ElevatorPositionCommand extends InstantCommand
{
	public ElevatorPositionCommand(ElevatorPosition position)
	{
		requires(Robot.elevator);

		Robot.elevator.setSetpointLift(position);
	}

	public ElevatorPositionCommand(double inches)
	{
		requires(Robot.elevator);

		Robot.elevator.setSetpointLift(inches);
	}

	protected void initialize()
	{
		Robot.elevator.setPID(RobotMap.elevatorPea, RobotMap.elevatorEye, RobotMap.ElevatorDee, RobotMap.elevatorFFF);
	}
}
