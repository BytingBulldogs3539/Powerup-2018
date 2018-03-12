package org.usfirst.frc.team3539.robot;

public class CompMap implements IMap
{
	//////////////////////// COMP BOT /////////////////////////

	@Override
	public String getName()
	{
		return "CompMap";
	}

	@Override
	public int getLf()
	{
		return 10;
	}

	@Override
	public int getLb()
	{
		return 11;
	}

	@Override
	public int getRf()
	{
		return 2;
	}

	@Override
	public int getRb()
	{
		return 1;
	}

	@Override
	public int getPitch()
	{
		return 3;
	}

	@Override
	public double getDrivePea()
	{
		return .7;
	}

	@Override
	public double getDriveEye()
	{
		return 0.0;
	}

	@Override
	public double getDriveDee()
	{
		return 0.0;
	}

	@Override
	public double getDriveFFF()
	{
		return .13;
	}

}
