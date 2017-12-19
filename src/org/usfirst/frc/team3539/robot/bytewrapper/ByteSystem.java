package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLog;
import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * TODO: Add proper desc.
 * 
 * @author FRC-3539
 *
 * @since 3/02/17
 */

// TODO: Review for major changes

public abstract class ByteSystem extends Subsystem
{
	private BulldogLog log;
	
	/**
	 * Constructor - passes the System name up the chain
	 * 
	 * @param name
	 *            - Name of the subsystem being constructor
	 */
	public ByteSystem(String name, boolean isEnabled)
	{
		super(name);
		log = BulldogLogger.getInstance().createLog(name, isEnabled);
	}

	/**
	 * Initialize the default command - empty initialization
	 */
	public void initDefaultCommand()
	{
	}
	
	public BulldogLog getLog()
	{
		return log;
	}
}
