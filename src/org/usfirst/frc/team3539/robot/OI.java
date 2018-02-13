package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.commands.ElevatorManualCommand;
import org.usfirst.frc.team3539.robot.commands.ElevatorZeroCommand;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;
import org.usfirst.frc.team3539.robot.commands.PitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorCommand;
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
		// ONE -------------------------------

		
		
		// TWO -------------------------------

		// Elevator
		two.buttonSTART.whenPressed(new ElevatorManualCommand());
		two.buttonPadLeft.whenPressed(new ElevatorZeroCommand());

		two.buttonA.whenPressed(new ElevatorCommand(ElevatorPosition.FLOOR));
		two.buttonB.whenPressed(new ElevatorCommand(ElevatorPosition.SWITCH));

		two.buttonX.whenPressed(new ElevatorCommand(ElevatorPosition.CLIMB));
		two.buttonY.whenPressed(new ElevatorCommand(ElevatorPosition.SCALE));
		
//		two.buttonBL.whenPressed();
//		two

		// Pitch
		two.buttonPadUp.whenPressed(new PitchCommand(PitchAngle.UP));
		two.buttonPadRight.whenPressed(new PitchCommand(PitchAngle.INTAKE));
		two.buttonPadDown.whenPressed(new PitchCommand(PitchAngle.DOWN));

		// Intake
		two.buttonTR.whenPressed(new IntakeCommand(-1));
		two.buttonTL.whenPressed(new IntakeCommand(1));
	}
}