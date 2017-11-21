package org.usfirst.frc.team3539.robot.vision;

import org.usfirst.frc.team3539.robot.network.BulldogTables;

public class BulldogVision
{
	private double offset = 0;
	private double angle = 0;
	private double distance = 0;
	private int camera = 0;
	private boolean isRed = false;

	public BulldogVision()
	{
		BulldogTables.getInstance().putNumber("angle", angle);
		BulldogTables.getInstance().putNumber("offset", offset);
		BulldogTables.getInstance().putNumber("distance", distance);
		BulldogTables.getInstance().putNumber("camera", camera);
		BulldogTables.getInstance().putBoolean("isRed", isRed);
	}
	
	public void setOffset(double offset)
	{
		BulldogTables.getInstance().putNumber("offset", offset);
		this.offset = offset;
	}

	public void setAngle(double angle)
	{
		BulldogTables.getInstance().putNumber("angle", angle);
		this.angle = angle;
	}

	public void setDistance(double distance)
	{
		BulldogTables.getInstance().putNumber("distance", distance);
		this.distance = distance;
	}

	public void setCamera(int camera)
	{
		BulldogTables.getInstance().putNumber("camera", camera);
		this.camera = camera;
	}

	public void setRed(boolean isRed)
	{
		BulldogTables.getInstance().putBoolean("isRed", isRed);
		this.isRed = isRed;
	}

	public double getOffset()
	{
		offset =  BulldogTables.getInstance().getNumber("offset", 3539);
		return offset;
	}
	
	public double getDistance()
	{
		distance =  BulldogTables.getInstance().getNumber("distance", 3539);
		return distance;
	}

	public double getAngle()
	{
		angle = BulldogTables.getInstance().getNumber("angle", 3539);
		return angle;
	}
	
	public int getCamera()
	{
		camera = BulldogTables.getInstance().getNumber("camera", 3539);
		return camera;
	}
	
	public boolean isRed()
	{
		isRed = BulldogTables.getInstance().getBoolean("isRed", false);
		return isRed;
	}

	public double getHoodAngle()
	{
		// double slope = (RobotMap.Hood2 - RobotMap.Hood1) / (RobotMap.Distance2 - RobotMap.Distance1);
		// double intercept = RobotMap.Hood1 - (slope * RobotMap.Distance1);

		// return ((slope * distance) + intercept);// old value 5.4143 * distance - 20;
		return 3539;
	}

	public double getShooterRPM()
	{
		// double slope = (RobotMap.RPM2 - RobotMap.RPM1) / (RobotMap.Distance2 - RobotMap.Distance1);
		// double intercept = RobotMap.RPM1 - (slope * RobotMap.Distance1);

		//return -(9.1812*92+2335);

		// return -((slope * distance) + intercept); // -((12.009) * distance + 1763);
		return 3539;
	}
}
