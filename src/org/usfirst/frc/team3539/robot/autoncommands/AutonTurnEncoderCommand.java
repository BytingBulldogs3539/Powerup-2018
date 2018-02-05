package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonTurnEncoderCommand extends Command
{
	private double targetAngle;

	public AutonTurnEncoderCommand(double targetAngle, double seconds)
	{
		requires(Robot.driveTrain);
		this.targetAngle = targetAngle;
		setTimeout(seconds);
	}

	protected void initialize()
	{
		Robot.driveTrain.zeroEncoders();
		Robot.driveTrain.setPID(SmartDashboard.getNumber("TurnP", 0), SmartDashboard.getNumber("TurnI", 0),
				SmartDashboard.getNumber("TurnD", 0), SmartDashboard.getNumber("TurnF", 0));
		Robot.driveTrain.setTargetAllowedError(500);
		Robot.driveTrain.setLoopOnTarget(20);
		Robot.driveTrain.zeroLoopCounter();
		Robot.driveTrain.setSetpointTurn(targetAngle);
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
		Robot.driveTrain.driveArcade(0, 0);
		Robot.driveTrain.zeroEncoders();
	}

	protected void interrupted()
	{
		end();
	}
}
