package org.usfirst.frc.team3539.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Light extends Subsystem
{
	private static DigitalInput beam;
	
	public Light()
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
		// TODO Auto-generated method stub
		
	}
}
