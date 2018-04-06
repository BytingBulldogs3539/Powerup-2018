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

	@Override
	public double getDrivePea()
	{
		return .5;//.5
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
		return .145;//.145
	}

	@Override
	public double getPitchPea() {
		// TODO Auto-generated method stub
		return .26;
	}

	@Override
	public double getPitchEye() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPitchDee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPitchFFF() {
		// TODO Auto-generated method stub
		return -.03;
	}

	@Override
	public int getLIntakeMotor() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int getRIntakeMotor() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getElevatorMotor1() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getElevatorMotor2() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public double getElevatorPea() {
		// TODO Auto-generated method stub
		return .2;
	}

	@Override
	public double getElevatorEye() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double getElevatorDee() {
		// TODO Auto-generated method stub
		return 1.2;
	}

	@Override
	public double getElevatorFFF() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public int getBotType() {
		return 0;
	}

}
