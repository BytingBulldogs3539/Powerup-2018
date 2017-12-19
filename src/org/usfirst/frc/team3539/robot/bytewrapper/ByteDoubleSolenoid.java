package org.usfirst.frc.team3539.robot.bytewrapper;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.logging.BulldogLogger;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Wrapper class for all DoubleSolenoids to implement logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

// TODO: Implement logging

public class ByteDoubleSolenoid extends DoubleSolenoid
{
	private boolean isTrigger;
	private ByteSystem b;
	int on, off;

	public ByteDoubleSolenoid(ByteSystem b, int on, int off, boolean isTrigger)
	{
		super(RobotMap.pcm, on, off); // on, off
		this.on = on;
		this.off = off;
		this.b = b;
		defaultPosition(isTrigger);
		BulldogLogger.getInstance().log(b, "ByteDoubleSolenoid " + on + " " + off + " " + "Constructed");
	}

	public void toggle()
	{
		if (get() == DoubleSolenoid.Value.kOff)
		{
			defaultPosition(isTrigger);
		}
		else if (get() == DoubleSolenoid.Value.kReverse)
		{
			forward();
		}
		else if (get() == DoubleSolenoid.Value.kForward)
		{
			reverse();
		}
	}

	public void defaultPosition(boolean isTrigger)
	{
		if (isTrigger)
			forward();
		else
			reverse();
	}

	public void forward()
	{
		set(DoubleSolenoid.Value.kForward);
		BulldogLogger.getInstance().log(b, "ByteDoubleSolenoid " + on + " " + off + " " + "Forward");
	}

	public void reverse()
	{
		set(DoubleSolenoid.Value.kReverse);
		BulldogLogger.getInstance().log(b, "ByteDoubleSolenoid " + on + " " + off + " " + "Reverse");
	}

	public void disable()
	{
		set(DoubleSolenoid.Value.kOff);
		BulldogLogger.getInstance().log(b, "ByteDoubleSolenoid " + on + " " + off + " " + "Disable");
	}
}