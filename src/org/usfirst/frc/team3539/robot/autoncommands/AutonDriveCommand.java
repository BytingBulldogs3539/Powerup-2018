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
		
		Robot.driveTrain.setPID(RobotMap.drivePea, RobotMap.driveEye, RobotMap.driveDee,
				SmartDashboard.getNumber("F", 0));
		
		this.inches = inches;
		
		setTimeout(seconds);
	}

	protected void initialize()
	{		
		Robot.driveTrain.setPID(SmartDashboard.getNumber("P", 0), SmartDashboard.getNumber("I", 0),
				SmartDashboard.getNumber("D", 0), SmartDashboard.getNumber("F", 0));
		
		
		Robot.driveTrain.setSetpointDrive(Robot.driveTrain.inchToEncoder(inches));
		
		Robot.driveTrain.setupOnTarget(300, 10);
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
	}

	protected void interrupted()
	{
		end();
	}
}
