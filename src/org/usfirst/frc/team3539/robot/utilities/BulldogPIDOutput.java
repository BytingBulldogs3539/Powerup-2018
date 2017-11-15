package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.PIDOutput;

/**
 * Wrapper implementation for PIDOutput
 * 
 * @author FRC-3539
 *
 * @since 03/03/17
 */

// TODO: Figure out if this class is still relevant to current scheme


public class BulldogPIDOutput implements PIDOutput
{
	private double pidValue = 0.0;
	
	public void pidWrite(double output)
	{
		pidValue = output;
	}
	
	public void reset()
	{
		pidValue = 0;
	}
	
	public double get()
	{
		return pidValue;
	}
	
}
