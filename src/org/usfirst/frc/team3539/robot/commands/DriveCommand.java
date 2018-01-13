package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.bytewrapper.ByteCommand;

public class DriveCommand extends ByteCommand
{

	protected DriveCommand(String name)
	{
		super(name);
	}

	@Override
	protected void bInit()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void bExecute()
	{
		//Robot.drivetrain
	}

	@Override
	protected boolean bIsFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void bEnd()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void bInterrupted()
	{
		// TODO Auto-generated method stub
		
	}

}
