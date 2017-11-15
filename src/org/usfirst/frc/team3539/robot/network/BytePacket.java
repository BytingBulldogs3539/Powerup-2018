package org.usfirst.frc.team3539.robot.network;

import org.usfirst.frc.team3539.robot.management.IManageable;

/**
 * Wrapper class for NetworkTable data to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 11/14/17
 */

// TODO: Extend for all primitive types in BulldogTables
// TODO: Fix link between BulldogTables

public class BytePacket implements IManageable
{
	String key;

	protected BytePacket(String key)
	{
		this.key = key;
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
