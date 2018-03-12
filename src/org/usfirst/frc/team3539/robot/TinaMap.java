package org.usfirst.frc.team3539.robot;

public class TinaMap implements IMap
{

	@Override
	public String getName()
	{
		return "TinaMap";
	}

	@Override
	public int getLf()
	{
		return 6;
	}

	@Override
	public int getLb()
	{
		return 7;
	}

	@Override
	public int getRf()
	{
		return 4;
	}

	@Override
	public int getRb()
	{
		return 3;
	}
	
	public int getPitch()
	{
		return 3539;
	}

	@Override
	public double getDrivePea()
	{
 		return 0;
	}

	@Override
	public double getDriveEye()
	{
		return 0;
	}

	@Override
	public double getDriveDee()
	{
		return 0;
	}

	@Override
	public double getDriveFFF()
	{
		return 0;
	}

}
