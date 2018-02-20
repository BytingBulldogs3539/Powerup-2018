package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

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
		Robot.driveTrain.MotionProfileReset();


		Robot.driveTrain.DisabledMotionProfile();
		System.out.println("called disabled");

		//Robot.driveTrain.setMotionProfile();
		System.out.println("-----motion profile mode set on talon----");
		Robot.driveTrain.startFilling();
		// edu.wpi.first.wpilibj.Timer.delay(10);
	}

	protected void execute()
	{
		Robot.driveTrain.updateEncoders();
		System.out.println("printing in execute");
		
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
