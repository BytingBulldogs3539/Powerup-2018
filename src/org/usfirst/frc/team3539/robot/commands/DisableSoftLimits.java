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

	protected void initialize()
	{
		Robot.pitch.shouldSoftLimit(false);
		Robot.elevator.shouldSoftLimit(false);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.elevator.shouldSoftLimit(true);
		Robot.elevator.zeroEncoders();
		Robot.pitch.zeroEncoder();
		Robot.pitch.enc = 0;
		Robot.pitch.setSetpointPitch(Robot.pitch.enc);
		Robot.pitch.zeroEncoder();
		
	}

	protected void interrupted()
	{
		end();
	}
}
