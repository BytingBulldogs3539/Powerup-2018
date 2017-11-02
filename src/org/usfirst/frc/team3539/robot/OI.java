
package org.usfirst.frc.team3539.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	public Joystick controller1 = new Joystick(RobotMap.controllerOnePort);
	public Joystick controller2 = new Joystick(RobotMap.controllerTwoPort);

	public JoystickButton oneX = new JoystickButton(controller1, RobotMap.buttonx);
	public JoystickButton oneY = new JoystickButton(controller1, RobotMap.buttony);
	public JoystickButton oneA = new JoystickButton(controller1, RobotMap.buttona);
	public JoystickButton oneB = new JoystickButton(controller1, RobotMap.buttonb);

	public JoystickButton twoX = new JoystickButton(controller2, RobotMap.buttonx);
	public JoystickButton twoY = new JoystickButton(controller2, RobotMap.buttony);
	public JoystickButton twoA = new JoystickButton(controller2, RobotMap.buttona);
	public JoystickButton twoB = new JoystickButton(controller2, RobotMap.buttonb);
	
	public JoystickButton oneBL = new JoystickButton(controller1, RobotMap.bumperl);
	public JoystickButton oneBR = new JoystickButton(controller1, RobotMap.bumperr);
	
	public JoystickButton twoBL = new JoystickButton(controller2, RobotMap.bumperl);
	public JoystickButton twoBR = new JoystickButton(controller2, RobotMap.bumperr);
	
	public JoystickButton oneS = new JoystickButton(controller1, RobotMap.buttonStart);
	public JoystickButton twoS = new JoystickButton(controller2, RobotMap.buttonStart);
	
	public JoystickButton oneTL = new JoystickButton(controller1, RobotMap.LEFT_TRIGGER);
	public JoystickButton oneTR = new JoystickButton(controller1, RobotMap.RIGHT_TRIGGER);
	
	public JoystickButton twoTL = new JoystickButton(controller2, RobotMap.LEFT_TRIGGER);
	public JoystickButton twoTR = new JoystickButton(controller2, RobotMap.RIGHT_TRIGGER);

	public JoystickButton oneLS = new JoystickButton(controller1, RobotMap.buttonLS);
	public JoystickButton oneRS = new JoystickButton(controller1, RobotMap.buttonRS);
	
	public JoystickButton twoLS = new JoystickButton(controller2, RobotMap.buttonLS);
	public JoystickButton twoRS = new JoystickButton(controller2, RobotMap.buttonRS);

	public OI()
	{
	}
}