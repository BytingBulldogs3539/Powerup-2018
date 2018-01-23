package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.DigitalInput;

public class LightBeam extends DigitalInput
{

	public LightBeam(int channel)
	{
		super(channel);
	}
	
	public boolean isTriggered()
	{
		return get();
	}
	
}
