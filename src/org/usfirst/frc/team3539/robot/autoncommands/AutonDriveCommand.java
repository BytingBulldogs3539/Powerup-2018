package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonDriveCommand extends Command
{
	private double inches;

	public AutonDriveCommand(double inches, double seconds)
	{
		requires(Robot.driveTrain);

		this.inches = inches;

		setTimeout(seconds);
		Robot.driveTrain.zeroEncoders();

	}

	protected void initialize()
	{
		Robot.driveTrain.zeroEncoders();

		Robot.driveTrain.setRightPID(SmartDashboard.getNumber("DriveRightP", RobotMap.driveRightPea), SmartDashboard.getNumber("DriveRightI", RobotMap.driveRightEye), SmartDashboard.getNumber("DriveRightD", RobotMap.driveRightDee),
				SmartDashboard.getNumber("DriveRightF", RobotMap.driveRightFFF));

		Robot.driveTrain.setLeftPID(SmartDashboard.getNumber("DriveLeftP", RobotMap.driveLeftPea), SmartDashboard.getNumber("DriveLeftI", RobotMap.driveLeftEye), SmartDashboard.getNumber("DriveLeftD", RobotMap.driveLeftDee),
				SmartDashboard.getNumber("DriveLeftF", RobotMap.driveLeftFFF));
		System.out.println("pid set");

		Robot.driveTrain.setSetpointDrive(inches);

		Robot.driveTrain.setupOnTarget(300, 10);
	}

	protected void execute()
	{
		System.out.print(Robot.driveTrain.lf.getClosedLoopTarget(0));
		Robot.driveTrain.updateEncoders();
	}

	protected boolean isFinished()
	{
		return isTimedOut();
	}

	protected void end()
	{
		System.out.println("End Auto Drive");
		Robot.driveTrain.driveArcade(0, 0);
	}

	protected void interrupted()
	{
		end();
	}
}
