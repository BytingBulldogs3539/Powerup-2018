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
	public int getPitch()
	{
		return 3;
	}

}
