package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Wrapper class for all Joysticks to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 11/16/17
 */

// TODO: Implement logging
// TODO: Test

public class ByteJoystick extends Joystick
{

	public ByteJoystick(int port)
	{
		super(port);
		BulldogLogger.getInstance().logEvent(port + " Joystick Constructed");
	}

	public double getAxisRX()
	{
		return getRawAxis(RobotMap.X_AxisR);
	}

	public double getAxisRY()
	{
		return getRawAxis(RobotMap.Y_AxisR);
	}

	public double getAxisLX()
	{
		return getRawAxis(RobotMap.X_AxisL);
	}

	public double getAxisLY()
	{
		return getRawAxis(RobotMap.Y_AxisL);
	}
}
