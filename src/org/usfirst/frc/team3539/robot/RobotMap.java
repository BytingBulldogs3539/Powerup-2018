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

	// PDP
	public static final int pdp = 30;
	
	// AIR
	public static final int compressor = 20;

	// PCM
	public static final int pcm = 10;
	
	public static int intakesolOn = 0;
	public static int intakesolOff = 1;
	
	public static int liftersolOn = 2;
	public static int liftersolOff = 3;
	
	public static int rampsolOn = 4;
	public static int rampsolOff = 5;
	
	public static int shiftersolOn = 6;
	public static int shiftersolOff =7;

	// PITCH
	public static final int pitch = 6;
	public static final int pitchLimitUp = 0;
	public static final int pitchLimitDown = 0;
	public static double pitchPea = .001;
	public static double pitchEye = .0;
	public static double pitchDee = .0;
	public static int pitchEncPosDown = 0; // SOME INT
	public static int pitchEncPosUp = 0; // SOME INT
	public static int pitchEncPosIntake = 0; // SOME INT

	// DRIVETRAIN
	public static final int lf = 10; // Tina 9 Prac 10
	public static final int lb = 11;// Tina 11 Prac 11
	
	public static final int rf = 2;// Tina 4 Prac 2
	public static final int rb = 1;// Tina none Prac 1

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

	// Tina - Change to new bot
	public static final double wheelCir = 12.56;
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
	public static int kTimeoutMs;
	public static double kNeutralDeadband;
	public static int kBaseTrajPeriodMs;

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
	public static double ElevatorPea = 0;
	public static double ElevatorEye = 0;
	public static double ElevatorDee = 0;
	public static double ElevatorFFF = 0;

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";

	//////////////////////// PRACTICE BOT/////////////////////

	//////////////////////// COMP BOT /////////////////////////
}
