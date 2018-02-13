package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
//import org.usfirst.frc.team3539.robot.utilities.bbDoubleSolenoid;
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
	public bbDoubleSolenoid shifterSol;
	

	public Solenoids()
	{
		intakeSol = new bbDoubleSolenoid(RobotMap.intakesolOn, RobotMap.intakesolOff, false);
		lifterSol = new bbDoubleSolenoid(RobotMap.liftersolOn, RobotMap.liftersolOff, false);
		rampSol = new bbDoubleSolenoid(RobotMap.rampsolOn, RobotMap.rampsolOff, false);
		shifterSol = new bbDoubleSolenoid(RobotMap.shiftersolOn, RobotMap.shiftersolOff, false);
	}

	public void initDefaultCommand()
	{
	}
}
