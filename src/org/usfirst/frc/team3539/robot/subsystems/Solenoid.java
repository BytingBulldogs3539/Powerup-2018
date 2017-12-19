package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteDoubleSolenoid;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteSystem;

public class Solenoid extends ByteSystem
{
	private ByteDoubleSolenoid trans;
	private ByteDoubleSolenoid lock;

	public Solenoid(String name, boolean isEnabled)
	{
		super(name, isEnabled);
		trans = new ByteDoubleSolenoid(this, RobotMap.driveOn, RobotMap.driveOff, false);
		lock = new ByteDoubleSolenoid(this, RobotMap.lockSolOn, RobotMap.lockSolOff, false);
		// TODO Auto-generated constructor stub
	}

	public void toggleTrans()
	{
		trans.toggle();
	}

	public void highGear()
	{
		trans.forward();
	}

	public void lowGear()
	{
		trans.reverse();
	}

	public void lockOff()
	{
		lock.reverse();
	}

	public void lockOn()
	{
		lock.forward();
	}

}
