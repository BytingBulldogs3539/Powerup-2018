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
	private static IMap botMap = new CompMap();
	public static int botType = botMap.getBotType();

	// PDP
	public static final int pdp = 30;

	// PCM
	public static final int pcm = 20;// Disable 00

	public static int intakesolOn = 0;
	public static int intakesolOff = 1;

	public static int climbsolOn = 4;
	public static int climbsolOff = 5;

	public static int shiftersolOn = 2;
	public static int shiftersolOff = 3;

	// PITCH
	public static final int pitch = botMap.getPitch();

	public static double pitchPea = botMap.getPitchPea();
	public static double pitchEye = botMap.getPitchEye();
	public static double pitchDee = botMap.getPitchDee();
	public static double pitchFFF = botMap.getPitchFFF();

	public static int pitchEncPosDown = 0; // SOME INT
	public static int pitchEncPosUp = 0; // SOME INT
	public static int pitchEncPosIntake = 0; // SOME INT

	// DRIVETRAIN
	public static final int lf = botMap.getLf();
	public static final int lb = botMap.getLb();

	public static final int rf = botMap.getRf();
	public static final int rb = botMap.getRb();

	public static double drivePea = botMap.getDrivePea();
	public static double driveEye = botMap.getDriveEye();
	public static double driveDee = botMap.getDriveDee();
	public static double driveFFF = botMap.getDriveFFF();

	public static double turnPeaWheels = 1.3;
	public static double turnEyeWheels = 0.0001;
	public static double turnDeeWheels = .08;
	public static double turnFFFWheels = 0;

	public static double turnPeaGyro = 1.3;
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
	public static final double robotCir = 80;

	// Drivetrain Deadbands
	public static double throttleDeadband = 0.05;
	public static double wheelDeadband = 0.05;

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
	public static final int lIntakeMotor = botMap.getLIntakeMotor();// Prac 7
	public static final int rIntakeMotor = botMap.getRIntakeMotor();// Prac 8

	// Elevator
	public static final int elevatorMotorOne = botMap.getElevatorMotor1();// Prac 3 // Broken talon 4 // Prac backup 3
	public static final int elevatorMotorTwo = botMap.getElevatorMotor2();// Prac 5
	public static final int climbMotor = 18;

	public static double elevatorPea = botMap.getElevatorPea();// .95 comp
	public static double elevatorEye = botMap.getElevatorEye();
	public static double elevatorDee = botMap.getElevatorDee();// 1 comp
	public static double elevatorFFF = botMap.getElevatorFFF();

	// RANGE FINDING
	public static final int frontRangeFinder = 0;
	public static final int backRangeFinder = 1;
	public static final int rightRangeFinder = 2;
	public static final int leftRangeFinder = 3;

	// LOGGING
	public static final String RIO_DIR = "/home/lvuser/logs/";
	public static final String FLASH_DIR = "/u/";
}
