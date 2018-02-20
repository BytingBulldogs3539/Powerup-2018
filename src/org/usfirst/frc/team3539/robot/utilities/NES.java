package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.utilities.DirectionalButton.Direction;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class NES extends Joystick
{
	private static final int A = 1;
	private static final int B = 2;
	private static final int SELECT = 3;
	private static final int START = 4;

	public NES(int port)
	{
		super(port);
	}

	public JoystickButton buttonA = new JoystickButton(this, A);
	public JoystickButton buttonB = new JoystickButton(this, B);
	public JoystickButton buttonSTART = new JoystickButton(this, START);
	public JoystickButton buttonSELECT = new JoystickButton(this, SELECT);

	public DirectionalButton nesLeft = new DirectionalButton(this, Direction.LEFT);
	public DirectionalButton nesRight = new DirectionalButton(this, Direction.RIGHT);
	public DirectionalButton nesUp = new DirectionalButton(this, Direction.UP);
	public DirectionalButton nesDown = new DirectionalButton(this, Direction.DOWN);
}
