package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.utilities.FixProfile;

import com.ctre.phoenix.motion.SetValueMotionProfile;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class NewAutonMotionCommand extends Command
{
	FixProfile m;
	boolean isFinished = false;

	public NewAutonMotionCommand(double[][] right, double[][] left, int tot)
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);
		m = new FixProfile(right, left, tot);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		m.Init();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		m.start();
		if (m._setValue == SetValueMotionProfile.Hold)
		{
			isFinished = true;
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return isFinished;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		m.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		m.reset();
	}
}
