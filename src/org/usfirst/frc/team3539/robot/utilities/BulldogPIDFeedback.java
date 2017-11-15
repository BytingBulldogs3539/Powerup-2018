package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

/**
 * Wrapper class for PIDSource
 * 
 * @author FRC-3539
 *
 * @since 03/03/17
 */

// TODO: Figure out if this class is still relevant to current scheme

public class BulldogPIDFeedback implements PIDSource
{
	private boolean visionFeedback = false;

	public void setPIDSourceType(PIDSourceType pidSource)
	{
	}

	public PIDSourceType getPIDSourceType()
	{
		return PIDSourceType.kDisplacement;
	}

	public void setVisionFeedback(boolean value)
	{
		visionFeedback = value;
	}

	public double pidGet()
	{
		if (visionFeedback)
			return 0.0;
		else
			return 0.0;
	}
}
