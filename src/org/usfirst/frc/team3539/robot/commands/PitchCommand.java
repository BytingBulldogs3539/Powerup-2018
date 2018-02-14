package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch.PitchAngle;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
		Robot.pitch.setPID(SmartDashboard.getNumber("pitchPea", RobotMap.pitchPea), SmartDashboard.getNumber("pitchEye", RobotMap.pitchEye),
				SmartDashboard.getNumber("pitchDee", RobotMap.pitchDee));
		
		Robot.pitch.setSetpointPitch(angle);
	}
	
	

	@Override
	protected boolean isFinished()
	{
		return false;
	}
}
