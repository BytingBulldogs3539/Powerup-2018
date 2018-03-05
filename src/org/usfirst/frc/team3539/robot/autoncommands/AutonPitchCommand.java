package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonPitchCommand extends InstantCommand
{
	private double enc=0;

	public AutonPitchCommand(int enc)
	{
		requires(Robot.pitch);
		this.enc = enc;
	}

	protected void initialize()
	{
		Robot.pitch.setPID(RobotMap.pitchPea, RobotMap.pitchEye, RobotMap.pitchDee, RobotMap.pitchFFF);
		Robot.pitch.setSetpointPitch(enc);
	}
}
