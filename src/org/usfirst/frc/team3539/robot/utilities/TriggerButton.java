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

public class TriggerButton extends Button
{
	private int triggerAxis;
	private GenericHID joystick;
	public boolean isTriggered;
	private double lowRange = .1;
	private double topRange = .75;

	public TriggerButton(GenericHID joystick, int axis)
	{
		triggerAxis = axis;
		this.joystick = joystick;
	}

	public double getValue()
	{
		return joystick.getRawAxis(triggerAxis);
	}

	public void setRange(double topRange, double lowRange)
	{
		this.lowRange = lowRange;
		this.topRange = topRange;
	}

	@Override
	public boolean get()
	{
		if (joystick.getRawAxis(triggerAxis) > topRange)
		{
			isTriggered = true;

		}
		else if (joystick.getRawAxis(triggerAxis) < lowRange)
		{
			isTriggered = false;
		}
		return isTriggered;
	}

}
