package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command
{

	public DriveCommand()
	{
		requires(Robot.driveTrain);
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		Robot.driveTrain.effectiveArcadeDrive(Robot.m_oi.one.getLeftStickY(), -Robot.m_oi.one.getRightStickX());
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.driveTrain.driveArcade(0, 0);
	}

	protected void interrupted()
	{
		end();
	}
}