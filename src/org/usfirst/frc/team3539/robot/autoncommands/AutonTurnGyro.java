package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 */
public class AutonTurnGyro extends PIDCommand
{
	double setpoint = 0;

	public AutonTurnGyro(double degrees, double seconds)
	{
		super(RobotMap.turnPeaGyro, RobotMap.turnEyeGyro, RobotMap.turnDeeGyro);
		requires(Robot.driveTrain);
		setpoint = degrees;
		this.setTimeout(seconds);
	}

	protected void initialize()
	{
		Robot.driveTrain.stopDrive();
		this.getPIDController().setPID(RobotMap.turnPeaGyro, RobotMap.turnEyeGyro, RobotMap.turnDeeGyro);
		this.getPIDController().setSetpoint(setpoint);
		this.getPIDController().setAbsoluteTolerance(1);
		this.getPIDController().enable();
		
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return this.getPIDController().onTarget()||this.isTimedOut();
	}

	protected void end()
	{
		this.getPIDController().reset();
		this.getPIDController().disable();
		Robot.driveTrain.stopDrive();
	}

	protected void interrupted()
	{
		end();
	}

	@Override
	protected double returnPIDInput()
	{
		return Robot.driveTrain.getAngle();
	}

	@Override
	protected void usePIDOutput(double output)
	{
		Robot.driveTrain.linearTurn(output);

	}
}
