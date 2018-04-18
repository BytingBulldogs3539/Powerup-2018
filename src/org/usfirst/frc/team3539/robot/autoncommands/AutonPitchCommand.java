package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class AutonPitchCommand extends InstantCommand
{
	private double angle = 0;

	public AutonPitchCommand(int angle)
	{
		requires(Robot.pitch);
		this.angle = angle;
	}

	protected void initialize()
	{
		Robot.pitch.setupOnTarget(250, 10);
		Robot.pitch.setPID(RobotMap.pitchPea, RobotMap.pitchEye, RobotMap.pitchDee, RobotMap.pitchFFF);
		Robot.pitch.setAngleSetpointPitch(angle);
	}
}
