package org.usfirst.frc.team3539.robot;

import com.sun.org.apache.regexp.internal.recompile;

<<<<<<< HEAD
=======
import LeftAutons.LeftScale;
import LeftAutons.LeftScaleOrHalf;
import LeftAutons.LeftScaleOrStraight;
import NewAndImproved.AutonMotionProfileEx2;
import NewAndImproved.MotionProfileExample2;
import Profiles.crosslinestraight;
import Profiles.getcube;
import RightAutons.RightScale;
import RightAutons.RightScaleOrHalf;
import RightAutons.RightScaleOrStraight;
>>>>>>> 2437f4a23340f4ee84a773a0e5a519090eb33a52
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
<<<<<<< HEAD
=======
	//	c.stop();
		c.start();
>>>>>>> 2437f4a23340f4ee84a773a0e5a519090eb33a52
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
<<<<<<< HEAD
=======
		c.stop();
		// l.start();
		System.out.println("Auto Init");
		if (DriverStation.getInstance().getGameSpecificMessage().length() > 0)
		{
			gameData = DriverStation.getInstance().getGameSpecificMessage();
		}
		Robot.elevator.zeroEncoders();
		Robot.pitch.zeroEncoder();
		Robot.driveTrain.disableRamp();
		done = false;
		counter = 0;
>>>>>>> 2437f4a23340f4ee84a773a0e5a519090eb33a52
	}

	public void autonomousPeriodic()
	{
		

		}
		// Robot.driveTrain.updateEncoders();
	

	public void teleopInit()
	{
		c.start();
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
<<<<<<< HEAD
=======
		// Middle and Straight
		//autonChooser.addObject("MiddleSwitch", new MiddleSwitch());
		
		SmartDashboard.putData("Auton Mode", autonChooser);

		autonChooser.addObject("MiddleSwitch", new Middle());
		autonChooser.addObject("DriveStraight", new AutonMotionProfileEx2(crosslinestraight.Points,crosslinestraight.kNumPoints,true));

		autonChooser.addObject("RightScaleCross", new RightScale());
		autonChooser.addObject("RightScaleOrHalf", new RightScaleOrHalf());
		autonChooser.addObject("RightScaleOrStraight", new RightScaleOrStraight());
		
		autonChooser.addObject("LeftScaleCross", new LeftScale());
		autonChooser.addObject("LeftScaleOrHalf", new LeftScaleOrHalf());
		autonChooser.addObject("LeftScaleOrStraight", new LeftScaleOrStraight());
		
		autonChooser.addObject("Test",new TEst());
		
>>>>>>> 2437f4a23340f4ee84a773a0e5a519090eb33a52
		

	
	}
	
	

}