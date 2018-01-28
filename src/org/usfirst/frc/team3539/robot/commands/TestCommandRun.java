package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TestCommandRun extends Command
{

	public TestCommandRun()
	{
		requires(Robot.motor);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		System.out.println("Ran Command");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		Robot.motor.setMotor(1);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.motor.setMotor(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
