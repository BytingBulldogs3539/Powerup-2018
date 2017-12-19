package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteCommand;

public class SolenoidTransToggle extends ByteCommand
{
	public SolenoidTransToggle()
	{
		super("SolenoidTransToggle");
		requires(Robot.solenoid);
	}

	@Override
	protected void bInit()
	{
		Robot.solenoid.toggleTrans();
	}

	@Override
	protected void bExecute()
	{
	}

	@Override
	protected boolean bIsFinished()
	{
		return true;
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
