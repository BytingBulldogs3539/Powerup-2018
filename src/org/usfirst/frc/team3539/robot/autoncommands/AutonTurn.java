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
		requires(Robot.driveTrain);
		this.degrees = degrees;
	}

	protected void initialize()
	{
		Robot.driveTrain.zeroEnc();
		Robot.driveTrain.setSetpointTurn(degrees);
		System.out.println(degrees);
		
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.lonTarget()||Robot.driveTrain.ronTarget();
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
