package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.subsystems.DriveTrain;
import org.usfirst.frc.team3539.robot.subsystems.Elevator;
import org.usfirst.frc.team3539.robot.subsystems.Intake;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as described in the IterativeRobot documentation. If you change the name of this class or the package after creating this
 * project, you must also update the manifest file in the resource directory.
 **/

public class Robot extends IterativeRobot
{
	// SUBSYSTEMS
	public static DriveTrain driveTrain = new DriveTrain();	
	public static Intake intake = new Intake();
	public static Elevator elevator = new Elevator();

	public static Compressor c;
	public static OI oi;
	public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	SendableChooser<Command> positionChooser;
	SendableChooser<Command> allianceChooser;
	SendableChooser<Command> autonChooser;

	public void robotInit()
	{
		oi = new OI();
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

	public void disabledInit()
	{
		Scheduler.getInstance().run();
	}

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void autonomousInit()
	{
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
		Robot.driveTrain.updateEnc();
		Scheduler.getInstance().run();
	}

	public void testPeriodic()
	{
	}

	public void SmartInit()
	{
		positionChooser = new SendableChooser<Command>();
		positionChooser.addObject("Left", null);
		positionChooser.addDefault("Middle", null);
		positionChooser.addObject("Right", null);

		allianceChooser = new SendableChooser<Command>();
		allianceChooser.addDefault("Red", null);
		allianceChooser.addObject("Blue", null);

		SmartDashboard.putData("Auton Position", positionChooser);

		SmartDashboard.putData("Alliance", allianceChooser);

		SmartDashboard.putNumber("DriveP", RobotMap.drivePea);
		SmartDashboard.putNumber("DriveI", RobotMap.driveEye);
		SmartDashboard.putNumber("DriveD", RobotMap.driveDee);
		SmartDashboard.putNumber("DriveF", RobotMap.driveFFF);

		SmartDashboard.putNumber("TurnP", RobotMap.turnPea);
		SmartDashboard.putNumber("TurnI", RobotMap.turnEye);
		SmartDashboard.putNumber("TurnD", RobotMap.turnDee);
		SmartDashboard.putNumber("TurnF", RobotMap.turnFFF);

		SmartDashboard.putNumber("BreakP", RobotMap.breakPea);
		SmartDashboard.putNumber("BreakI", RobotMap.breakEye);
		SmartDashboard.putNumber("BreakD", RobotMap.breakDee);
		SmartDashboard.putNumber("BreakF", RobotMap.breakFFF);

		SmartDashboard.putNumber("Right Enc VEL", 1);
		SmartDashboard.putNumber("Left Enc VEL", 1);
		// SmartDashboard.putNumber("PDP Current", 1);

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