package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonTurnEncoderCommand extends Command
{
	private double targetAngle;

	public AutonTurnEncoderCommand(double targetAngle, double seconds)
	{
		requires(Robot.driveTrain);
		this.targetAngle = targetAngle;
		setTimeout(seconds);
	}

	protected void initialize()
	{
		Robot.driveTrain.zeroEncoders();
		Robot.driveTrain.setRightPID(SmartDashboard.getNumber("DriveRightP", RobotMap.driveRightPea), SmartDashboard.getNumber("DriveRightI", RobotMap.driveRightEye),
				SmartDashboard.getNumber("DriveRightD", RobotMap.driveRightDee), SmartDashboard.getNumber("DriveRightF", RobotMap.driveRightFFF));
		
		Robot.driveTrain.setLeftPID(SmartDashboard.getNumber("DriveLeftP", RobotMap.driveLeftPea), SmartDashboard.getNumber("DriveLeftI", RobotMap.driveLeftEye),
				SmartDashboard.getNumber("DriveLeftD", RobotMap.driveLeftDee), SmartDashboard.getNumber("DriveLeftF", RobotMap.driveLeftFFF));
	
		Robot.driveTrain.setupOnTarget(500, 20);
		
		Robot.driveTrain.setSetpointTurn(targetAngle);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.onTarget() || isTimedOut();
	}

	protected void end()
	{
		Robot.driveTrain.driveArcade(0, 0);
		Robot.driveTrain.zeroEncoders();
	}

	protected void interrupted()
	{
		end();
	}
}
