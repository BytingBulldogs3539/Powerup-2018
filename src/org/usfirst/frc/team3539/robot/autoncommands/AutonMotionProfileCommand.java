package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonMotionProfileCommand extends Command
{
	private double[][] ProfileR;
	private double[][] ProfileL;
	private int totalPointNum;

	public AutonMotionProfileCommand(double[][] ProfileR, double[][] ProfileL, int totalPointNum)
	{
		requires(Robot.driveTrain);
		this.ProfileL = ProfileL;
		this.ProfileR = ProfileR;
		this.totalPointNum = totalPointNum;
	}

	protected void initialize()
	{
		Robot.driveTrain.setPID(SmartDashboard.getNumber("drivePea", RobotMap.drivePea), SmartDashboard.getNumber("driveEye", RobotMap.driveEye), SmartDashboard.getNumber("driveDee", RobotMap.driveDee),
				SmartDashboard.getNumber("driveFFF", RobotMap.driveFFF));
		

		Robot.driveTrain.leftTrack.configure();
		Robot.driveTrain.rightTrack.configure();

		Robot.driveTrain.setMotionProfile();
		System.out.println("-----motion profile mode set on talon----");

		Robot.driveTrain.leftTrack.startFilling(ProfileL, totalPointNum);
		Robot.driveTrain.rightTrack.startFilling(ProfileR, totalPointNum);

	}

	protected void execute()
	{
		// System.out.println("printing in execute");
		Robot.driveTrain.updateEncoders();
		Robot.driveTrain.setMotionProfile();
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.isFinished();
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
		end();
	}
}
