package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.profiles.GeneratedMotionProfile;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonMotionProfileCommand extends Command
{
	public AutonMotionProfileCommand()
	{
		requires(Robot.driveTrain);
	}

	protected void initialize()
	{
		Robot.driveTrain.leftTrack.configure();
		Robot.driveTrain.rightTrack.configure();
				
		Robot.driveTrain.setMotionProfile();
		System.out.println("-----motion profile mode set on talon----");
		
		Robot.driveTrain.leftTrack.startFilling(GeneratedMotionProfile.PointsR, GeneratedMotionProfile.kNumPoints );
		Robot.driveTrain.rightTrack.startFilling(GeneratedMotionProfile.PointsR, GeneratedMotionProfile.kNumPoints );
 
	}

	protected void execute()
	{
		System.out.println("printing in execute");
		Robot.driveTrain.updateEncoders();
		Robot.driveTrain.setMotionProfile();
	}

	protected boolean isFinished()
	{
		return Robot.driveTrain.GetFinish();
	}

	protected void end()
	{
		Robot.driveTrain.MotionProfileReset();	
	}
	
	protected void interrupted()
	{
		end();
	}
}
