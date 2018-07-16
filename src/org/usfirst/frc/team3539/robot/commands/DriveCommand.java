package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Utilizes the Drive subsystem to drive the robot
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
		Robot.driveTrain.driveArcade(Robot.oi.one.getLeftStickY(), Robot.oi.one.getRightStickX()*.8);
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
		System.out.println("DriveCommand Interupted!");
	}
}