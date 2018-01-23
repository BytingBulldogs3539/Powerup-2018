package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonTurn extends Command
{
	double degrees;

	public AutonTurn(double degrees)
	{
		requires(Robot.drivetrain);
		this.degrees = degrees;
	}

	protected void initialize()
	{
		Robot.drivetrain.zeroEnc();
		Robot.drivetrain.setSetpointTurn(degrees);
		System.out.println(degrees);
		
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return Robot.drivetrain.lonTarget()||Robot.drivetrain.ronTarget();
	}

	protected void end()
	{
		System.out.println("end");
	}

	protected void interrupted()
	{
		end();
	}
}
