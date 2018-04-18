package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

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

		Robot.driveTrain.setPID(SmartDashboard.getNumber("TurnP", RobotMap.turnPeaWheels), SmartDashboard.getNumber("TurnI", RobotMap.turnEyeWheels), SmartDashboard.getNumber("TurnD", RobotMap.turnDeeWheels),
				SmartDashboard.getNumber("TurnF", RobotMap.turnFFFWheels));

		Robot.driveTrain.setupOnTarget(500, 50);

		Robot.driveTrain.setSetpointTurn(targetAngle);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		if (Robot.driveTrain.onTarget() || isTimedOut())
		{
			System.out.println("Finished");
		}
		return Robot.driveTrain.onTarget() || isTimedOut();
	}

	protected void end()
	{
		System.out.println("End");
		Robot.driveTrain.driveArcade(0, 0);
		Robot.driveTrain.zeroEncoders();
	}

	protected void interrupted()
	{
		end();
	}
}
