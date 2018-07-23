package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Button Wrapper to allow limit switches to mock a Button
 * 
 * @author FRC-3539
 *
 * @since 1/26/18
 */

public class LimitButton extends Button
{
	int portNum;
	DigitalInput port;

	public LimitButton(int portnum)
	{
		portNum = portnum;
		port = new DigitalInput(portnum);
	}

	public boolean get()
	{
		return port.get();
	}
}
