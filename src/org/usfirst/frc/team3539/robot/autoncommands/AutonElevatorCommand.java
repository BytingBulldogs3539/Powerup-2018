package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonElevatorCommand extends InstantCommand
{
	double myinches;
	// public ElevatorPositionCommand(ElevatorPosition position)
	// {
	// requires(Robot.elevator);
	//
	// Robot.elevator.setSetpointLift(position);

	
	// }

	public AutonElevatorCommand(double inches)
	{
		myinches = inches;
		requires(Robot.elevator);

		Robot.elevator.setupOnTarget(0, 10);
	}

	protected void initialize()
	{
		 Robot.elevator.setPID(SmartDashboard.getNumber("elevatorPea",
				 RobotMap.elevatorPea), SmartDashboard.getNumber("elevatorEye",
				 RobotMap.elevatorEye),
				 SmartDashboard.getNumber("elevatorDee",
				 RobotMap.elevatorDee),SmartDashboard.getNumber("elevatorFFF",
				 RobotMap.elevatorFFF));
		Robot.elevator.setSetpointLift(myinches);	
	}
}
