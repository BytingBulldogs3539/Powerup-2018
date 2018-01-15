package org.usfirst.frc.team3539.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name. This provides flexibility changing wiring, makes checking the wiring easier and significantly reduces the number of magic numbers floating
 * around.
 */
public class RobotMap
{
	// CONTROLLER PORT
	public static final int DRIVER = 1;
	public static final int OPERATOR = 0;
	// Press F1 to refresh Controllers

	// CONTROLLER AXIS
	public static final int X_AxisL = 0;
	public static final int Y_AxisL = 1;

	public static final int X_AxisR = 4;
	public static final int Y_AxisR = 5;

	public static final int RIGHT_TRIGGER = 3;
	public static final int LEFT_TRIGGER = 2;

	// BUTTON
	public static final int A = 1;
	public static final int B = 2;
	public static final int X = 3;
	public static final int Y = 4;

	public static final int START = 8;

	public static final int LS = 9;
	public static final int RS = 10;

	// BUMPER
	public static final int BL = 5;
	public static final int BR = 6;

	// PRINTLNLOG
	public static final boolean shouldPrintInput = true;
	public static final boolean shouldPrintEvent = true;
	public static final boolean shouldPrintCommand = true;
	public static final boolean shouldPrintSubsystem = true;

	// AIR
	public static final int compressor = 10;

	// PCM
	public static final int pcm = 10;

	// DRIVETRAIN
	public static final int lf = 1; // Left Front Drive Talon
	public static final int lb = 2; // Left Back Drive Talon
	public static final int rf = 6; // Right Front Drive Talon
	public static final int rb = 5; // Right Back Drive Talon

	//LIFTER
	public static final int LifterMotor=1;
	
	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";
	
	// INTAKE
	public static final int intakeMotorTalon1 = /* Ayy put the talon nuber here */;
	public static final int intakeMotorTalon2 = /* Ayy put the talon nuber here */;

	//////////////////////// PRACTICE BOT/////////////////////
	
	

	//////////////////////// COMP BOT/////////////////////////
}
