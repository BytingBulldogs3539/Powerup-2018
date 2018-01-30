package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Button Wrapper to allow triggers to be used as boolean buttons
 * 
 * @author FRC-3539
 *
 * @since 02/02/17
 */

//TODO: Add method to pull actual trigger values
//TODO: Add setRange(double range) method

public class TriggerButton extends Button
{
	private int triggerAxis;
	private GenericHID joystick;
	public boolean isTriggered;

	public TriggerButton(GenericHID joystick, int axis)
	{
		triggerAxis = axis;
		this.joystick = joystick;
	}

	@Override
	public boolean get()
	{
		if (joystick.getRawAxis(triggerAxis) > .75)
		{
			isTriggered = true;

		}
		else if (joystick.getRawAxis(triggerAxis) < .1)
		{
			isTriggered = false;
		}
		return isTriggered;
	}

}
