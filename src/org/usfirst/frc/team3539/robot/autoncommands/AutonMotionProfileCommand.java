package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import com.sun.glass.ui.Timer;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonMotionProfileCommand extends Command
{

	public AutonMotionProfileCommand()
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);

	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.driveTrain.DisabledMotionProfile();
		System.out.println("called disabled");
		Robot.driveTrain.MotionProfileReset();

		Robot.driveTrain.setMotionProfile();
		System.out.println("-----motion profile mode set on talon----");
		Robot.driveTrain.startFilling();
	//	edu.wpi.first.wpilibj.Timer.delay(10);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{System.out.println("printing in execute");
		//
	Robot.driveTrain.setMotionProfile();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return Robot.driveTrain.GetFinish();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.driveTrain.MotionProfileReset();

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
