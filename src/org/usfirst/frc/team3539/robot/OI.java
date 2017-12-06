
package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.bytewrapper.ByteJoystick;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteJoystickButton;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	public ByteJoystick controller1 = new ByteJoystick(RobotMap.DRIVER);
	public ByteJoystick controller2 = new ByteJoystick(RobotMap.OPERATOR);

	public JoystickButton oneX = new JoystickButton(controller1, RobotMap.X);
	public JoystickButton oneY = new JoystickButton(controller1, RobotMap.Y);
	public JoystickButton oneA = new JoystickButton(controller1, RobotMap.A);
	public JoystickButton oneB = new JoystickButton(controller1, RobotMap.B);

	public ByteJoystickButton twoX = new ByteJoystickButton(controller2, RobotMap.X);
	public ByteJoystickButton twoY = new ByteJoystickButton(controller2, RobotMap.Y);
	public ByteJoystickButton twoA = new ByteJoystickButton(controller2, RobotMap.A);
	public ByteJoystickButton twoB = new ByteJoystickButton(controller2, RobotMap.B);

	public JoystickButton oneBL = new JoystickButton(controller1, RobotMap.BL);
	public JoystickButton oneBR = new JoystickButton(controller1, RobotMap.BR);

	public JoystickButton twoBL = new JoystickButton(controller2, RobotMap.BL);
	public JoystickButton twoBR = new JoystickButton(controller2, RobotMap.BR);

	public JoystickButton oneS = new JoystickButton(controller1, RobotMap.START);
	public JoystickButton twoS = new JoystickButton(controller2, RobotMap.START);

	public JoystickButton oneTL = new JoystickButton(controller1, RobotMap.LEFT_TRIGGER);
	public JoystickButton oneTR = new JoystickButton(controller1, RobotMap.RIGHT_TRIGGER);

	public JoystickButton twoTL = new JoystickButton(controller2, RobotMap.LEFT_TRIGGER);
	public JoystickButton twoTR = new JoystickButton(controller2, RobotMap.RIGHT_TRIGGER);

	public JoystickButton oneLS = new JoystickButton(controller1, RobotMap.LS);
	public JoystickButton oneRS = new JoystickButton(controller1, RobotMap.RS);

	public JoystickButton twoLS = new JoystickButton(controller2, RobotMap.LS);
	public JoystickButton twoRS = new JoystickButton(controller2, RobotMap.RS);

	public OI()
	{
		twoA.whenPressed(new IntakeCommand(1));
		twoA.whenReleased(new IntakeCommand(0));
	}
}