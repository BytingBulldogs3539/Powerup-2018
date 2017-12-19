
package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.bytewrapper.ByteDirectionalButton;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteJoystick;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteJoystickButton;
import org.usfirst.frc.team3539.robot.commands.SolenoidTransToggle;
import org.usfirst.frc.team3539.robot.utilities.DirectionalButton.Direction;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	public ByteJoystick controller1 = new ByteJoystick(RobotMap.DRIVER, "DRIVER  "); //Added spaces to fix spacing in logs
	public ByteJoystick controller2 = new ByteJoystick(RobotMap.OPERATOR, "OPERATOR");

	public ByteJoystickButton oneX = new ByteJoystickButton(controller1, RobotMap.X, "X");
	public ByteJoystickButton oneY = new ByteJoystickButton(controller1, RobotMap.Y, "Y");
	public ByteJoystickButton oneA = new ByteJoystickButton(controller1, RobotMap.A, "A");
	public ByteJoystickButton oneB = new ByteJoystickButton(controller1, RobotMap.B, "B");

	public ByteJoystickButton twoX = new ByteJoystickButton(controller2, RobotMap.X, "X");
	public ByteJoystickButton twoY = new ByteJoystickButton(controller2, RobotMap.Y, "Y");
	public ByteJoystickButton twoA = new ByteJoystickButton(controller2, RobotMap.A, "A");
	public ByteJoystickButton twoB = new ByteJoystickButton(controller2, RobotMap.B, "B");

	public ByteJoystickButton oneBL = new ByteJoystickButton(controller1, RobotMap.BL, "BL");
	public ByteJoystickButton oneBR = new ByteJoystickButton(controller1, RobotMap.BR, "BR");

	public ByteJoystickButton twoBL = new ByteJoystickButton(controller2, RobotMap.BL, "BL");
	public ByteJoystickButton twoBR = new ByteJoystickButton(controller2, RobotMap.BR, "BR");

	public ByteJoystickButton oneS = new ByteJoystickButton(controller1, RobotMap.START, "START");
	public ByteJoystickButton twoS = new ByteJoystickButton(controller2, RobotMap.START, "START");

	public ByteJoystickButton oneTL = new ByteJoystickButton(controller1, RobotMap.LEFT_TRIGGER, "LEFT_TRIGGER");
	public ByteJoystickButton oneTR = new ByteJoystickButton(controller1, RobotMap.RIGHT_TRIGGER, "RIGHT_TRIGGER");

	public ByteJoystickButton twoTL = new ByteJoystickButton(controller2, RobotMap.LEFT_TRIGGER, "LEFT_TRIGGER");
	public ByteJoystickButton twoTR = new ByteJoystickButton(controller2, RobotMap.RIGHT_TRIGGER, "RIGHT_TRIGGER");

	public ByteJoystickButton oneLS = new ByteJoystickButton(controller1, RobotMap.LS, "LS");
	public ByteJoystickButton oneRS = new ByteJoystickButton(controller1, RobotMap.RS, "RS");

	public ByteJoystickButton twoLS = new ByteJoystickButton(controller2, RobotMap.LS, "LS");
	public ByteJoystickButton twoRS = new ByteJoystickButton(controller2, RobotMap.RS, "RS");
	
	public ByteDirectionalButton onePadLeft = new ByteDirectionalButton(Direction.LEFT, controller1, "LEFT");
	public ByteDirectionalButton onePadRight = new ByteDirectionalButton(Direction.RIGHT, controller1, "RIGHT");
	public ByteDirectionalButton onePadUp = new ByteDirectionalButton(Direction.UP, controller1, "UP");
	public ByteDirectionalButton onePadDown = new ByteDirectionalButton(Direction.DOWN, controller1, "DOWN");
	
	public ByteDirectionalButton twoPadLeft = new ByteDirectionalButton(Direction.LEFT, controller2, "LEFT");
	public ByteDirectionalButton twoPadRight = new ByteDirectionalButton(Direction.RIGHT, controller2, "RIGHT");
	public ByteDirectionalButton twoPadUp = new ByteDirectionalButton(Direction.UP, controller2, "UP");
	public ByteDirectionalButton twoPadDown = new ByteDirectionalButton(Direction.DOWN, controller2, "DOWN");

	public OI()
	{
		twoA.whileHeld(new IntakeCommand(1));
		onePadDown.whileHeld(new SolenoidTransToggle());
		oneA.whenPressed(new SolenoidTransToggle());
	}
}