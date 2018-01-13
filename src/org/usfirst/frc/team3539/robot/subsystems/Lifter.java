package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem
{
	TalonSRX liftMotor = new TalonSRX(RobotMap.LifterMotor);
	
	
	public void initDefaultCommand() 
	{
		
	}
}
