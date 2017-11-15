package org.usfirst.frc.team3539.robot.bytewrapper;

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
	/**
	 * Constructor - passes the System name up the chain
	 * 
	 * @param name
	 *            - Name of the subsystem being constructor
	 */
	public ByteSystem(String name)
	{
		super(name);
	}

	/**
	 * Initialize the default command - empty initialization
	 */
	public void initDefaultCommand()
	{
	}

	/**
	 * Update the smart dash - must be implemented by the subclass
	 */
	public abstract void Update();

	/**
	 * Initialize the smart dash - must be implemented by the subclass
	 */
	public abstract void SmartInit();

}
