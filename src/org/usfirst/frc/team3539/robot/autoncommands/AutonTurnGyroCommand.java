package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 */
public class AutonTurnGyroCommand extends PIDCommand
{
	private double targetAngle;

	public AutonTurnGyroCommand(double setpointAngle, double seconds)
	{
		super(RobotMap.turnPeaGyro, RobotMap.turnEyeGyro, RobotMap.turnDeeGyro);
		requires(Robot.driveTrain);
		this.targetAngle = setpointAngle;
		setTimeout(seconds);
	}

	protected void initialize()
	{
		// I don't think this line is needed because the constructor already does this
		// getPIDController().setPID(RobotMap.turnPeaGyro, RobotMap.turnEyeGyro,
		// RobotMap.turnDeeGyro);

		getPIDController().setSetpoint(targetAngle);

		getPIDController().setAbsoluteTolerance(1);

		getPIDController().enable();

	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return getPIDController().onTarget() || isTimedOut();
	}

	protected void end()
	{
		getPIDController().reset();

		getPIDController().disable();

		Robot.driveTrain.driveArcade(0, 0);
	}

	protected void interrupted()
	{
		end();
	}

	@Override
	protected double returnPIDInput()
	{
		return Robot.driveTrain.getHeading();
	}

	@Override
	protected void usePIDOutput(double output)
	{
		Robot.driveTrain.driveArcade(0, output);
	}
}
