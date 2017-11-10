package org.usfirst.frc.team3539.robot.utilities;

import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class BulldogDoubleSolenoid extends DoubleSolenoid
{
	private boolean isTriggered;
	private boolean initialTrigger;

	public BulldogDoubleSolenoid(int on, int off, boolean isTriggered)
	{
		super(RobotMap.pcm, on, off); // on, off
		this.isTriggered = isTriggered;
		this.initialTrigger = isTriggered;
	}

	public void toggle()
	{
		isTriggered = ! isTriggered;

		if(isTriggered == true)
		{
			set(DoubleSolenoid.Value.kForward);
		}
		if(isTriggered == false)
		{
			set(DoubleSolenoid.Value.kReverse);
		}
	}

	public void forward()
	{
		isTriggered = true;
		set(DoubleSolenoid.Value.kForward);
	}

	public void reverse()
	{
		isTriggered = false;
		set(DoubleSolenoid.Value.kReverse);
	}

	public void disable()
	{
		isTriggered = initialTrigger;
		set(DoubleSolenoid.Value.kOff);
	}
}