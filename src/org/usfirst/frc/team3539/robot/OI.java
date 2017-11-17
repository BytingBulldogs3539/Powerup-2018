
package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.bytewrapper.ByteJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	public Joystick controller1 = new Joystick(RobotMap.DRIVER);
	public Joystick controller2 = new Joystick(RobotMap.OPERATOR);
	
	public ByteJoystick controller3 = new ByteJoystick(3);
	
	public JoystickButton threeX = new JoystickButton(controller3, RobotMap.X);
	
	public JoystickButton oneX = new JoystickButton(controller1, RobotMap.X);
	public JoystickButton oneY = new JoystickButton(controller1, RobotMap.Y);
	public JoystickButton oneA = new JoystickButton(controller1, RobotMap.A);
	public JoystickButton oneB = new JoystickButton(controller1, RobotMap.B);

	public JoystickButton twoX = new JoystickButton(controller2, RobotMap.X);
	public JoystickButton twoY = new JoystickButton(controller2, RobotMap.Y);
	public JoystickButton twoA = new JoystickButton(controller2, RobotMap.A);
	public JoystickButton twoB = new JoystickButton(controller2, RobotMap.B);
	
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
	}
}