package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDrive;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurn;
<<<<<<< HEAD
import org.usfirst.frc.team3539.robot.autongroups.test;
=======
import org.usfirst.frc.team3539.robot.subsystems.Distance;
>>>>>>> 5f70d1ccb51fb402a127555d1b3a51256c493b30
import org.usfirst.frc.team3539.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3539.robot.subsystems.Intake;
import org.usfirst.frc.team3539.robot.subsystems.Lifter;
import org.usfirst.frc.team3539.robot.subsystems.Light;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
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
	public static Drivetrain drivetrain = new Drivetrain();
	public static Distance distance = new Distance();
	public static Intake intake = new Intake();
	public static Lifter lifter = new Lifter();
	public static Light light = new Light();

	// public static Compressor c;
	public static OI oi;
	//public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	SendableChooser<Command> autonChooser;

	public void robotInit()
	{
		oi = new OI();
		SmartInit();

//		cameraOne = CameraServer.getInstance().startAutomaticCapture(0);
//		cameraOne.setResolution(480, 360);
//
//		cameraTwo = CameraServer.getInstance().startAutomaticCapture(1);
//		cameraTwo.setResolution(480, 360);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You can use it to reset any subsystem information you want to clear when the robot is disabled.
	 **/
	public void disabledInit()
	{
		// BulldogLogger.getInstance().finishLogging();

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
		
		if(gameData.charAt(0) == 'L')
		{
			System.out.println("left auton");
			//Put left auto code here
		} else
		{
			System.out.println("right auton");
			//Put right auto code here
		}
		
		autonMode = (Command) autonChooser.getSelected();
		if (autonMode != null)
		{
			autonMode.start();
		}
	}

	// This function is called periodically during autonomous
	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
		System.out.println("teleopInit");
	}

	// This function is called periodically during operator control
	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();
	}

	// This function is called periodically during test mode
	public void testPeriodic()
	{
	}

	public void SmartInit()
	{
		autonChooser = new SendableChooser<Command>();
		autonChooser.addDefault("AutoDrive", new AutonDrive(60));
		autonChooser.addObject("AutoTurn", new AutonTurn(90));
		autonChooser.addObject("test", new test());

		SmartDashboard.putData("Auton mode", autonChooser);
		// autonChooser.addDefault("No Auton, Default", new VoidCommand());
		// autonChooser.addObject("Auton Turn 180", new AutonTurn(180));

		SmartDashboard.putData(Scheduler.getInstance());
	}
}