package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Button Wrapper to allow Light Sensors to mock a Button.
 * 
 * @author FRC-3539
 *
 * @since 1/26/18
 */
public class LightBeam extends Button
{
	DigitalInput sensor;

	public LightBeam(int port)
	{
		sensor = new DigitalInput(port);
	}

	@Override
	public boolean get()
	{
		return !sensor.get();
	}

}
