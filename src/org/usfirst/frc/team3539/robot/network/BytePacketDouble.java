package org.usfirst.frc.team3539.robot.network;

public class BytePacketDouble extends BytePacket
{
	double value;

	public BytePacketDouble(String key, double value)
	{
		super(key);
		this.value = value;
	}

	@Override
	void bRegister()
	{
		// TODO Auto-generated method stub

	}

	@Override
	void bSetInterval()
	{
		// TODO Auto-generated method stub

	}

	@Override
	void bGetInterval()
	{
		// TODO Auto-generated method stub

	}

	@Override
	void bPoll()
	{
		// TODO Auto-generated method stub

	}

	@Override
	void bClose()
	{
		// TODO Auto-generated method stub

	}
}
