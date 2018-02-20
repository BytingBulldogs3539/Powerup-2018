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
		// effectiveArcadeDrive
		Robot.driveTrain.driveArcade(Robot.oi.one.getLeftStickY(), Robot.oi.one.getRightStickX());
		// Robot.driveTrain.printEnc();
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
		end();
	}
}