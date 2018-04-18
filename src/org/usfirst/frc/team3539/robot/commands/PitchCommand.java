package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PitchCommand extends Command
{
	int scale;
	boolean checker;
	int lowerPseudo;

	public PitchCommand()
	{
		requires(Robot.pitch);
		scale = 220;
		lowerPseudo = 9000; // higher = lower
	}

	protected void initialize()
	{
		// Robot.pitch.setPID(RobotMap.pitchPea, RobotMap.pitchEye, RobotMap.pitchDee, RobotMap.pitchFFF);

		Robot.pitch.enc = Robot.pitch.getEncoder();
		Robot.pitch.setSetpointPitch(Robot.pitch.enc);
		// System.out.println(Robot.pitch.getEncoder());
		checker = true;
	}

	protected void execute()
	{

		// Change (stick is up or down enough)
		if (Robot.oi.two.getRightStickY() >= .2 || Robot.oi.two.getRightStickY() <= -.2)
		{
			Robot.pitch.enc += scale * Robot.oi.two.getRightStickY();
			if (Robot.pitch.enc > lowerPseudo)
				Robot.pitch.enc = lowerPseudo;
			Robot.pitch.setSetpointPitch(Robot.pitch.enc);
			checker = true;
		}
		// Deadband reset (hold)
		else if (Robot.oi.two.getRightStickY() < .2 && Robot.oi.two.getRightStickY() > -.2 && checker)
		{
			Robot.pitch.enc = Robot.pitch.getEncoder();
			if (Robot.pitch.enc > lowerPseudo)
				Robot.pitch.enc = lowerPseudo;
			Robot.pitch.setSetpointPitch(Robot.pitch.enc);
			checker = false;
		}
		// Manual reset
		if (Robot.oi.two.buttonB.get())
		{
			Robot.pitch.zeroEncoder();
			Robot.pitch.enc = 0;
			Robot.pitch.setSetpointPitch(Robot.pitch.enc);
		}
		System.out.println("arm enc: " + Robot.pitch.getEncoder() + " target enc: " + Robot.pitch.enc);
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}
}
