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

	/*
	 * Map - PracMap() or CompMap() or TinaMap()
	 */
	private static IMap botProfile = new CompMap();

	// PDP
	public static final int pdp = 30;

	// PCM
	public static final int pcm = 20;// Disable 00 Prac 20 Comp 20

	public static int intakesolOn = 1;
	public static int intakesolOff = 0;

	public static int locksolOn = 5;
	public static int locksolOff = 4;

	public static int shiftersolOn = 3;
	public static int shiftersolOff = 2;

	// PITCH
	public static final int pitch = 6;
	public static final int pitchLimitUp = 0;
	public static final int pitchLimitDown = 0;
	
	public static double pitchPea = .6;
	public static double pitchEye = .0;
	public static double pitchDee = .0;
	public static double pitchFFF = -.03;

	
	public static int pitchEncPosDown = 0; // SOME INT
	public static int pitchEncPosUp = 0; // SOME INT
	public static int pitchEncPosIntake = 0; // SOME INT

	// DRIVETRAIN
	public static final int lf = botProfile.getLf();
	public static final int lb = botProfile.getLb();

	public static final int rf = botProfile.getRf();
	public static final int rb = botProfile.getRb();
	

	public static double drivePea = .7;
	public static double driveEye = 0.0;
	public static double driveDee = 0.0;
	public static double driveFFF = .13;
	
//	public static double drivePea = .5;
//	public static double driveEye = 0.0;
//	public static double driveDee = 0.0;
//	public static double driveFFF = .145;

	public static double turnPeaWheels = 0.1;
	public static double turnEyeWheels = 0.00005;
	public static double turnDeeWheels = 0;
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
	public static final double robotCir = 91;

	// Drivetrain Deadbands
	public static double throttleDeadband = 0.02;
	public static double wheelDeadband = 0.02;

	// Determines the upper threshold where turning is limited to make high speed
	// travel more controllable
	public static double throttleHighPass = .5;

	// These factor determine how fast the wheel or throttle traverses the "non
	// linear" sin/tan curve.
	public static double wheelNonLinearity = 0.65;
	public static double throttleNonLinearity = 0.75;

	public static double highSpeedWheel = 0.5;
	public static int kTimeoutMs = 10;
	public static double kNeutralDeadband;
	public static int kBaseTrajPeriodMs = 10;

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
	
	public static double elevatorPea = .95;
	public static double elevatorEye = 0.0;
	public static double elevatorDee = 1;
	public static double elevatorFFF = 0;

	// RANGE FINDING
	public static final int frontRangeFinder = 0;
	public static final int backRangeFinder = 1;
	public static final int rightRangeFinder = 2;
	public static final int leftRangeFinder = 3;

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";
}
