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
	public static final int NES = 3;
	// Press F1 to refresh Controllers

	// AIR
	public static final int compressor = 10;

	// PCM
	public static final int pcm = 10;
	public static int intakesolOn = 0;
	public static int intakesolOff = 0;
	public static int liftersolOn = 0;
	public static int liftersolOff = 0;
	public static int rampsolOn = 0;
	public static int rampsolOff = 0;

	// PITCH
	public static final int pitch = 3539;
	public static final int pitchLimitUp = 0;
	public static final int pitchLimitDown = 0;
	public static double pitchPea = .001;
	public static double pitchEye = .0;
	public static double pitchDee = .0;
	public static int pitchEncPosDown = 0; // SOME NUMBER
	public static int pitchEncPosUp = 0; // SOME NUMBER
	public static int pitchEncPosIntake = 0; // SOME NUMBER

	// DRIVETRAIN
	public static final int lf = 3539;// 1
	public static final int lm = 3539;// 2
	public static final int lb = 3539;// 3
	public static final int rf = 3539;// 6
	public static final int rm = 3539;// 5
	public static final int rb = 3539;// 4

	public static double drivePea = .06;
	public static double driveEye = .00002;
	public static double driveDee = .1;
	public static double driveFFF = .0;

	public static double turnPeaWheels = 0.1;
	public static double turnEyeWheels = 0.0000023;
	public static double turnDeeWheels = 0.1;
	public static double turnFFFWheels = 0;

	public static double turnPeaGyro = 0.1;
	public static double turnEyeGyro = 0.0000023;
	public static double turnDeeGyro = 0.1;
	public static double turnFFFGyro = 0;

	public static double breakPea = 0.05;
	public static double breakEye = 0.0;
	public static double breakDee = 0.0;
	public static double breakFFF = 0.1;

	public static final double wheelCir = 12.56;

	public static final double robotCir = 103.62;

	// Current Control
	public static final double maxCurrent = 120;

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

	// Elevator
	public static final int elevatorMotor1 = 1;
	public static final int elevatorMotor2 = 2;
	public static final int elevatorEncFloor = 0; // SOME NUMBER
	public static final int elevatorEncSwitch = 0; // SOME NUMBER
	public static final int elevatorEncClimb = 0; // SOME NUMBER
	public static final int elevatorEncScale = 0; // SOME NUMBER

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";

	//////////////////////// PRACTICE BOT/////////////////////

	//////////////////////// COMP BOT /////////////////////////
}
