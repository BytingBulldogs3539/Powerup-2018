package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoids extends Subsystem
{
	private DoubleSolenoid intakeSol;
	private DoubleSolenoid lifterSol;
	private DoubleSolenoid rampSol;

	public Solenoids()
	{

		intakeSol = new DoubleSolenoid(RobotMap.pcm, RobotMap.intakesolOn, RobotMap.intakesolOff);
		lifterSol = new DoubleSolenoid(RobotMap.pcm, RobotMap.liftersolOn, RobotMap.liftersolOff);
		rampSol = new DoubleSolenoid(RobotMap.pcm, RobotMap.rampsolOn, RobotMap.rampsolOff);
		
	}

	public void rampSol(Value direction)
	{
		rampSol.set(direction);

	}

	public void liftersol(Value direction)
	{
		lifterSol.set(direction);
	}

	public void intakeSol(Value direction)
	{
		intakeSol.set(direction);

	}

	public void initDefaultCommand()
	{
	}
}
