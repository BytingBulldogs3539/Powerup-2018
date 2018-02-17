package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PitchCommand extends InstantCommand
{
	double angle;

	//This command does not have an is finished and does not need one due to the fact that we us pid to keep the pitch in position
	
	public PitchCommand(double i)
	{
		requires(Robot.pitch);
		this.angle = i;
	}

	protected void initialize()
	{
		Robot.pitch.setPID(SmartDashboard.getNumber("pitchPea", RobotMap.pitchPea), SmartDashboard.getNumber("pitchEye", RobotMap.pitchEye),
				SmartDashboard.getNumber("pitchDee", RobotMap.pitchDee));
		
		Robot.pitch.setSetpointPitch(angle);
	}
}
