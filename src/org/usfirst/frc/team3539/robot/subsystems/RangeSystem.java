package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.utilities.RangeFinder;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RangeSystem extends Subsystem
{
	private RangeFinder rf;
	public RangeSystem()
	{
		rf = new RangeFinder(1);
	}
	
	public double getDistance()
	{
		return rf.getDistance();
	}
	
	
	@Override
	protected void initDefaultCommand()
	{
	}
}
