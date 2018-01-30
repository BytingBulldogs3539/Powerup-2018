package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonDrive extends Command
{
	double inches;

	public AutonDrive(double inches)
	{
		requires(Robot.driveTrain);
		Robot.driveTrain.setPID(RobotMap.drivePea, RobotMap.driveEye, RobotMap.driveDee, SmartDashboard.getNumber("F", 0));
		this.inches = inches;
	}

	protected void initialize()
	{
		Robot.driveTrain.stopDrive();
		Robot.driveTrain.setPID(SmartDashboard.getNumber("P", 0), SmartDashboard.getNumber("I", 0), SmartDashboard.getNumber("D", 0), SmartDashboard.getNumber("F", 0));
		Robot.driveTrain.zeroEnc();
		Robot.driveTrain.setSetpointDrive(Robot.driveTrain.inchToEncoder(inches));
		// System.out.println(Robot.driveTrain.inchToEncoder(inches));
		Robot.driveTrain.setLoopOnTarget(10);
		Robot.driveTrain.setTargetAllowedError(300);
		Robot.driveTrain.zeroLoopCounter();
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.onTarget();
	}

	protected void end()
	{
		System.out.println("end");
		Robot.driveTrain.zeroEnc();
		Robot.driveTrain.stopDrive();
	}

	protected void interrupted()
	{
		end();
	}
}
