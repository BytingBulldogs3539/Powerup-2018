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
	boolean checker;
	int lowerPseudo;

	public PitchCommand()
	{
		requires(Robot.pitch);
		this.enc = 0;
		scale = 120;
		lowerPseudo = 8500; // higher = lower
	}

	protected void initialize()
	{
		//Robot.pitch.setPID(RobotMap.pitchPea, RobotMap.pitchEye, RobotMap.pitchDee, RobotMap.pitchFFF);
		
		enc = Robot.pitch.getEncoder();
		Robot.pitch.setSetpointPitch(enc);
	//	System.out.println(Robot.pitch.getEncoder());
		checker = true;
	}
	
	protected void execute()
	{
		// Change (stick is up or down enough)
		if(Robot.oi.two.getRightStickY() >= .2 || Robot.oi.two.getRightStickY() <= -.2)
		{
			enc = enc + scale * Robot.oi.two.getRightStickY();
			if(enc > lowerPseudo) enc = lowerPseudo;
			Robot.pitch.setSetpointPitch(enc);
			checker = true;
		}
		// Deadband reset (hold)
		else if(Robot.oi.two.getRightStickY() < .2 && Robot.oi.two.getRightStickY() > -.2 && checker)
		{
			enc = Robot.pitch.getEncoder();
			if(enc > lowerPseudo) enc = lowerPseudo;
			Robot.pitch.setSetpointPitch(enc);
			checker = false;
		}
		// Manual reset
		if(Robot.oi.two.buttonB.get())
		{
			Robot.pitch.zeroEncoder();
			enc = Robot.pitch.getEncoder();
			Robot.pitch.setSetpointPitch(enc);
		}
	//	System.out.println("arm enc: " + Robot.pitch.getEncoder() + " target enc: " + enc);
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}
}
