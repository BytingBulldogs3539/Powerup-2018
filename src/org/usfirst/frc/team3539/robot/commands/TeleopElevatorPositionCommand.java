package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TeleopElevatorPositionCommand extends Command {
	double myinches;
	// public ElevatorPositionCommand(ElevatorPosition position)
	// {
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

	public TeleopElevatorPositionCommand(double inches) {
		requires(Robot.elevator);


		Robot.elevator.setPID(SmartDashboard.getNumber("elevatorPea", RobotMap.elevatorPea),
			SmartDashboard.getNumber("elevatorEye", RobotMap.elevatorEye),
		SmartDashboard.getNumber("elevatorDee", RobotMap.elevatorDee),
		SmartDashboard.getNumber("elevatorFFF", RobotMap.elevatorFFF));
		

		myinches = inches;

		Robot.elevator.setupOnTarget(250, 10);
		setTimeout(3);

	}

	protected void initialize() {
		Robot.elevator.setSetpointLift(myinches);
	}

	protected void execute() {
//	System.out.println();
		System.out.println("pid target "+Robot.elevator.inchToEncoder(myinches));
		System.out.println("encoder "+Robot.elevator.getEncoder());

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return Robot.elevator.onTarget() || isTimedOut();
	}

	protected void end() {
		System.out.println("End");
		// new ElevatorManualCommand();
	}

	protected void interrupted() {
		System.out.println("Interupt Elevator Pos");
		end();
	}

}
