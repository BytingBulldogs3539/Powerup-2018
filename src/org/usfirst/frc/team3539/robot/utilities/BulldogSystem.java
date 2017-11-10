package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Base class for all Subsystems for Team 3539
 * 
 * @author FRC-3539
 * 
 * @version 3.539
 */

public abstract class BulldogSystem extends Subsystem
{
	/**
	 * Constructor - passes the System name up the chain
	 * 
	 * @param name
	 *            - Name of the subsystem being constructor
	 */
	public BulldogSystem(String name)
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
