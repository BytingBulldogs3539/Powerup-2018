package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisableSoftLimits extends Command
{

	public DisableSoftLimits()
	{

	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.pitch.shouldSoftLimit(false);
		Robot.elevator.shouldSoftLimit(false);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.elevator.shouldSoftLimit(true);
		Robot.elevator.zeroEncoders();
		Robot.pitch.zeroEncoder();
		Robot.pitch.enc = 0;
		Robot.pitch.setSetpointPitch(Robot.pitch.enc);
		Robot.pitch.zeroEncoder();
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
