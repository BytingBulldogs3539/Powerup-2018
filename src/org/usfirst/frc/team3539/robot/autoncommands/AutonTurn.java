package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonTurn extends Command
{
	double degrees;
	public AutonTurn(double degrees) {
		requires(Robot.drivetrain);
		this.degrees=degrees;
    }

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.drivetrain.zeroEnc();
		Robot.drivetrain.setSetpointTurn(degrees);
		System.out.println(degrees);
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
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}
}
