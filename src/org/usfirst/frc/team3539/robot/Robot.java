package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.subsystems.DriveTrain;
import org.usfirst.frc.team3539.robot.subsystems.Elevator;
import org.usfirst.frc.team3539.robot.subsystems.Intake;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch;
import org.usfirst.frc.team3539.robot.subsystems.MotionProfile;
import org.usfirst.frc.team3539.robot.subsystems.Solenoids;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as
 * described in the IterativeRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the manifest file in the resource directory.
 **/

public class Robot extends IterativeRobot
{
	public static MotionProfile motion = new MotionProfile();
	// SUBSYSTEMS
	public static DriveTrain driveTrain = new DriveTrain();
	public static Intake intake = new Intake();
	public static Elevator elevator = new Elevator();
	public static LateralPitch pitch = new LateralPitch();
	public static Solenoids solenoid = new Solenoids();

	// public static SerialSub serialSub = new SerialSub(); uncoment when theres actually an arudion on it

	public static PowerDistributionPanel pdp;
	public static Compressor c;
	public static OI oi;
	public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	SendableChooser<Command> positionChooser = new SendableChooser<Command>();
	SendableChooser<Command> allianceChooser = new SendableChooser<Command>();
	SendableChooser<Command> autonChooser = new SendableChooser<Command>();

	public void robotInit()
	{
		oi = new OI();
		pdp = new PowerDistributionPanel();

		SmartInit();

		try
		{
			cameraOne = CameraServer.getInstance().startAutomaticCapture(0);
			cameraOne.setResolution(480, 360);
			cameraTwo = CameraServer.getInstance().startAutomaticCapture(1);
			cameraTwo.setResolution(480, 360);
		}
		catch (Error e)
		{
		}
	}

	/**
	 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as
	 * described in the TimedRobot documentation. If you change the name of this class or the package after creating
	 * this project, you must also update the build.properties file in the project.
	 */

	@Override
	public void disabledInit()
	{
		Scheduler.getInstance().run();
	}

	public void disabledPeriodic()
	{
		// serialSub.getDistance(2);

		Scheduler.getInstance().run();
	}

	public void autonomousInit()
	{
		Robot.driveTrain.calibrateGyro();
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();

		if (gameData.charAt(0) == 'L')
		{
			System.out.println("left auton");
			// Put left auto code here
		}
		else
		{
			System.out.println("right auton");
			// Put right auto code here
		}

		autonMode = (Command) autonChooser.getSelected();
		if (autonMode != null)
		{
			autonMode.start();
		}
	}

	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
	}

	public void teleopPeriodic()
	{
		Robot.driveTrain.updateEncoders();
		Scheduler.getInstance().run();
	}

	public void testPeriodic()
	{
	}

	public void SmartInit()
	{

		positionChooser.addObject("Left", null);
		positionChooser.addDefault("Middle", null);
		positionChooser.addObject("Right", null);

		allianceChooser.addDefault("Red", null);
		allianceChooser.addObject("Blue", null);

		SmartDashboard.putData("Auton Position", positionChooser);

		SmartDashboard.putData("Alliance", allianceChooser);

		SmartDashboard.putNumber("DriveP", RobotMap.drivePea);
		SmartDashboard.putNumber("DriveI", RobotMap.driveEye);
		SmartDashboard.putNumber("DriveD", RobotMap.driveDee);
		SmartDashboard.putNumber("DriveF", RobotMap.driveFFF);

		SmartDashboard.putNumber("TurnP", RobotMap.turnPeaWheels);
		SmartDashboard.putNumber("TurnI", RobotMap.turnEyeWheels);
		SmartDashboard.putNumber("TurnD", RobotMap.turnDeeWheels);
		SmartDashboard.putNumber("TurnF", RobotMap.turnFFFWheels);

		SmartDashboard.putNumber("BreakP", RobotMap.breakPea);
		SmartDashboard.putNumber("BreakI", RobotMap.breakEye);
		SmartDashboard.putNumber("BreakD", RobotMap.breakDee);
		SmartDashboard.putNumber("BreakF", RobotMap.breakFFF);

		SmartDashboard.putNumber("ElevatorP", RobotMap.ElevatorPea);
		SmartDashboard.putNumber("ElevatorI", RobotMap.ElevatorEye);
		SmartDashboard.putNumber("ElevatorD", RobotMap.ElevatorDee);
		SmartDashboard.putNumber("ElevatorF", RobotMap.ElevatorFFF);

		SmartDashboard.putNumber("Right Enc VEL", 1);
		SmartDashboard.putNumber("Left Enc VEL", 1);

		SmartDashboard.putData("PDP", pdp);

		SmartDashboard.putNumber("Right Enc", 0);
		SmartDashboard.putNumber("Left Enc", 0);

		SmartDashboard.putNumber("throttleDeadband", RobotMap.throttleDeadband);
		SmartDashboard.putNumber("wheelDeadband", RobotMap.wheelDeadband);

		SmartDashboard.putNumber("throttleHighPass", RobotMap.throttleHighPass);

		SmartDashboard.putNumber("wheelNonLinearity", RobotMap.wheelNonLinearity);
		SmartDashboard.putNumber("throttleNonLinearity", RobotMap.throttleNonLinearity);

		SmartDashboard.putNumber("highSpeedWheel", RobotMap.highSpeedWheel);

		// autonChooser.addDefault("No Auton, Default", new VoidCommand());
		// autonChooser.addObject("Auton Turn 180", new AutonTurn(180));

		SmartDashboard.putData(Scheduler.getInstance());
	}
}