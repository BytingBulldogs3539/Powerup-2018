package org.usfirst.frc.team3539.robot.instantcommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class PitchManualCommand extends InstantCommand
{
	private double power;
	
	public PitchManualCommand(double power)
	{
		requires(Robot.pitch);
		this.power = power;
	}
	
	protected void initialize()
	{
		Robot.pitch.rotate(power);
		System.out.println(Robot.pitch.getEncoder());
	}
}
