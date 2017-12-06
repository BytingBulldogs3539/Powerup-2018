package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteDoubleSolenoid;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteSystem;

import com.ctre.CANTalon;

public class Intake extends ByteSystem
{
	private CANTalon intakeMotor;
	private ByteDoubleSolenoid lock;

	public Intake(String name, boolean isEnabled)
	{
		super(name, isEnabled);
		intakeMotor = new CANTalon(RobotMap.intakeMotorTalon);
		
		lock = new ByteDoubleSolenoid(this, RobotMap.lockSolOn, RobotMap.lockSolOff, false);
		
		intakeMotor.configNominalOutputVoltage(0.0f, -0.0f);
		intakeMotor.configPeakOutputVoltage(12.0f, -12.0f);
		intakeMotor.configMaxOutputVoltage(12);
		intakeMotor.setCurrentLimit(63);
		intakeMotor.EnableCurrentLimit(true);
	}

	public void setMotorPower(double power)
	{
		intakeMotor.set(power);
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
