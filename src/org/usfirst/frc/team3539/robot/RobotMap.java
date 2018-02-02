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

	// AIR
	public static final int compressor = 10;

	// PCM
	public static final int pcm = 10;
	
	// PITCH
	public static final int pitch = 3539;

	// DRIVETRAIN
	
	public static final int lf = 3539;//1
	public static final int lm = 3539;//2
	public static final int lb = 3539;//3539;//3

	public static final int rf = 3539;//6
	public static final int rm = 3539;//5
	public static final int rb = 3539;//4

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

	//Current Control
	public static final double maxCurrent=120;
	
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
	public static final int lIntakeMotor = 3539;
	public static final int rIntakeMotor = 3539;

	// LIFTER
	public static final int l1LifterMotor = 1;
	public static final int r1LifterMotor = 2;

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";

	//////////////////////// PRACTICE BOT/////////////////////

	//////////////////////// COMP BOT /////////////////////////
}
