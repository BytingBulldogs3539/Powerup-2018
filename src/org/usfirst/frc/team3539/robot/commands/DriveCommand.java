package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command
{

	public DriveCommand()
	{
		requires(Robot.driveTrain);
	}

	protected void initialize()
	{

	}

	protected void execute()
	{
		// Test - do not delete
		Robot.driveTrain.effectiveArcadeDrive(Robot.oi.one.getRawAxis(RobotMap.Y_AxisL), -Robot.oi.one.getRawAxis(RobotMap.X_AxisR));

		// Legacy code
		// Robot.driveTrain.driveArcade(Robot.oi.controller1.getRawAxis(RobotMap.Y_AxisL), -Robot.oi.controller1.getRawAxis(RobotMap.X_AxisR));
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.driveTrain.stopDrive();
	}

	protected void interrupted()
	{
		end();
	}
}