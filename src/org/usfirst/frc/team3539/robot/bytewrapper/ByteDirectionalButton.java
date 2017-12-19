package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;
import org.usfirst.frc.team3539.robot.utilities.DirectionalButton;

/**
 * Wrapper class for all DirectionButtons to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 12/18/17
 */

public class ByteDirectionalButton extends DirectionalButton
{
	private ByteJoystick joystick;
	private String label;
	
	public ByteDirectionalButton(Direction direction, ByteJoystick joystick, String label)
	{
		super(direction, joystick);
		this.joystick = joystick;
		this.label = label;
		BulldogLogger.getInstance().logEvent("Directional Constructed " + joystick.getName() +  " DIR:" + direction + ":" + label);
	}
	
	public void whenPressed(final ByteCommand command)
	{
		BulldogLogger.getInstance().logInput(getPrefix(command) + "whenPressed()");
		whenActive(command);
	}

	public void whileHeld(final ByteCommand command)
	{
		BulldogLogger.getInstance().logInput(getPrefix(command) + "whileHeld()");
		whileActive(command);
	}

	public void whenReleased(final ByteCommand command)
	{
		BulldogLogger.getInstance().logInput(getPrefix(command) + "whenReleased()");
		whenInactive(command);
	}

	public void toggleWhenPressed(final ByteCommand command)
	{
		BulldogLogger.getInstance().logInput(getPrefix(command) + "toggleWhenPressed()");
		toggleWhenActive(command);
	}

	public void cancelWhenPressed(final ByteCommand command)
	{
		BulldogLogger.getInstance().logInput(getPrefix(command) + "cancelWhenPressed()");
		cancelWhenActive(command);
	}
	
	private String getPrefix(ByteCommand command)
	{
		return joystick.getName()  +  " DIR:" + getDirection() + ":" + label + " -> " + command.getName() + ".";
	}

}
