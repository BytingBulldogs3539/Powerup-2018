package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.Joystick;

public class ByteJoystick extends Joystick
{

	public ByteJoystick(int port) 
	{
		super(port);
		BulldogLogger.getInstance().logEvent("Joystick Creation"+port);
	}
	public double getAxisRX()
	{
		return super.getRawAxis(RobotMap.X_AxisR);
	}
	public double getAxisRY()
	{
		return super.getRawAxis(RobotMap.Y_AxisR);
	}
	public double getAxisLX()
	{
		return super.getRawAxis(RobotMap.X_AxisL);
	}
	public double getAxisLY()
	{
		return super.getRawAxis(RobotMap.Y_AxisL);
	}
}
