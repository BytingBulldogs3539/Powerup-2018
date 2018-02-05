package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch.PitchAngle;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class PitchCommand extends InstantCommand
{
	PitchAngle angle;

	public PitchCommand(PitchAngle angle)
	{
		requires(Robot.pitch);
		this.angle=angle;
	}

	protected void initialize()
	{
		Robot.pitch.setLateralPID(RobotMap.pitchPea, RobotMap.pitchEye, RobotMap.pitchDee);
		Robot.pitch.setPosition(angle);
	}
}
