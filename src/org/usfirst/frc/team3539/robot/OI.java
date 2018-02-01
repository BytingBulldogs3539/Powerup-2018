package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.commands.BreakMode;
import org.usfirst.frc.team3539.robot.commands.LiftManual;
import org.usfirst.frc.team3539.robot.commands.PitchCommand;
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
		two.buttonA.whileHeld(new BreakMode());
		two.buttonSTART.whenPressed(new LiftManual());
		two.buttonX.whileHeld(new PitchCommand());
		two.buttonY.whileHeld(new PitchCommand());
	}
}