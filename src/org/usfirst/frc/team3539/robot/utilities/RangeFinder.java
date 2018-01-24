package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.subsystems.RangeSystem;

import edu.wpi.first.wpilibj.AnalogInput;

public class RangeFinder extends RangeSystem
{
	private AnalogInput rf;

	public RangeFinder(int ID)
	{
		rf = new AnalogInput(ID);
	}

	public void printDistance()
	{
		System.out.println("Inches " + getDistance());
	}

	public double getDistance()
	{
		double millivolts = (rf.getVoltage() * 1000);
		double mm = (millivolts / .976);
		double inches = mm * .0393701;
		return inches;
	}

	public void printVoltage()
	{
		System.out.println("volts" + rf.getVoltage());
	}

	public double getVoltage()
	{
		return rf.getVoltage();
	}
}
