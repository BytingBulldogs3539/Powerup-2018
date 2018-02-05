package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.commands.BreakModeCommand;
import org.usfirst.frc.team3539.robot.commands.ElevatorCommand;
import org.usfirst.frc.team3539.robot.commands.LiftManual;
import org.usfirst.frc.team3539.robot.commands.PitchCommand;
import org.usfirst.frc.team3539.robot.subsystems.Elevator.ElevatorPosition;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch.PitchAngle;
import org.usfirst.frc.team3539.robot.utilities.LogitechF310;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands and command groups
 * that allow control of the robot.
 */
public class OI
{
	public LogitechF310 one = new LogitechF310(RobotMap.DRIVER);
	public LogitechF310 two = new LogitechF310(RobotMap.OPERATOR);

	public OI()
	{
		//Driver
		one.buttonA.whileHeld(new BreakModeCommand());
		
		//Elevator
		two.buttonSTART.whenPressed(new LiftManual());
		
		//Pitch
		two.buttonPadDown.whenPressed(new PitchCommand(PitchAngle.DOWN));
		two.buttonPadRight.whenPressed(new PitchCommand(PitchAngle.INTAKE));
		two.buttonPadUp.whenPressed(new PitchCommand(PitchAngle.UP));
		
		two.buttonY.whenPressed(new ElevatorCommand(ElevatorPosition.SCALE));
		two.buttonB.whenPressed(new ElevatorCommand(ElevatorPosition.SWITCH));
		two.buttonA.whenPressed(new ElevatorCommand(ElevatorPosition.FLOOR));
		
	}
}