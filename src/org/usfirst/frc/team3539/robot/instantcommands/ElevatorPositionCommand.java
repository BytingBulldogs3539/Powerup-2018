package org.usfirst.frc.team3539.robot.instantcommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ElevatorPositionCommand extends InstantCommand
{
	double myinches;
	// public ElevatorPositionCommand(ElevatorPosition position)
	// {
	// requires(Robot.elevator);
	//
	// Robot.elevator.setSetpointLift(position);
	// Robot.elevator.setPID(SmartDashboard.getNumber("elevatorPea",
	// RobotMap.elevatorPea), SmartDashboard.getNumber("elevatorEye",
	// RobotMap.elevatorEye),
	// SmartDashboard.getNumber("elevatorDee",
	// RobotMap.elevatorDee),SmartDashboard.getNumber("elevatorFFF",
	// RobotMap.elevatorFFF));
	//
	// }

	public ElevatorPositionCommand(double inches)
	{
		Robot.elevator.setPID(SmartDashboard.getNumber("elevatorPea", RobotMap.elevatorPea), SmartDashboard.getNumber("elevatorEye", RobotMap.elevatorEye), SmartDashboard.getNumber("elevatorDee", RobotMap.elevatorDee),
				SmartDashboard.getNumber("elevatorFFF", RobotMap.elevatorFFF));
		myinches = inches;
		requires(Robot.elevator);

		Robot.elevator.setupOnTarget(100, 10);
	}

	protected void initialize()
	{
		Robot.elevator.setSetpointLift(myinches);
	}
}
