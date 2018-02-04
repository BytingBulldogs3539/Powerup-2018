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

public class DirectionalButton extends Button
{
	private int neededAngle;
	private Direction direction;
	private GenericHID joystick;

	public enum Direction
	{

		UP, UPRIGHT, RIGHT, DOWNRIGHT, DOWN, DOWNLEFT, LEFT, UPLEFT
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
		case UPRIGHT:
			neededAngle=45;
			break;
		case RIGHT:
			neededAngle = 90;
			break;
		case DOWNRIGHT:
			neededAngle = 135;
			break;
		case DOWN:
			neededAngle = 180;
			break;
		case DOWNLEFT:
			neededAngle = 225;
			break;
		case LEFT:
			neededAngle = 270;
			break;
		case UPLEFT:
			neededAngle = 315;
			break;

		}
	}
	public int getPOV()
	{
		return joystick.getPOV();
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
