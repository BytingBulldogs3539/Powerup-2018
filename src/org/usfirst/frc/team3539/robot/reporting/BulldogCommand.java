package org.usfirst.frc.team3539.robot.reporting;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Base class for all Commands for Team 3539
 * 
 * @author Programming team
 *
 */
public abstract class BulldogCommand extends Command
{
	public BulldogCommand(String name)
	{
		super(name);
		BulldogLogger.getInstance().logCommand(getName() + " Constructed");
	}
	
	public BulldogCommand(String name, double timeout)
	{
		super(name, timeout);
		BulldogLogger.getInstance().logCommand(getName() + " Constructed");
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
		BulldogLogger.getInstance().logCommand(getName() + " Executed");
	}
	
	protected abstract void bExecute();
	
	protected boolean isFinished()
	{
		return bIsFinished();
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
