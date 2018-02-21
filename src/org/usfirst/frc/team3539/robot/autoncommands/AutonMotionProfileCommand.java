package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonMotionProfileCommand extends Command
{
	private double[][] ProfileR;
	private double[][] ProfileL;
	private int numPoints;

	public AutonMotionProfileCommand(double[][] ProfileLeft, double[][] ProfileRight, int Points)
	{
		requires(Robot.driveTrain);
		ProfileL = ProfileLeft;
		ProfileR = ProfileRight;
		numPoints = Points;
	}

	protected void initialize()
	{
		Robot.driveTrain.leftTrack.resetProfile();
		Robot.driveTrain.rightTrack.resetProfile();

		Robot.driveTrain.leftTrack.configure();
		Robot.driveTrain.rightTrack.configure();

		Robot.driveTrain.setMotionProfile();
		System.out.println("-----motion profile mode set on talon----");

		Robot.driveTrain.leftTrack.startFilling(ProfileL, numPoints);
		Robot.driveTrain.rightTrack.startFilling(ProfileR, numPoints);

	}

	protected void execute()
	{
		// System.out.println("printing in execute");
		Robot.driveTrain.updateEncoders();
		Robot.driveTrain.setMotionProfile();
	}

	protected boolean isFinished()
	{
		System.out.println(Robot.driveTrain.GetFinish()+"finished?");
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
