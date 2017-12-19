package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import com.ctre.CANTalon;

public class ByteTalon extends CANTalon
{
	private ByteSystem b;
	private String name;
	private boolean hasEncoder;

	public ByteTalon(ByteSystem b, int deviceNumber, String name)
	{
		super(deviceNumber);
		init(b, deviceNumber, name);
	}

	public ByteTalon(ByteSystem b, int deviceNumber, String name, int controlPeriodMs)
	{
		super(deviceNumber, controlPeriodMs);
		init(b, deviceNumber, name);
	}

	public ByteTalon(ByteSystem b, int deviceNumber, String name, int controlPeriodMs, int enablePeriodMs)
	{
		super(deviceNumber, controlPeriodMs, enablePeriodMs);
		init(b, deviceNumber, name);
	}

	private void init(ByteSystem b, int deviceNumber, String name)
	{
		this.b = b;
		this.name = name;

		hasEncoder = false;

		BulldogLogger.getInstance().log(b, name + " ByteTalon ID: " + deviceNumber + " Constructed");
	}

	// VV idk when this gets called etc. Execute??? Outside timer??? Omar CTRE might be unhappy with 2 places accessing at once
	public void logEncoderPosition()
	{
		if (hasEncoder)
		{
			BulldogLogger.getInstance().log(b, name + " EncoderP: " + this.getEncPosition());
		}
		else
		{
			BulldogLogger.getInstance().log(b, name + "hasEncoder: " + hasEncoder);
			BulldogLogger.getInstance().logEvent(name + " HAS NO ENCODER SILLY!!!! (or it's disconnected)");
		}
	}
	
	public void logEncoderVelocity()
	{
		if (hasEncoder)
		{
			BulldogLogger.getInstance().log(b, name + " EncoderV: " + this.getEncVelocity());
		}
		else
		{
			BulldogLogger.getInstance().log(b, name + "hasEncoder: " + hasEncoder);
			BulldogLogger.getInstance().logEvent(name + " HAS NO ENCODER SILLY!!!! (or it's disconnected)");
		}
	}

	public void setEncoder(boolean hasEncoder)
	{
		BulldogLogger.getInstance().log(b, name + "hasEncoder: " + hasEncoder);
		this.hasEncoder = hasEncoder;
	}
}