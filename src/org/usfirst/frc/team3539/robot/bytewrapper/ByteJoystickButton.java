package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class ByteJoystickButton extends JoystickButton
{
	private ByteJoystick joystick;
	private int buttonNumber;
	private String label;

	public ByteJoystickButton(ByteJoystick joystick, int buttonNumber, String label)
	{
		super(joystick, buttonNumber);
		this.joystick = joystick;
		this.buttonNumber = buttonNumber;
		this.label = label;
		BulldogLogger.getInstance().logEvent("ByteJoystickButton Constructed " + joystick.getName() +  " #:" + buttonNumber + ":" + label);
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
		return joystick.getName() + " #" + buttonNumber + ":" + label + " -> " + command.getName() + ".";
	}

}
