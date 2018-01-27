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

public class DualLimitButton extends Button
{
	int portNum;
	int portNum2;
	DigitalInput port;
	DigitalInput port2;

	public DualLimitButton(int portnum,int portnum2)
	{
		portNum = portnum;
		portNum2 = portnum2;
		port = new DigitalInput(portnum);
		port2 = new DigitalInput(portnum2);
	}

	public boolean get()
	{
		return port.get()&&port2.get();
	}
}
