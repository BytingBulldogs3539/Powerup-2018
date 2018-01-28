package org.usfirst.frc.team3539.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name. This provides
 * flexibility changing wiring, makes checking the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// CONTROLLER PORT
	public static final int DRIVER = 1;
	public static final int OPERATOR = 0;
	public static final int NES = 3;
	// Press F1 to refresh Controllers

	// NES Controller Inputs
	public static final int NES_A = 1;
	public static final int NES_B = 2;
	public static final int NES_SELECT = 3;
	public static final int NES_START = 4;
	public static final int NES_X_Axis = 0;
	public static final int NES_Y_Axis = 1;

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
	public static final int lf = 1;
	public static final int lm = 2;
	public static final int lb = 3;

	public static final int rf = 6;
	public static final int rm = 5;
	public static final int rb = 4;

	public static double drivePea = .06;
	public static double driveEye = .00002;
	public static double driveDee = .1;
	public static double driveFFF = .0;

	public static double turnPea = 0.1;
	public static double turnEye = 0.0000023;
	public static double turnDee = 0.1;
	public static double turnFFF = 0;

	public static double breakPea = 0.05;
	public static double breakEye = 0.0;
	public static double breakDee = 0.0;
	public static double breakFFF = 0.1;

	public static final double wheelCir = 12.56;

	public static final double robotCir = 103.62;

	// Deadbands
	public static double throttleDeadband = 0.02;
	public static double wheelDeadband = 0.02;

	// Determines the upper threshold where turning is limited to make high speed travel more controllable
	public static double throttleHighPass = .5;

	// These factor determine how fast the wheel or throttle traverses the "non linear" sin/tan curve.
	public static double wheelNonLinearity = 0.65;
	public static double throttleNonLinearity = 0.75;

	public static double highSpeedWheel = 0.5;

	// INTAKE
	public static final int lIntakeMotor = 1; // I don't know what the actual Talon number will be
	public static final int rIntakeMotor = 2; // I don't know what the actual Talon number will be

	// LIFTER
	public static final int l1LifterMotor = 0; // I don't know what the actual Talon number will be
	public static final int l2LifterMotor = 2;
	public static final int r1LifterMotor = 1;
	public static final int r2LifterMotor = 0; // I don't know what the actual Talon number will be

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";

	//////////////////////// PRACTICE BOT/////////////////////

	//////////////////////// COMP BOT /////////////////////////
}
