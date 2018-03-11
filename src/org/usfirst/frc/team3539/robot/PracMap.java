package org.usfirst.frc.team3539.robot;

public class PracMap implements IMap
{
	//////////////////////// PRACTICE BOT/////////////////////
	
	@Override
	public String getName()
	{
		return "PracMap";
	}

	@Override
	public int getLf()
	{
		return 10;
	}

	@Override
	public int getLb()
	{
		return 9;
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
		return 6;
	}
	
}
