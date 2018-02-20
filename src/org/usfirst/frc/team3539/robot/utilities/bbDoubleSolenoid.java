package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Wrapper class for all DoubleSolenoids
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

public class bbDoubleSolenoid extends DoubleSolenoid
{
	private boolean isTrigger;
	int on, off;

	public bbDoubleSolenoid(int on, int off, boolean isTrigger)
	{
		super(RobotMap.pcm, on, off);
		this.on = on;
		this.off = off;
		defaultPosition(isTrigger);
	}

	public void toggle()
	{
		if (get() == DoubleSolenoid.Value.kOff)
		{
			defaultPosition(isTrigger);
		} else if (get() == DoubleSolenoid.Value.kReverse)
		{
			forward();
		} else if (get() == DoubleSolenoid.Value.kForward)
		{
			reverse();
		}
	}

	public void defaultPosition(boolean isTrigger)
	{
		if (isTrigger)
			forward();
		else
			reverse();
	}

	public void forward()
	{
		set(DoubleSolenoid.Value.kForward);
	}

	public void reverse()
	{
		set(DoubleSolenoid.Value.kReverse);
	}

	public void disable()
	{
		set(DoubleSolenoid.Value.kOff);
	}

	// possibly change to rely on the get() method which returns a Value
	public boolean isTrigger()
	{
		return isTrigger;
	}
}