package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PitchCommand extends Command
{
	double enc;
	int scale;

	public PitchCommand()
	{
		requires(Robot.pitch);
		this.enc = 0;
		scale = 10;
	}

	protected void initialize()
	{
//		Robot.pitch.setPID(SmartDashboard.getNumber("pitchPea", RobotMap.pitchPea),
//		SmartDashboard.getNumber("pitchEye", RobotMap.pitchEye),
//		SmartDashboard.getNumber("pitchDee", RobotMap.pitchDee), 0);
		
		enc = Robot.pitch.getEncoder();
		Robot.pitch.setSetpointPitch(enc);
		System.out.println(Robot.pitch.getEncoder());
	}
	
	protected void execute()
	{
		if(Robot.oi.two.getRightStickY() > .2)
		{
			enc = enc + scale * Robot.oi.two.getRightStickY();
			Robot.pitch.setSetpointPitch(enc);
		}
		if(Robot.oi.two.getRightStickY() < -.2)
		{
			enc = enc + scale * Robot.oi.two.getRightStickY();
			Robot.pitch.setSetpointPitch(enc);
		}
		if(Robot.oi.two.buttonB.get())
		{
			enc = Robot.pitch.getEncoder();
			Robot.pitch.setSetpointPitch(enc);
		}
		System.out.println("arm encoder: " + Robot.pitch.getEncoder() + "  enc: " + enc);
	}

	@Override
	protected boolean isFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
