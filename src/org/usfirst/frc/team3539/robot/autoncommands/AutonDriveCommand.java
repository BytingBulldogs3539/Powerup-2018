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

		Robot.driveTrain.setPID(SmartDashboard.getNumber("drivePea", RobotMap.drivePea), SmartDashboard.getNumber("driveEye", RobotMap.driveEye), SmartDashboard.getNumber("driveDee", RobotMap.driveDee),
				SmartDashboard.getNumber("driveFFF", RobotMap.driveFFF));

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
