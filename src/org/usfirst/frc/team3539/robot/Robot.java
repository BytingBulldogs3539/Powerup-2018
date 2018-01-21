package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3539.robot.subsystems.Intake;
import org.usfirst.frc.team3539.robot.subsystems.Lifter;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
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
	public static Intake intake = new Intake();
	public static Lifter lifter = new Lifter();

	//public static Compressor c;
	public static OI oi;
	public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	SendableChooser<Command> autonChooser;

	public void robotInit()
	{
		//c = new Compressor(RobotMap.compressor);

		oi = new OI();

		cameraOne = CameraServer.getInstance().startAutomaticCapture(0);
		cameraOne.setResolution(480, 360);
		
		cameraTwo = CameraServer.getInstance().startAutomaticCapture(1);
		cameraTwo.setResolution(480, 360);
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
		Update();
	}

	public void autonomousInit()
	{
		Update();

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
		Update();
	}

	public void teleopInit()
	{
		System.out.println("teleopInit");
	}

	// This function is called periodically during operator control
	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();
		Update();
	}

	// This function is called periodically during test mode
	public void testPeriodic()
	{
	}

	public void Update()
	{
	}

	public void SmartInit()
	{
		autonChooser = new SendableChooser<Command>();

		SmartDashboard.putData("Auton mode", autonChooser);
		// autonChooser.addDefault("No Auton, Default", new VoidCommand());
		// autonChooser.addObject("Auton Turn 180", new AutonTurn(180));

		SmartDashboard.putData(Scheduler.getInstance());
	}
}