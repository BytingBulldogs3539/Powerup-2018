package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.management.IManageable;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Wrapper class for all DoubleSolenoids to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

// TODO: Update toggle() with more favorable WPILIB methods
// TODO: Implement logging

public class ByteDoubleSolenoid extends DoubleSolenoid implements IManageable
{
	private boolean isTrigger;

	public ByteDoubleSolenoid(int on, int off, boolean isTrigger)
	{
		super(RobotMap.pcm, on, off); // on, off
		defaultPosition(isTrigger);

	}

	public void toggle()
	{
		if (get() == DoubleSolenoid.Value.kOff)
		{
			defaultPosition(isTrigger);
		}
		else if (get() == DoubleSolenoid.Value.kReverse)
		{
			forward();
		}
		else if (get() == DoubleSolenoid.Value.kForward)
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

	@Override
	public void register()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void poll()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void setInterval()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void getInterval()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void close()
	{
		// TODO Auto-generated method stub

	}
}