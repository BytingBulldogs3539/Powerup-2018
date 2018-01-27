package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.utilities.RangeFinder;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RangeSystem extends Subsystem
{
	AnalogInput ultrasonic;
	public RangeSystem()
	{
		ultrasonic = new AnalogInput(0);
	}
	
	public double getDistance()
	{
		return ultrasonic.getAverageVoltage();
	}
	
	
	@Override
	protected void initDefaultCommand()
	{
	}
}
