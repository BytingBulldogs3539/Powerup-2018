package org.usfirst.frc.team3539.robot;

public interface IMap
{
	public String getName();
	
	public int getLf();
	public int getLb();

	public int getRf();
	public int getRb();
	
	public int getPitch();
	
	public double getDrivePea();
	public double getDriveEye();
	public double getDriveDee();
	public double getDriveFFF();

	double getPitchPea();
	double getPitchEye();
	double getPitchDee();
	double getPitchFFF();
	
	public int getLIntakeMotor();
	public int getRIntakeMotor();
	public int getElevatorMotor1();
	public int getElevatorMotor2();
}
