package org.usfirst.frc.team3539.robot.utilities;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Button Wrapper to allow directional pad to mock a Button
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

//TODO: Add method to pull actual values rather than boolean
//TODO: Add more directions to Direction enum

public class DirectionalButton extends Button
{
	private double neededAngle;
	private Direction direction;
	private GenericHID joystick;

	public enum Direction
	{
		UP, DOWN, LEFT, RIGHT
	}

	public DirectionalButton(GenericHID joystick, Direction direction)
	{
		neededAngle = 1;
		this.direction = direction;
		this.joystick = joystick;

		switch (direction)
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
	
	public Direction getDirection()
	{
		return direction;
	}
}
