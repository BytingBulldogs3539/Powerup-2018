package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.management.IManageable;

import com.ctre.CANTalon;

/**
 * Wrapper class for all Commands to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 11/17/17
 */

// TODO: Implement logging
// TODO: Test

public class ByteTalon extends CANTalon implements IManageable
{
	public ByteTalon(int channel)
	{
		super(channel);
	}

	public void zero()
	{
		//TODO: tell logging that the encoder was zeroed
		setPosition(0);
	}
	
	
	
	
	@Override
	public void register()
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
	public void poll()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void close()
	{
		// TODO Auto-generated method stub

	}
}
