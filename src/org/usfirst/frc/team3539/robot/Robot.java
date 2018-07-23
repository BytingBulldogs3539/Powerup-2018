package org.usfirst.frc.team3539.robot;

import com.sun.org.apache.regexp.internal.recompile;

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
 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as
 * described in the IterativeRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the manifest file in the resource directory.
 **/

public class Robot extends IterativeRobot
{
	//SwerveWheel
	//SwerveDrive drive = new SwerveDrive()

	
	public static OI oi;
	public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	// SendableChooser<Command> positionChooser = new SendableChooser<Command>();
	// SendableChooser<Command> allianceChooser = new SendableChooser<Command>();
	SendableChooser<Command> autonChooser = new SendableChooser<Command>();

	public void robotInit()
	{
		oi = new OI();
		// pdp = new PowerDistributionPanel(RobotMap.pdp);
		//
		// Reader d = new Reader(driveTrain, 1 , true);
		// //d.addMethod("getName");
		// // l.add(d);
		// Reader i = new Reader(intake, 1 , true);
		//// i.addMethod("getName");
		// // l.add(i);
		// Reader e = new Reader(elevator, 1 , true);
		//// e.addMethod("getName");
		// // l.add(e);
		// Reader p = new Reader(pitch, 1 , true);
		//// p.addMethod("getName");
		// // l.add(p);
		// Reader s = new Reader(solenoids, 1 , true);
		//// s.addMethod("getName");
		// // l.add(s);

		SmartInit();

	}
	/**
	 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as
	 * described in the TimedRobot documentation. If you change the name of this class or the package after creating
	 * this project, you must also update the build.properties file in the project.
	 */

	@Override
	public void disabledInit()
	{
		//c.start();// TODO:REMOVE
		Scheduler.getInstance().run();
		// Robot.driveTrain.DisabledMotionProfile();
		// l.stop();
	}

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
		// driveTrain.log.flush();
		// System.out.println("Im Disabled");
	}

	public void autonomousInit()
	{
	}

	public void autonomousPeriodic()
	{
		

		}
		// Robot.driveTrain.updateEncoders();
	

	public void teleopInit()
	{
		// l.start();

	}

	public void teleopPeriodic()
	{
		
	}

	public void testPeriodic()
	{
	}

	public void SmartInit()
	{
		

	
	}
	
	

}