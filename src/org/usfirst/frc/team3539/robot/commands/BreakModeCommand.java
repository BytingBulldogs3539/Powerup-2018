package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BreakModeCommand extends Command
{
	public BreakModeCommand()
	{
		requires(Robot.driveTrain);
	}

	protected void initialize()
	{
		Robot.driveTrain.setPID(SmartDashboard.getNumber("BreakP", 0), SmartDashboard.getNumber("BreakI", 0), SmartDashboard.getNumber("BreakD", 0), SmartDashboard.getNumber("BreakF", 0));

		Robot.driveTrain.zeroEncoders();
		Robot.driveTrain.setSetpointDrive(Robot.driveTrain.inchToEncoder(0));
	}

	protected void execute()
	{
	}

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
