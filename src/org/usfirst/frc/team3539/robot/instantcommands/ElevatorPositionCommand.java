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

	//This command does not have an is finished and does not need one due to the fact that we us pid to keep the elevator in position
	public ElevatorPositionCommand(double inches)
	{
		myinches = inches;
		requires(Robot.elevator);
		Robot.elevator.setupOnTarget(0, 10); //Set tollerance for pid to 0 because if it is more it jitters as it falls then enables the falls then enables etc.
	}

	protected void initialize()
	{
		Robot.elevator.setPID(SmartDashboard.getNumber("elevatorPea", RobotMap.elevatorPea), SmartDashboard.getNumber("elevatorEye", RobotMap.elevatorEye),
				SmartDashboard.getNumber("elevatorDee", RobotMap.elevatorDee),SmartDashboard.getNumber("elevatorFFF", RobotMap.elevatorFFF));
		
		Robot.elevator.setSetpointLift(myinches);
	}
}
