package org.usfirst.frc.team3539.robot.utilities;

/**
 * @author Ivan IV
 */

public class STARTERCOMMAND extends BulldogCommand
{

	public STARTERCOMMAND() // Constructor; Called when you deploy the code
	{
		super("STARTERCOMMAND");
		// Insert the exact command name here ex.
		// "DriveCommand"

		// requires(Robot.subsystem); //Put the subsystem the command uses here
	}

	@Override
	protected void bInit()
	{
		// Put methods here to be ran once
		// (if STARTERCOMMAND is called)

		// Robot.subsystem.method
	}

	@Override
	protected void bExecute()
	{
		super.execute();

		// methods here will run every 20ms while the isFinished() is false
	}
	
	@Override
	protected boolean bIsFinished()
	{
		// Return true when the command should
		// terminate

		// if it only returns false it will eventually be
		// interupted by another command

		// if(commandShouldEnd)
		// return true;
		// else
		return false;
	}

	@Override
	protected void bEnd()
	{
		// put methods here to be run when the command is interupted or when the
		// isFinished() returns true
	}

	@Override
	protected void bInterrupted()
	{
		// called when another command in the same subsystem is initialized
		// two commands of the same subsystem cannot run at the same time
	}
}
