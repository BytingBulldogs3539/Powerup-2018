package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import com.ctre.CANTalon;

public class ByteTalon extends CANTalon
{
	private ByteSystem b;
	
	public ByteTalon(ByteSystem b, int deviceNumber)
	{
		super(deviceNumber);
		init(b,deviceNumber);
	}

	public ByteTalon(ByteSystem b, int deviceNumber, int controlPeriodMs)
	{
		super(deviceNumber, controlPeriodMs);
		init(b,deviceNumber);
	}

	public ByteTalon(ByteSystem b, int deviceNumber, int controlPeriodMs, int enablePeriodMs)
	{
		super(deviceNumber, controlPeriodMs, enablePeriodMs);
		init(b,deviceNumber);
	}
	
	private void init(ByteSystem b, int deviceNumber)
	{
		this.b = b;
		BulldogLogger.getInstance().log(b, "ByteTalon ID:" + " " + deviceNumber + " " + "Constructed");
	}
	
	public String getSubsystemName()
	{
		return b.getName();
	}
}