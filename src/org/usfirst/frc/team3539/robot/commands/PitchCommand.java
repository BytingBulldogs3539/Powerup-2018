package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.LateralPitch.PitchAngle;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PitchCommand extends InstantCommand
{
	double angle;

	public PitchCommand(double i)
	{
		requires(Robot.pitch);
		this.angle = i;
	}

	protected void initialize()
	{
		//Robot.pitch.setPID(SmartDashboard.getNumber("pitchPea", RobotMap.pitchPea), SmartDashboard.getNumber("pitchEye", RobotMap.pitchEye),
		//		SmartDashboard.getNumber("pitchDee", RobotMap.pitchDee));
		
		Robot.pitch.setSetpointPitch(angle);
		System.out.println(Robot.pitch.getEncoder());
	}
}
