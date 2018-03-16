package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ElevatorManualCommand extends Command
{

	public ElevatorManualCommand()
	{
		requires(Robot.elevator);
	}

	protected void initialize()
	{
		Robot.elevator.setPID(SmartDashboard.getNumber("elevatorPea", RobotMap.elevatorPea),
				SmartDashboard.getNumber("elevatorEye", RobotMap.elevatorEye),
				SmartDashboard.getNumber("elevatorDee", RobotMap.elevatorDee),
				SmartDashboard.getNumber("elevatorFFF", RobotMap.elevatorFFF));
		
		
	}

	protected void execute()
	{
		
		
//		if(Robot.oi.two.buttonY.get() && !dumb)
//		{
//			Robot.elevator.setSetpointLift(66.14);
//			dumb = !Robot.elevator.onTarget();
//		}
//		if(!dumb)
			Robot.elevator.setMotorPower((-Robot.oi.two.getLeftStickY()));//*.7));
		//System.out.println(Robot.elevator.getEncoder());
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		//Robot.elevator.setMotorPower(0);
	}

	protected void interrupted()
	{
		end();
	}
}
