package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteCommand;

/**
 *
 */
public class DriveCommand extends ByteCommand
{
	public DriveCommand()
	{
		super("DriveCommand");
		requires(Robot.driveTrain);
	}

	@Override
	protected void bInit()
	{
	}

	@Override
	protected void bExecute()
	{
		Robot.driveTrain.driveArcade(Robot.oi.controller1.getAxisLY(), Robot.oi.controller1.getAxisRX());
	}

	@Override
	protected boolean bIsFinished()
	{
		return false;
	}

	@Override
	protected void bEnd()
	{
	}

	@Override
	protected void bInterrupted()
	{
	}
}
