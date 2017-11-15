package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Wrapper class for all Commands to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 5/02/17
 */

// TODO: Append String to name to Diff. from PIDCommand

public abstract class ByteCommand extends Command
{
	protected ByteCommand(String name)
	{
		super(name);
		BulldogLogger.getInstance().logCommand(getName() + " Constructed");
	}

	protected ByteCommand(String name, double timeout)
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
