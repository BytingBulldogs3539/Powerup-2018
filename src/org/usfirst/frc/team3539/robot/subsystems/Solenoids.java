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
	public bbDoubleSolenoid shifterSol;

	public Solenoids()
	{
		intakeSol = new bbDoubleSolenoid(RobotMap.intakesolOn, RobotMap.intakesolOff, true);
		shifterSol = new bbDoubleSolenoid(RobotMap.shiftersolOn, RobotMap.shiftersolOff, false);
	}

	public void initDefaultCommand()
	{
	}
}
