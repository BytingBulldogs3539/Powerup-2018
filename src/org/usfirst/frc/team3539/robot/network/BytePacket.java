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

public abstract class BytePacket implements IManageable
{
	String key;

	protected BytePacket(String key)
	{
		this.key = key;
	}

	abstract void bRegister();
	abstract void bSetInterval();
	abstract void bGetInterval();
	abstract void bPoll();
	abstract void bClose();
	
	@Override
	public void register()
	{
		bRegister();
	}

	@Override
	public void setInterval()
	{
		bSetInterval();
	}

	@Override
	public void getInterval()
	{
		bGetInterval();
	}

	@Override
	public void poll()
	{
		bPoll();
	}

	@Override
	public void close()
	{
		bClose();
	}

}
