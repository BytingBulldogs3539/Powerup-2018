package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autongroups.CurveAuton100;
import org.usfirst.frc.team3539.robot.autongroups.DefaultAuton;
import org.usfirst.frc.team3539.robot.autongroups.Lol200;
import org.usfirst.frc.team3539.robot.autongroups.Straight200;
import org.usfirst.frc.team3539.robot.autongroups.Straight50;
import org.usfirst.frc.team3539.robot.autongroups.TestAuto;
import org.usfirst.frc.team3539.robot.autongroups.floor;
import org.usfirst.frc.team3539.robot.profiles.lol200;
import org.usfirst.frc.team3539.robot.subsystems.DriveTrain;
import org.usfirst.frc.team3539.robot.subsystems.Elevator;
import org.usfirst.frc.team3539.robot.subsystems.Intake;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch;
import org.usfirst.frc.team3539.robot.subsystems.SerialSub;
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
 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as described in the IterativeRobot documentation. If you change the name of this class or the package after creating this
 * project, you must also update the manifest file in the resource directory.
 **/

public class Robot extends IterativeRobot
{
	// SUBSYSTEMS
	public static DriveTrain driveTrain = new DriveTrain();
	public static Intake intake = new Intake();
	public static Elevator elevator = new Elevator();
	public static LateralPitch pitch = new LateralPitch();
	public static Solenoids solenoids = new Solenoids();
	public static SerialSub serialSub = new SerialSub();

	// public static SerialSub serialSub = new SerialSub(); uncoment when theres
	// actually an arudion on it

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
		pdp = new PowerDistributionPanel(RobotMap.pdp);
		c = new Compressor(RobotMap.pcm);

		SmartInit();

		try
		{
			cameraOne = CameraServer.getInstance().startAutomaticCapture(0);
			cameraOne.setResolution(240, 135);
			cameraOne.setFPS(20);
		}
		catch (Error e)
		{
		}
	}

	/**
	 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as described in the TimedRobot documentation. If you change the name of this class or the package after creating this
	 * project, you must also update the build.properties file in the project.
	 */

	@Override
	public void disabledInit()
	{
		c.stop();
		Scheduler.getInstance().run();
		//Robot.driveTrain.DisabledMotionProfile();
	}

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
		//driveTrain.log.flush();
	}

	public void autonomousInit()
	{
		//Robot.driveTrain.zeroEncoders();
		// Robot.driveTrain.calibrateGyro();
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
		Robot.driveTrain.updateEncoders();
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
		Robot.driveTrain.zeroEncoders();
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
		//autonChooser.addObject("lol200", new Lol200());
	//	autonChooser.addObject("CurveAuton100", new CurveAuton100());
	//	autonChooser.addObject("jfloor", new floor());
		autonChooser.addObject("straight50", new Straight50());
	//	autonChooser.addObject("straight200", new Straight200());
	//	autonChooser.addObject("Default Auton Center", new DefaultAuton());
	//	autonChooser.addObject("Tune Turn 45", new AutonTurnEncoderCommand(45, 100));

		autonChooser.addObject("TestAuto", new TestAuto());

		positionChooser.addObject("Left", null);
		positionChooser.addDefault("Middle", null);
		positionChooser.addObject("Right", null);

		allianceChooser.addDefault("Red", null);
		allianceChooser.addObject("Blue", null);

		SmartDashboard.putData("Auton mode", autonChooser);

		SmartDashboard.putData("Auton Position", positionChooser);

		SmartDashboard.putData("Alliance", allianceChooser);
		System.out.println("Settings");

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

		SmartDashboard.putData("PDP", pdp);

		SmartDashboard.putNumber("Right Enc", 0);
		SmartDashboard.putNumber("Left Enc", 0);

		SmartDashboard.putNumber("throttleDeadband", RobotMap.throttleDeadband);
		SmartDashboard.putNumber("wheelDeadband", RobotMap.wheelDeadband);

		SmartDashboard.putNumber("throttleHighPass", RobotMap.throttleHighPass);

		SmartDashboard.putNumber("wheelNonLinearity", RobotMap.wheelNonLinearity);
		SmartDashboard.putNumber("throttleNonLinearity", RobotMap.throttleNonLinearity);

		SmartDashboard.putNumber("highSpeedWheel", RobotMap.highSpeedWheel);

		// SmartDashboard.putNumber("Range Finder Front",
		// Robot.serialSub.getDistance(RobotMap.frontRangeFinder));
		// SmartDashboard.putNumber("Range Finder Right",
		// Robot.serialSub.getDistance(RobotMap.rightRangeFinder));
		// SmartDashboard.putNumber("Range Finder Left",
		// Robot.serialSub.getDistance(RobotMap.leftRangeFinder));
		// SmartDashboard.putNumber("Range Finder Back",
		// Robot.serialSub.getDistance(RobotMap.backRangeFinder));

		// autonChooser.addDefault("No Auton, Default", new VoidCommand());
		// autonChooser.addObject("Auton Turn 180", new AutonTurn(180));

		SmartDashboard.putData(Scheduler.getInstance());
	}

}