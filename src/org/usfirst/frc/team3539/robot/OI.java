
package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.commands.DriveCommandNES;
//import org.usfirst.frc.team3539.robot.commands.BreakMode;
import org.usfirst.frc.team3539.robot.utilities.DirectionalButton;
import org.usfirst.frc.team3539.robot.utilities.DirectionalButton.Direction;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	public Joystick controller1 = new Joystick(RobotMap.DRIVER); // Added spaces to fix spacing in logs
	public Joystick controller2 = new Joystick(RobotMap.OPERATOR);
	public Joystick NEScontroller = new Joystick(RobotMap.NES);

	// NES Controller
	public JoystickButton nesA = new JoystickButton(NEScontroller, RobotMap.NES_A);
	public JoystickButton nesB = new JoystickButton(NEScontroller, RobotMap.NES_B);
	public JoystickButton nesSTART = new JoystickButton(NEScontroller,RobotMap.NES_START);
	public JoystickButton nesSELECT = new JoystickButton(NEScontroller, RobotMap.NES_SELECT);
	public DirectionalButton nesLeft = new DirectionalButton(Direction.LEFT, NEScontroller);
	public DirectionalButton nesRight = new DirectionalButton(Direction.RIGHT, NEScontroller);
	public DirectionalButton nesUp = new DirectionalButton(Direction.UP, NEScontroller);
	public DirectionalButton nesDown = new DirectionalButton(Direction.DOWN, NEScontroller);

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

	public DirectionalButton onePadLeft = new DirectionalButton(Direction.LEFT, controller1);
	public DirectionalButton onePadRight = new DirectionalButton(Direction.RIGHT, controller1);
	public DirectionalButton onePadUp = new DirectionalButton(Direction.UP, controller1);
	public DirectionalButton onePadDown = new DirectionalButton(Direction.DOWN, controller1);

	public DirectionalButton twoPadLeft = new DirectionalButton(Direction.LEFT, controller2);
	public DirectionalButton twoPadRight = new DirectionalButton(Direction.RIGHT, controller2);
	public DirectionalButton twoPadUp = new DirectionalButton(Direction.UP, controller2);
	public DirectionalButton twoPadDown = new DirectionalButton(Direction.DOWN, controller2);

	public OI()
	{
		nesA.whileHeld(new DriveCommandNES(1));
		nesB.whileHeld(new DriveCommandNES(-1));
		
		// oneA.whileHeld(new BreakMode());
		// twoPadUp.whileHeld(new ElevatorCommand(1));
		// twoPadDown.whileHeld(new ElevatorCommand(-1));
		//
		// twoA.whileHeld(new IntakeCommand(1));
		// twoX.whileHeld(new IntakeCommand(.5));
		// twoY.whileHeld(new IntakeCommand(-.5));
		// twoB.whileHeld(new IntakeCommand(-1));
		//
		// oneA.whileHeld(new LimitCommand());
		//
		// oneX.whenPressed(new BeamSensorCommand());
	}
}