package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftManual extends Command
{

	public LiftManual()
	{
		requires(Robot.elevator);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		Robot.elevator.setMotorPower(Robot.oi.two.getLeftStickY());
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return !Robot.oi.two.buttonSTART.get();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.elevator.setMotorPower(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
