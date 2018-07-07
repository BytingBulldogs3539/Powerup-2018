package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.autongroups.ScaleRight;
import org.usfirst.frc.team3539.robot.commands.DisableSoftLimits;
import org.usfirst.frc.team3539.robot.middleAutons.Middle;
import org.usfirst.frc.team3539.robot.subsystems.Climb;
import org.usfirst.frc.team3539.robot.subsystems.DriveTrain;
import org.usfirst.frc.team3539.robot.subsystems.Elevator;
import org.usfirst.frc.team3539.robot.subsystems.Intake;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch;
import org.usfirst.frc.team3539.robot.subsystems.Solenoids;

import com.sun.org.apache.regexp.internal.recompile;

import NewAndImproved.MotionProfileExample2;
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
	// SUBSYSTEMS
	// public static Logger l = new Logger();
	public static DriveTrain driveTrain = new DriveTrain();
	public static Intake intake = new Intake();
	public static Elevator elevator = new Elevator();
	public static LateralPitch pitch = new LateralPitch();
	public static Solenoids solenoids = new Solenoids();
	public static Climb climb = new Climb();

	// public static SerialSub serialSub = new SerialSub();
	public static int counter = 0;
	public static boolean done = false;

	public static String gameData = "   ";

	// public static SerialSub serialSub = new SerialSub(); uncoment when theres
	// actually an arudion on it

	// public static PowerDistributionPanel pdp;
	public static Compressor c;
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
		c = new Compressor(RobotMap.pcm);
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

		try
		{
			//
			cameraOne = CameraServer.getInstance().startAutomaticCapture(0);
			cameraOne.setResolution(240, 135);
			cameraOne.setFPS(20);
			cameraOne.setExposureManual(50);
			cameraOne.setBrightness(50);
		}
		catch (Error eeee)
		{

			System.out.println("--------------");
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
		c.start();
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
	}

	public void autonomousPeriodic()
	{
		// SmartDashboard.putNumber("pitchEnc", pitch.getEncoder());
		if (counter > 25 || DriverStation.getInstance().getGameSpecificMessage().length() > 0)
		{
			counter++;
			// System.out.println("counter " + counter);
			if (!done)
			{
				gameData = DriverStation.getInstance().getGameSpecificMessage();
				System.out.println("entered auton setter");
				autonMode = (Command) autonChooser.getSelected();

				try
				{
					autonMode = autonMode.getClass().newInstance();
				}
				catch (InstantiationException e)
				{
					e.printStackTrace();
				}
				catch (IllegalAccessException e)
				{
					e.printStackTrace();
				}

				autonMode.start();
				done = true;
			}

		}
		// Robot.driveTrain.updateEncoders();
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
		// l.start();
		Robot.driveTrain.disableRamp();
		Robot.driveTrain.zeroEncoders();
		Robot.elevator.setMotorPower(0);
	}

	public void teleopPeriodic()
	{
		// SmartDashboard.putNumber("pitchEnc", pitch.getEncoder());
		Robot.driveTrain.updateEncoders();
		Scheduler.getInstance().run();
	}

	public void testPeriodic()
	{
	}

	public void SmartInit()
	{
		// Middle and Straight
		//autonChooser.addObject("MiddleSwitch", new MiddleSwitch());
		
		SmartDashboard.putData("Auton Mode", autonChooser);

		autonChooser.addObject("AUTONTESTMIDDLE", new Middle());
		autonChooser.addObject("Scale", new ScaleRight());
		
		
		
		
		
		SmartDashboard.putNumber("drivePea", RobotMap.drivePea);
		SmartDashboard.putNumber("driveEye", RobotMap.driveEye);
		SmartDashboard.putNumber("driveDee", RobotMap.driveDee);
		SmartDashboard.putNumber("driveFFF", RobotMap.driveFFF);

		SmartDashboard.putNumber("pitchEnc", pitch.getEncoder());
		SmartDashboard.putNumber("PitchP", RobotMap.pitchPea);
		SmartDashboard.putNumber("PitchD", RobotMap.pitchDee);

		SmartDashboard.putNumber("TurnP", RobotMap.turnPeaWheels);
		SmartDashboard.putNumber("TurnI", RobotMap.turnEyeWheels);
		SmartDashboard.putNumber("TurnD", RobotMap.turnDeeWheels);
		SmartDashboard.putNumber("TurnF", RobotMap.turnFFFWheels);

		SmartDashboard.putNumber("BreakP", RobotMap.breakPea);
		SmartDashboard.putNumber("BreakI", RobotMap.breakEye);
		SmartDashboard.putNumber("BreakD", RobotMap.breakDee);
		SmartDashboard.putNumber("BreakF", RobotMap.breakFFF);

		SmartDashboard.putNumber("ElevatorP", RobotMap.elevatorPea);
		SmartDashboard.putNumber("ElevatorI", RobotMap.elevatorEye);
		SmartDashboard.putNumber("ElevatorD", RobotMap.elevatorDee);
		SmartDashboard.putNumber("ElevatorF", RobotMap.elevatorFFF);

		// SmartDashboard.putData("PDP", pdp);

		SmartDashboard.putNumber("Right Enc", 0);
		SmartDashboard.putNumber("Left Enc", 0);

		SmartDashboard.putNumber("throttleDeadband", RobotMap.throttleDeadband);
		SmartDashboard.putNumber("wheelDeadband", RobotMap.wheelDeadband);

		SmartDashboard.putNumber("throttleHighPass", RobotMap.throttleHighPass);

		SmartDashboard.putNumber("wheelNonLinearity", RobotMap.wheelNonLinearity);
		SmartDashboard.putNumber("throttleNonLinearity", RobotMap.throttleNonLinearity);

		SmartDashboard.putNumber("highSpeedWheel", RobotMap.highSpeedWheel);


		SmartDashboard.putData(Scheduler.getInstance());
		SmartDashboard.putData(new DisableSoftLimits());

	
	}
	
	

}