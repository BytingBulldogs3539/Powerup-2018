package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.commands.ElevatorManualCommand;
import org.usfirst.frc.team3539.robot.commands.ElevatorZeroCommand;
import org.usfirst.frc.team3539.robot.commands.IntakeCommand;
import org.usfirst.frc.team3539.robot.commands.PitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.PitchManualCommand;
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

		two.buttonA.whenPressed(new ElevatorPositionCommand(ElevatorPosition.FLOOR));
		two.buttonB.whenPressed(new ElevatorPositionCommand(ElevatorPosition.SWITCH));

		two.buttonX.whenPressed(new ElevatorPositionCommand(ElevatorPosition.CLIMB));
		two.buttonY.whenPressed(new ElevatorPositionCommand(ElevatorPosition.SCALE));
		
//		two.buttonBL.whenPressed();
//		two

		// Pitch
		//two.buttonPadRight.whenPressed(new PitchCommand(PitchAngle.INTAKE));
		
		two.buttonPadUp.whenPressed(new PitchManualCommand(.4));
		two.buttonPadDown.whenPressed(new PitchManualCommand(-.4));
		
		two.buttonPadUp.whenReleased(new PitchManualCommand(0));
		two.buttonPadDown.whenReleased(new PitchManualCommand(0));

		// Intake
		two.buttonTR.whenPressed(new IntakeCommand(-.5));
		two.buttonTL.whenPressed(new IntakeCommand(.5));
		
		two.buttonTR.whenReleased(new IntakeCommand(0));
		two.buttonTL.whenReleased(new IntakeCommand(0));
	}
}