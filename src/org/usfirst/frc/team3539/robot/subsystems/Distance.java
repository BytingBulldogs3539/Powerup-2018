package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.utilities.Rangefinder;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Distance extends Subsystem
{
	private Rangefinder rf;
	public Distance()
	{
		rf = new Rangefinder(1);
	}
	
	@Override
	protected void initDefaultCommand()
	{
	}
}
