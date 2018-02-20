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
	// Press F1 to refresh Controllers

	// PDP
	public static final int pdp = 30;
	
	// PCM
	public static final int pcm = 20;//20

	public static int intakesolOn = 1;
	public static int intakesolOff = 0;

	// public static int rampsolOn = 4;
	// public static int rampsolOff = 5;

	public static int shiftersolOn = 2;
	public static int shiftersolOff = 3;

	// PITCH
	public static final int pitch = 6;
	public static final int pitchLimitUp = 0;
	public static final int pitchLimitDown = 0;
	public static double pitchPea = .0001;
	public static double pitchEye = .0;
	public static double pitchDee = .0;
	public static int pitchEncPosDown = 0; // SOME INT
	public static int pitchEncPosUp = 0; // SOME INT
	public static int pitchEncPosIntake = 0; // SOME INT

	// DRIVETRAIN
	public static final int lf = 6; // Tina 6 Prac 10
	public static final int lb = 0;// Tina 7 Prac 9

	public static final int rf = 4;// Tina 4 Prac 2
	public static final int rb = 0;// Tina 3 Prac 1

	public static double driveLeftPea = .045;
	public static double driveLeftEye = 0.000001;
	public static double driveLeftDee = 0.0000001;
	public static double driveLeftFFF = 0.0;
	

	public static double driveRightPea = .045;
	public static double driveRightEye = 0.000001;
	public static double driveRightDee = 0.0000001;
	public static double driveRightFFF = 0.0;

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

	// Tina - Change to new bot
	public static final double wheelCir = 18.84;
	// Tina - Change to new bot
	public static final double robotCir = 103.62;

	// Drivetrain Deadbands
	public static double throttleDeadband = 0.02;
	public static double wheelDeadband = 0.02;

	// Determines the upper threshold where turning is limited to make high speed travel more controllable
	public static double throttleHighPass = .5;

	// These factor determine how fast the wheel or throttle traverses the "non linear" sin/tan curve.
	public static double wheelNonLinearity = 0.65;
	public static double throttleNonLinearity = 0.75;

	public static double highSpeedWheel = 0.5;
	public static int kTimeoutMs = 10;
	public static double kNeutralDeadband;
	public static int kBaseTrajPeriodMs =10;

	// INTAKE
	public static final int lIntakeMotor = 7;// Prac 7
	public static final int rIntakeMotor = 8;// Prac 8

	// Elevator
	public static final int elevatorMotorOne = 4;// Prac 3 // Broken talon 4 // Prac backup 3
	public static final int elevatorMotorTwo = 5;// Prac 5
	public static final int elevatorEncoderFloor = 0; // SOME INT
	public static final int elevatorEncoderSwitch = 0; // SOME INT
	public static final int elevatorEncoderClimb = 0; // SOME INT
	public static final int elevatorEncoderScale = 0; // SOME INT
	public static double elevatorPea = .075;
	public static double elevatorEye = 0.0001;
	public static double elevatorDee = 0.0000001;
	public static double elevatorFFF = 0;
	public static double driveTrainScale=1;

	// RANGE FINDING
	public static final int frontRangeFinder = 0;
	public static final int backRangeFinder = 1;
	public static final int rightRangeFinder = 2;
	public static final int leftRangeFinder = 3;

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";

	//////////////////////// PRACTICE BOT/////////////////////

	//////////////////////// COMP BOT /////////////////////////
}
