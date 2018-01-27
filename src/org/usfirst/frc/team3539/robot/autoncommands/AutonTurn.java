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

	public AutonTurn(double degrees,double seconds)
	{
		requires(Robot.driveTrain);
		this.degrees = degrees;
		this.setTimeout(seconds);
	}

	protected void initialize()
	{
		Robot.driveTrain.stopDrive();
		Robot.driveTrain.setPID(SmartDashboard.getNumber("TurnP", 0), SmartDashboard.getNumber("TurnI", 0), SmartDashboard.getNumber("TurnD", 0),SmartDashboard.getNumber("TurnF", 0));
		Robot.driveTrain.setTargetAllowedError(500);
		Robot.driveTrain.setLoopOnTarget(20);
		Robot.driveTrain.zeroLoopCounter();
		Robot.driveTrain.zeroEnc();
		System.out.println(degrees);
		Robot.driveTrain.setSetpointTurn(degrees);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		//return false;
		return Robot.driveTrain.onTarget()||this.isTimedOut();
	}

	protected void end()
	{
		System.out.println("end");
		Robot.driveTrain.stopDrive();
		Robot.driveTrain.zeroEnc();
	}

	protected void interrupted()
	{
		end();
	}
}
