package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurnEncoderCommand;
import org.usfirst.frc.team3539.robot.autongroups.AutonCal100;
import org.usfirst.frc.team3539.robot.autongroups.AutonCal200;
import org.usfirst.frc.team3539.robot.autongroups.AutonCal50;
import org.usfirst.frc.team3539.robot.autongroups.AutonCalReverseSwitch;
import org.usfirst.frc.team3539.robot.autongroups.AutonExtakeDrive;
import org.usfirst.frc.team3539.robot.autongroups.AutonLeftScaleLeft;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleLeft2;
import org.usfirst.frc.team3539.robot.autongroups.AutonRightScaleRight;
import org.usfirst.frc.team3539.robot.autongroups.LeftSwitchLeft;
import org.usfirst.frc.team3539.robot.autongroups.LeftToRightSwich;
import org.usfirst.frc.team3539.robot.autongroups.MidScaleLeft;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchRight;
import org.usfirst.frc.team3539.robot.autongroups.RightSwitchRight2;
import org.usfirst.frc.team3539.robot.autons.AutonMiddleSwitch;
import org.usfirst.frc.team3539.robot.autons.DriveStraightAuton;
import org.usfirst.frc.team3539.robot.autons.LeftLeftScaleOrSwitchOrStraight;
import org.usfirst.frc.team3539.robot.autons.LeftLeftSwitchOrLeftScale;
import org.usfirst.frc.team3539.robot.autons.RightRightScaleorSwitchOrStraight;
import org.usfirst.frc.team3539.robot.autons.RightRightSwitchOrRightScale2;
import org.usfirst.frc.team3539.robot.commands.DisableSoftLimits;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.commands.ElevatorManualCommand;
import org.usfirst.frc.team3539.robot.logger.Logger;
import org.usfirst.frc.team3539.robot.logger.Reader;
import org.usfirst.frc.team3539.robot.autongroups.MidSwitchLeft;
import org.usfirst.frc.team3539.robot.profiles.DriveStraightLine3000;
import org.usfirst.frc.team3539.robot.profiles.lol200;
import org.usfirst.frc.team3539.robot.subsystems.DriveTrain;
import org.usfirst.frc.team3539.robot.subsystems.Elevator;
import org.usfirst.frc.team3539.robot.subsystems.Intake;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch;
import org.usfirst.frc.team3539.robot.subsystems.SerialSub;
import org.usfirst.frc.team3539.robot.subsystems.Solenoids;
import org.usfirst.frc.team3539.robot.utilities.OldLogger;

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
	//public static Logger l = new Logger();
	public static DriveTrain driveTrain = new DriveTrain();
	public static Intake intake = new Intake();
	public static Elevator elevator = new Elevator();
	public static LateralPitch pitch = new LateralPitch();
	public static Solenoids solenoids = new Solenoids();
	//public static SerialSub serialSub = new SerialSub();
	public static int counter = 0;
	public static boolean done = false;

	public static String gameData = "   ";

	// public static SerialSub serialSub = new SerialSub(); uncoment when theres
	// actually an arudion on it

	//public static PowerDistributionPanel pdp;
	public static Compressor c;
	public static OI oi;
	public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	//SendableChooser<Command> positionChooser = new SendableChooser<Command>();
	//SendableChooser<Command> allianceChooser = new SendableChooser<Command>();
	SendableChooser<Command> autonChooser = new SendableChooser<Command>();

	public void robotInit()
	{
		oi = new OI();
//		pdp = new PowerDistributionPanel(RobotMap.pdp);
		c = new Compressor(RobotMap.pcm);
//		
//		Reader d = new Reader(driveTrain, 1 , true);
//		d.addMethod("getName");
//		l.add(d);
//		Reader i = new Reader(intake, 1 , true);
//		i.addMethod("getName");
//		l.add(i);
//		Reader e = new Reader(elevator, 1 , true);
//		e.addMethod("getName");
//		l.add(e);
//		Reader p = new Reader(pitch, 1 , true);
//		p.addMethod("getName");
//		l.add(p);
//		Reader s = new Reader(solenoids, 1 , true);
//		s.addMethod("getName");
//		l.add(s);

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
		}
	}

	/**
	 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as described in the TimedRobot documentation. If you change the name of this class or the package after creating this
	 * project, you must also update the build.properties file in the project.
	 */

	@Override
	public void disabledInit()
	{
		c.start();
		Scheduler.getInstance().run();
		// Robot.driveTrain.DisabledMotionProfile();
	}

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
		// driveTrain.log.flush();
		//l.stop();
	}

	public void autonomousInit()
	{
		//l.start();
		System.out.println("Auto Init");
		if (DriverStation.getInstance().getGameSpecificMessage().length() > 0)
		{
			gameData = DriverStation.getInstance().getGameSpecificMessage();
		}
		Robot.elevator.zeroEncoders();
		Robot.pitch.zeroEncoder();
		Robot.driveTrain.disableRamp();
	}

	public void autonomousPeriodic()
	{
		counter++;
		System.out.println("counter " + counter);
		if (counter > 25 || DriverStation.getInstance().getGameSpecificMessage().length() > 0)
		{
			if (!done)
			{
				gameData = DriverStation.getInstance().getGameSpecificMessage();
				System.out.println("entered auton setter");
				autonMode = (Command) autonChooser.getSelected();
				switch (autonMode.getName())
				{
				case "LeftLeftSwitchOrLeftScale":
				{
					System.out.println("switch selected " + autonMode.getName());
					autonMode = new LeftLeftSwitchOrLeftScale();
					break;
				}
				case "AutonMiddleSwitch":
				{
					autonMode = new AutonMiddleSwitch();
					break;
				}
				case "RightRightSwitchOrRightScale2":
				{
					autonMode = new RightRightSwitchOrRightScale2();
					break;
				}
				case "LeftLeftScaleOrSwitchOrStraight":
				{
					autonMode = new LeftLeftScaleOrSwitchOrStraight();
					break;
				}
				case "RightRightScaleorSwitchOrStraight":
				{
					autonMode = new RightRightScaleorSwitchOrStraight();
					break;
				}
				case "DriveStraightAuton":
				{
					autonMode = new DriveStraightAuton();
					break;
				}
				case "AutonLeftScaleLeft":
				{
					autonMode = new AutonLeftScaleLeft();
					break;
				}
				case "AutonExtakeDrive":
				{
					autonMode =  new AutonExtakeDrive(2);
					break;
				}
				default:
				{
					autonMode = new AutonMotionProfileEx(DriveStraightLine3000.PointsR, DriveStraightLine3000.PointsL, DriveStraightLine3000.kNumPoints);
					break;
				}
				}

				autonMode.start();
				done = true;
			}

		}
		//Robot.driveTrain.updateEncoders();
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
	
		//l.start();
		Robot.driveTrain.disableRamp();
		Robot.driveTrain.zeroEncoders();
		Robot.elevator.setMotorPower(0);
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
		// autonChooser.addObject("MidSwitchLeft", new MidSwitchLeft());
		// autonChooser.addObject("MidRightSwitch", new MidSwitchRight());
		autonChooser.addObject("MiddleSwitch", new AutonMiddleSwitch());
		autonChooser.addObject("LeftLeftSwitchOrScale", new LeftLeftSwitchOrLeftScale());
		autonChooser.addObject("RightRightSwitchOrRightScale", new RightRightSwitchOrRightScale2());
		autonChooser.addObject("LeftLeftScaleorSwitch", new LeftLeftScaleOrSwitchOrStraight());
		autonChooser.addObject("RightRightScaleorSwitch", new RightRightScaleorSwitchOrStraight());
		autonChooser.addObject("DriveStraightAuton", new DriveStraightAuton());
		autonChooser.addObject("AutonLeftScaleLeft", new AutonLeftScaleLeft());
		autonChooser.addObject("AutonExtakeDrive",new AutonExtakeDrive(1));

		// autonChooser.addObject("Cal50", new AutonCal50());
		// autonChooser.addObject("New left turn test", new AutonLeftTurnNewTest());
		//
		//
		// autonChooser.addObject("Cal100", new AutonCal100());
		// autonChooser.addObject("Cal200", new AutonCal200());
		// autonChooser.addObject("Reverse switch turn", new AutonCalReverseSwitch());
		//
		// autonChooser.addObject("LeftSwitchLEft", new LeftSwitchLeft());
		// autonChooser.addObject("RightSwitchRight", new RightSwitchRight2());
		// autonChooser.addObject("RightScaleRight", new AutonRightScaleRight());
		// autonChooser.addObject("RightScaleLeft", new AutonRightScaleLeft2());
		// autonChooser.addObject("LeftScaleLeft", new AutonLeftScaleLeft());
		// autonChooser.addObject("MidleScaleLeft", new MidScaleLeft());

		// autonChooser.addObject("TestAuto", new TestAuto());

		SmartDashboard.putData("Auton mode", autonChooser);

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

		//SmartDashboard.putData("PDP", pdp);

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
		SmartDashboard.putData(new DisableSoftLimits());
	}
	


}