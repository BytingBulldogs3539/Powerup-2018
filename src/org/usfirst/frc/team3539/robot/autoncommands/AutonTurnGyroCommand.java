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
		Robot.driveTrain._imu.setFusedHeading(0, 10);
		Robot.driveTrain._imu.setFusedHeading(0, 10);


	}

	protected void initialize()
	{
	//	Robot.driveTrain._imu.setFusedHeading(0, 10);

		// I don't think this line is needed because the constructor already does this
		// getPIDController().setPID(RobotMap.turnPeaGyro, RobotMap.turnEyeGyro,
		// RobotMap.turnDeeGyro);
		this.getPIDController().setOutputRange(-1, 1);
	//	this.getPIDController().setOutputRange(1, -1);

		this.getPIDController().setSetpoint(targetAngle);

		this.getPIDController().setAbsoluteTolerance(1);


		this.getPIDController().enable();
		this.getPIDController().setToleranceBuffer(5);
		//this.getPIDController().

	}

	protected void execute()
	{
		System.out.println(Robot.driveTrain.getPigeonHeading());
	}

	protected boolean isFinished()
	{
		return getPIDController().onTarget() || isTimedOut();
	}

	protected void end()
	{
		this.getPIDController().reset();

		this.getPIDController().disable();
Robot.driveTrain._imu.setFusedHeading(0, 50);
		Robot.driveTrain.driveArcade(0, 0);
		Robot.driveTrain._imu.setFusedHeading(0, 50);

	}

	protected void interrupted()
	{
		end();
	}

	@Override
	protected double returnPIDInput()
	{
	//return Robot.driveTrain.getHeading();
		return Robot.driveTrain.getPigeonHeading(); //try this 
	}

	@Override
	protected void usePIDOutput(double output)
	{
		Robot.driveTrain.driveArcade(0, -output);
	}
}
