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
	private static final int SELECT = 3539;

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

	private static double X_ThresR_Min = 0;
	private static double X_ThresR_Max = 1;

	private static double Y_ThresR_Min = 0;
	private static double Y_ThresR_Max = 1;

	private static double X_ThresL_Min = 0;
	private static double X_ThresL_Max = 1;

	private static double Y_ThresL_Min = 0;
	private static double Y_ThresL_Max = 1;

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

	public TriggerButton buttonTL = new TriggerButton(this, LEFT_TRIGGER);
	public TriggerButton buttonTR = new TriggerButton(this, RIGHT_TRIGGER);

	public JoystickButton buttonSTART = new JoystickButton(this, START);
	public JoystickButton buttonSELECT = new JoystickButton(this, SELECT);

	public JoystickButton buttonLS = new JoystickButton(this, LS);
	public JoystickButton buttonRS = new JoystickButton(this, RS);

	public DirectionalButton buttonPadLeft = new DirectionalButton(this, Direction.LEFT);
	public DirectionalButton buttonPadRight = new DirectionalButton(this, Direction.RIGHT);
	public DirectionalButton buttonPadUp = new DirectionalButton(this, Direction.UP);
	public DirectionalButton buttonPadDown = new DirectionalButton(this, Direction.DOWN);

	public double getLeftStickX()
	{
		if (getRawAxis(X_AxisL) >= X_ThresL_Min && getRawAxis(X_AxisL) <= X_ThresL_Max)
			return getRawAxis(X_AxisL);
		else
			return 0.0;
	}

	public double getLeftStickY()
	{
		if (getRawAxis(Y_AxisL) >= Y_ThresL_Min && getRawAxis(Y_AxisL) <= Y_ThresL_Max)
			return getRawAxis(Y_AxisL);
		else
			return 0.0;
	}

	public double getRightStickX()
	{
		if (getRawAxis(X_AxisR) >= X_ThresR_Min && getRawAxis(X_AxisR) <= X_ThresR_Max)
			return getRawAxis(X_AxisR);
		else
			return 0.0;
	}

	public double getRightStickY()
	{
		if (getRawAxis(Y_AxisR) >= Y_ThresR_Min && getRawAxis(Y_AxisR) <= Y_ThresR_Max)
			return getRawAxis(Y_AxisR);
		else
			return 0.0;

	}

	public void setRightStickXThreshold(double min, double max)
	{
		X_ThresR_Min = min;
		X_ThresR_Max = max;
	}

	public void setRightStickYThreshold(double min, double max)
	{
		Y_ThresR_Min = min;
		Y_ThresR_Max = max;
	}

	public void setLeftStickXThreshold(double min, double max)
	{
		X_ThresL_Min = min;
		X_ThresL_Max = max;
	}

	public void setLeftStickYThreshold(double min, double max)
	{
		Y_ThresL_Min = min;
		Y_ThresL_Max = max;
	}
}
