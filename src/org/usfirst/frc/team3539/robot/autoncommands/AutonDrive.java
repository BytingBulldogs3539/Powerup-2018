package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.DriverStation;
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

	// Called just before this Command runs the first time
	protected void initialize()
	{
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		
		if(gameData.charAt(0) == 'L')
		{
			System.out.println("left auton");
			//Put left auto code here
		} else
		{
			System.out.println("right auton");
			//Put right auto code here
		}
		
		Robot.drivetrain.zeroEnc();
		Robot.drivetrain.setSetpointDrive(Robot.drivetrain.inchToEncoder(inches));
		System.out.println(inches);

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{

		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}
}
