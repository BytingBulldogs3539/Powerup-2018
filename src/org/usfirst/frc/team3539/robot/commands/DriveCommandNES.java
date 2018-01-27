package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommandNES extends Command
{
	double forward, turn;

	public DriveCommandNES(double forward)
	{
		requires(Robot.driveTrain);
		this.forward = forward;
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		turn = -Robot.oi.NEScontroller.getRawAxis(RobotMap.NES_X_Axis);
		Robot.driveTrain.updateEnc();
		Robot.driveTrain.driveArcade(forward / 1.3, turn);
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
	}
}
