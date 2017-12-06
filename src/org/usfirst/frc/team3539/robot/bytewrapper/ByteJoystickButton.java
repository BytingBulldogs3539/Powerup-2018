package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class ByteJoystickButton extends JoystickButton
{
	private GenericHID joystick;
	private int buttonNumber;
	
	public ByteJoystickButton(GenericHID joystick, int buttonNumber)
	{
		super(joystick, buttonNumber);
		this.joystick = joystick;
		this.buttonNumber = buttonNumber;
		BulldogLogger.getInstance().logEvent(joystick.getName() + " #: " + buttonNumber + " ByteJoystickButton Constructed");
	}

	public void whenPressed(final Command command)
	{
		BulldogLogger.getInstance().logInput(joystick.getName() + " #: " + buttonNumber + " whenPressed()");
		whenActive(command);
	}

	public void whileHeld(final Command command)
	{
		BulldogLogger.getInstance().logInput(joystick.getName() + " #: " + buttonNumber + " whileHeld()");
		whileActive(command);
	}

	public void whenReleased(final Command command)
	{
		BulldogLogger.getInstance().logInput(joystick.getName() + " #: " + buttonNumber + " whenReleased()");
		whenInactive(command);
	}

	public void toggleWhenPressed(final Command command)
	{
		BulldogLogger.getInstance().logInput(joystick.getName() + " #: " + buttonNumber + " toggleWhenPressed()");
		toggleWhenActive(command);
	}

	public void cancelWhenPressed(final Command command)
	{
		BulldogLogger.getInstance().logInput(joystick.getName() + " #: " + buttonNumber + " cancelWhenPressed()");
		cancelWhenActive(command);
	}
	
	public String getButtonName(int buttonNumber)
	{
		return "not sure how to do this yet";
	}

}
