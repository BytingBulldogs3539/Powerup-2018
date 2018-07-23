package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.utilities.DirectionalButton.Direction;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class LogitechF310 extends Joystick
{
	// BUTTONS
	private static final int A = 1;
	private static final int B = 2;
	private static final int X = 3;
	private static final int Y = 4;

	private static final int START = 8;
	private static final int SELECT = 7;

	private static final int LS = 9;
	private static final int RS = 10;

	private static final int BL = 5;
	private static final int BR = 6;

	private static final int RIGHT_TRIGGER = 3;
	private static final int LEFT_TRIGGER = 2;

	// AXIS
	private static final int X_AxisL = 0;
	private static final int Y_AxisL = 1;

	private static final int X_AxisR = 4;
	private static final int Y_AxisR = 5;

	public LogitechF310(int port)
	{
		super(port);
	}

	public JoystickButton buttonX = new JoystickButton(this, X);
	public JoystickButton buttonY = new JoystickButton(this, Y);
	public JoystickButton buttonA = new JoystickButton(this, A);
	public JoystickButton buttonB = new JoystickButton(this, B);

	public JoystickButton buttonBL = new JoystickButton(this, BL);
	public JoystickButton buttonBR = new JoystickButton(this, BR);

	//public TriggerButton buttonTL = new TriggerButton(this, LEFT_TRIGGER);
	//public TriggerButton buttonTR = new TriggerButton(this, RIGHT_TRIGGER);

	public JoystickButton buttonSTART = new JoystickButton(this, START);
	public JoystickButton buttonSELECT = new JoystickButton(this, SELECT);

	
	public JoystickButton buttonLS = new JoystickButton(this, LS);
	public JoystickButton buttonRS = new JoystickButton(this, RS);

	public DirectionalButton buttonPadLeft = new DirectionalButton(this, Direction.LEFT);
	public DirectionalButton buttonPadRight = new DirectionalButton(this, Direction.RIGHT);
	public DirectionalButton buttonPadUp = new DirectionalButton(this, Direction.UP);
	public DirectionalButton buttonPadDown = new DirectionalButton(this, Direction.DOWN);

	public double getLeftTrigger()
	{
		return getRawAxis(LEFT_TRIGGER);
	}
	public double getRightTrigger()
	{
		return getRawAxis(RIGHT_TRIGGER);
	}
	public double getLeftStickX()
	{
		return getRawAxis(X_AxisL);
	}

	public double getLeftStickY()
	{
		return getRawAxis(Y_AxisL);
	}

	public double getRightStickX()
	{
		return getRawAxis(X_AxisR);
	}

	public double getRightStickY()
	{
		return getRawAxis(Y_AxisR);
	}
}
