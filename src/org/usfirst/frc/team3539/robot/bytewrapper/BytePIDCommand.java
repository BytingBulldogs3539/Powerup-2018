package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 * Wrapper class for all PIDCommands to implement logging and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 6/02/17
 */

// TODO: Append String to name to Diff. from normal Command

public abstract class BytePIDCommand extends PIDCommand
{
	public BytePIDCommand(String name, double p, double i, double d)
	{
		super(name, p, i, d);
	}

	public BytePIDCommand(String name, double timeout, double p, double i, double d)
	{
		super(name, p, i, d);
		this.setTimeout(timeout);
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
