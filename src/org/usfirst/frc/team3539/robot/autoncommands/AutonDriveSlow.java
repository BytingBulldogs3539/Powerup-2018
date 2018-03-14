package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonDriveSlow extends Command
{
	private double inches;

	public AutonDriveSlow(double motor, double seconds)
	{
		requires(Robot.driveTrain);

Robot.driveTrain.driveArcade(motor, 0);
		setTimeout(seconds);

	}

	protected void initialize()
	{
		
	}

	protected void execute()
	{
	//	System.out.print(Robot.driveTrain.lf.getClosedLoopTarget(0));
	//	Robot.driveTrain.updateEncoders();
	}

	protected boolean isFinished()
	{
		return isTimedOut();
	}

	protected void end()
	{
	
	}

	protected void interrupted()
	{
		end();
	}
}
