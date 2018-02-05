package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch.PitchAngle;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PitchCommand extends Command
{
	PitchAngle angle;

	public PitchCommand(PitchAngle angle)
	{
		requires(Robot.pitch);
		this.angle = angle;
	}

	protected void initialize()
	{
		Robot.pitch.setLateralPID(RobotMap.pitchPea, RobotMap.pitchEye, RobotMap.pitchDee);
		Robot.pitch.setPosition(angle);
	}

	@Override
	protected boolean isFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
