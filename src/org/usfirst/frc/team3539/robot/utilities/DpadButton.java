package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

public class DpadButton extends Button
{
	double neededAngle;
	private GenericHID joystick;
	
	enum Direction
	{
		UP,DOWN,LEFT,RIGHT
	}
	public DpadButton(Direction direction, GenericHID joystick)
	{
	    neededAngle = 1;
	    this.joystick = joystick;
	    
	    switch(direction)
	    {
	    case UP:
	    	neededAngle = 0; 
	    	break;
	    case DOWN:
	    	neededAngle = 180;
	    	break;
	    case LEFT:
	    	neededAngle = 270;
	    	break;
	    case RIGHT:
	    	neededAngle = 90;
	    	break;
	    }
	}
	public boolean get()
	{ 
		
		if (joystick.getPOV() == neededAngle)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
}
