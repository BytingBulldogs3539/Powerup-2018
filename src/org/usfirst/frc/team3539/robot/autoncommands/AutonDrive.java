package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonDrive extends Command
{
	double inches;

	public AutonDrive(double inches)
	{
		requires(Robot.drivetrain);
		Robot.drivetrain.setPID(RobotMap.drivePea, RobotMap.driveEye, RobotMap.driveDee);
		this.inches = inches;
	}

	protected void initialize()
	{	
		Robot.drivetrain.zeroEnc();
		Robot.drivetrain.setSetpointDrive(Robot.drivetrain.inchToEncoder(inches));
		System.out.println(inches);
	}

	protected void execute()
	{

	}

	protected boolean isFinished()
	{

		return false;
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
	}
}
