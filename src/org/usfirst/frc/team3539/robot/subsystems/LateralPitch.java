package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LateralPitch extends Subsystem
{
	TalonSRX pitch;
	
	public LateralPitch()
	{
		pitch = new TalonSRX(RobotMap.pitch);
	
	}
	
	public void movePitchUp() //up
	{
		pitch.set(ControlMode.PercentOutput, .20);
	}
	
	public void movePitchDown()
	{
		pitch.set(ControlMode.PercentOutput, -.20);
	}
	
	@Override
	protected void initDefaultCommand()
	{
		// TODO Auto-generated method stub
	}

}
