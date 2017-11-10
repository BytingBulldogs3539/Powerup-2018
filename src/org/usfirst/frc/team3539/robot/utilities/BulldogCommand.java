package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Base class for all Commands for Team 3539
 * 
 * @author FRC-3539
 *
 * @version 3.539
 */

public abstract class BulldogCommand extends Command
{
	public BulldogCommand(String name)
	{
		super(name);
	}
	
	public BulldogCommand(String name, double timeout)
	{
		super(name, timeout);
	}
	
	protected void initialize()
	{
		super.initialize();
		bInit();
		BulldogLogger.getInstance().logCommand(getName() + " Initialized");
	}
	
	protected abstract void bInit();
	
	protected void execute()
	{
		super.execute();
		bExecute();
		//BulldogLogger.getInstance().logCommand(getName() + " Initialized");
	}
	
	protected abstract void bExecute();
	
	protected boolean isFinished()
	{
		boolean esketit = bIsFinished(); //80 on my wrist
		//BulldogLogger.getInstance().logCommand(getName() + " isFinished: " + esketit);
		return esketit;
	}
	
	protected abstract boolean bIsFinished();
	
	protected void end()
	{
		super.end();
		bEnd();
		BulldogLogger.getInstance().logCommand(getName() + " Ended");
	}
	
	protected abstract void bEnd();
	
	protected void interrupted()
	{
		super.interrupted();
		bInterrupted();
		BulldogLogger.getInstance().logCommand(getName() + " Interrupted");
	}
	
	protected abstract void bInterrupted();
}
