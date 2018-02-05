package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonTurnEncoderCommand extends Command
{
	double degrees;

	public AutonTurnEncoderCommand(double degrees, double seconds)
	{
		requires(Robot.driveTrain);
		this.degrees = degrees;
		setTimeout(seconds);
	}

	protected void initialize()
	{
		Robot.driveTrain.setPID(SmartDashboard.getNumber("TurnP", 0), SmartDashboard.getNumber("TurnI", 0),
				SmartDashboard.getNumber("TurnD", 0), SmartDashboard.getNumber("TurnF", 0));
		Robot.driveTrain.setTargetAllowedError(500);
		Robot.driveTrain.setLoopOnTarget(20);
		Robot.driveTrain.zeroLoopCounter();
		Robot.driveTrain.zeroEncoders();
		Robot.driveTrain.setSetpointTurn(degrees);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.onTarget() || isTimedOut();
	}

	protected void end()
	{
		Robot.driveTrain.stopDrive();
		Robot.driveTrain.zeroEncoders();
	}

	protected void interrupted()
	{
		end();
	}
}
