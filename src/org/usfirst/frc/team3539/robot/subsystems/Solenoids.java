package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.utilities.bbDoubleSolenoid;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoids extends Subsystem
{
	public bbDoubleSolenoid intakeSol;
	public bbDoubleSolenoid lifterSol;
	public bbDoubleSolenoid rampSol;

	public Solenoids()
	{
		intakeSol = new bbDoubleSolenoid(RobotMap.intakesolOn, RobotMap.intakesolOff, false);
		lifterSol = new bbDoubleSolenoid(RobotMap.liftersolOn, RobotMap.liftersolOff, false);
		rampSol = new bbDoubleSolenoid(RobotMap.rampsolOn, RobotMap.rampsolOff, false);
	}

	public void initDefaultCommand()
	{
	}
}
