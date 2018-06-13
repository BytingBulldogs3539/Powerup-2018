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

	@Override
	public double getPitchPea()
	{
		return .6;
	}

	@Override
	public double getPitchEye()
	{
		return 0.0;
	}

	@Override
	public double getPitchDee()
	{
		return 0.0;
	}

	@Override
	public double getPitchFFF()
	{
		return -.03;
	}

	@Override
	public int getLIntakeMotor()
	{
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int getRIntakeMotor()
	{
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getElevatorMotor1()
	{
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getElevatorMotor2()
	{
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public double getElevatorPea()
	{
		// TODO Auto-generated method stub
		return .95;
	}

	@Override
	public double getElevatorEye()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getElevatorDee()
	{
		// TODO Auto-generated method stub
		return 1.0;
	}

	@Override
	public double getElevatorFFF()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBotType()
	{
		return 1;
	}

}
