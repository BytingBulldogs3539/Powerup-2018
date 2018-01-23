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
		requires(Robot.driveTrain);
		Robot.driveTrain.setPID(RobotMap.drivePea, RobotMap.driveEye, RobotMap.driveDee);
		this.inches = inches;
	}

	protected void initialize()
	{	
		Robot.driveTrain.zeroEnc();
		Robot.driveTrain.setSetpointDrive(Robot.driveTrain.inchToEncoder(inches));
		System.out.println(inches);
	}

	protected void execute()
	{

	}

	protected boolean isFinished()
	{

		return Robot.driveTrain.lonTarget()||Robot.driveTrain.ronTarget();
	}

	protected void end()
	{
		System.out.println("end");

	}

	protected void interrupted()
	{
	}
}
