package org.usfirst.frc.team3539.robot;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDrive;
import org.usfirst.frc.team3539.robot.autoncommands.AutonTurn;
import org.usfirst.frc.team3539.robot.autoncommands.DriveVelocity;
import org.usfirst.frc.team3539.robot.autongroups.TestAuto;
import org.usfirst.frc.team3539.robot.subsystems.RangeSystem;
import org.usfirst.frc.team3539.robot.subsystems.DriveTrain;
//import org.usfirst.frc.team3539.robot.subsystems.Intake;
//import org.usfirst.frc.team3539.robot.subsystems.LimitSwitch;
import org.usfirst.frc.team3539.robot.subsystems.MotorTest;
//import org.usfirst.frc.team3539.robot.subsystems.Elevator;

//import edu.wpi.cscore.UsbCamera;
//import edu.wpi.first.wpilibj.CameraServer;
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
	public static RangeSystem rangeSystem = new RangeSystem();
	public static MotorTest motor = new MotorTest();
	// public static Intake intake = new Intake();
	// public static LimitSwitch limit = new LimitSwitch();
	// public static Elevator elevator = new Elevator();
	// public static RangeSystem rangeSystem = new RangeSystem();
	// public static Intake intake = new Intake();
	// public static LimitSwitch limit = new LimitSwitch();
	// public static Elevator elevator = new Elevator();

	public static Compressor c;
	public static OI oi;
	// public static UsbCamera cameraOne, cameraTwo;

	Command autonMode;
	SendableChooser<Command> autonChooser;
	SendableChooser<Command> allianceChooser;

	public void robotInit()
	{
		oi = new OI();
		SmartInit();

		// cameraOne = CameraServer.getInstance().startAutomaticCapture(0);
		// cameraOne.setResolution(480, 360);
		// cameraTwo = CameraServer.getInstance().startAutomaticCapture(1);
		// cameraTwo.setResolution(480, 360);
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
		Robot.driveTrain.updateEnc();
	}

	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
		Robot.driveTrain.updateEnc();
	}

	public void teleopInit()
	{
		System.out.println("teleopInit");
	}

	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void testPeriodic()
	{
	}

	public void SmartInit()
	{
		autonChooser = new SendableChooser<Command>();
		autonChooser.addDefault("AutoDrive", new AutonDrive(12));
		autonChooser.addObject("AutoTurn", new AutonTurn(90,1));
		autonChooser.addObject("Auto", new TestAuto());
		
		allianceChooser= new SendableChooser<Command>();
		allianceChooser.addDefault("Red", null);
		allianceChooser.addObject("Blue", null);


		SmartDashboard.putData("Auton mode", autonChooser);
		
		SmartDashboard.putData("Alliance", allianceChooser);

		SmartDashboard.putNumber("P", RobotMap.drivePea);
		SmartDashboard.putNumber("I", RobotMap.driveEye);
		SmartDashboard.putNumber("D", RobotMap.driveDee);
		SmartDashboard.putNumber("F", RobotMap.driveFFF);
		
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
		//SmartDashboard.putNumber("PDP Current", 1);

		SmartDashboard.putNumber("Right Enc", 0);
		SmartDashboard.putNumber("Left Enc", 0);
		// autonChooser.addDefault("No Auton, Default", new VoidCommand());
		// autonChooser.addObject("Auton Turn 180", new AutonTurn(180));

		SmartDashboard.putData(Scheduler.getInstance());
	}
}