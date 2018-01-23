package org.usfirst.frc.team3539.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LightBeam extends Subsystem
{
	private static DigitalInput beam;

	public LightBeam()
	{
		beam = new DigitalInput(0);
	}

	public boolean getBeam()
	{
		return beam.get();
	}

	@Override
	protected void initDefaultCommand()
	{
	}
}
