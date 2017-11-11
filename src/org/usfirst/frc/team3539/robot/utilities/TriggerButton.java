package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

public class TriggerButton extends Button
{
	private int triggerAxis;
	private GenericHID joystick;
	public boolean isTriggered;

	public TriggerButton(int axis, GenericHID joystick)
	{
		triggerAxis = axis;
		this.joystick = joystick;
	}

	@Override
	public boolean get()
	{
		if(joystick.getRawAxis(triggerAxis) > .75)
		{
			isTriggered = true;

		}
		else if(joystick.getRawAxis(triggerAxis) < .1)
		{
			isTriggered = false;
		}
		return isTriggered;
	}

}
