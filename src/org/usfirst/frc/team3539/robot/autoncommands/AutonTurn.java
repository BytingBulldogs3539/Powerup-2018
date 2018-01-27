package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
		Robot.driveTrain.setPID(SmartDashboard.getNumber("P", 0), SmartDashboard.getNumber("I", 0), SmartDashboard.getNumber("D", 0),SmartDashboard.getNumber("F", 0));

		Robot.driveTrain.zeroEnc();
		Robot.driveTrain.setSetpointTurn(degrees);
		System.out.println(degrees);
		
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.onTarget();
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
