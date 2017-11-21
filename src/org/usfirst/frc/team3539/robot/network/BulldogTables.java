package org.usfirst.frc.team3539.robot.network;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 * NetworkTable Wrapper to manage data through BytePacket-Objects
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

// TODO:

public class BulldogTables
{
	private static NetworkTable table;
	private static BulldogTables bTable;

	private BulldogTables()
	{
		table = NetworkTable.getTable("BulldogTables");
	}

	public static BulldogTables getInstance()
	{
		if (bTable == null)
			bTable = new BulldogTables();

		return bTable;
	}

	public void putNumber(String key, int value)
	{
		table.putNumber(key, value);
	}

	public void putNumber(String key, double value)
	{
		table.putNumber(key, value);
	}

	public void putBoolean(String key, boolean value)
	{
		table.putBoolean(key, value);
	}

	public double getNumber(String key, double defaultValue)
	{
		return table.getNumber(key, defaultValue);
	}

	public int getNumber(String key, int defaultValue)
	{
		return (int) table.getNumber(key, defaultValue);
	}

	public boolean getBoolean(String key, boolean defaultValue)
	{
		return table.getBoolean(key, defaultValue);
	}
}