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
	public bbDoubleSolenoid shifter;
	

	public Solenoids()
	{
		intakeSol = new bbDoubleSolenoid(RobotMap.intakesolOn, RobotMap.intakesolOff, false);
		lifterSol = new bbDoubleSolenoid(RobotMap.liftersolOn, RobotMap.liftersolOff, false);
		rampSol = new bbDoubleSolenoid(RobotMap.rampsolOn, RobotMap.rampsolOff, false);
		shifter = new bbDoubleSolenoid(RobotMap.shiftersolOn, RobotMap.shiftersolOff, false);
	}
	//make new solinoid call it shifter and make it generic on and off ports like 3539 in robot map make instant command to toggle

	public void initDefaultCommand()
	{
	}
}
