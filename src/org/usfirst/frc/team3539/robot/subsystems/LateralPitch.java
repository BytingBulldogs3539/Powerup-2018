package org.usfirst.frc.team3539.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LateralPitch extends Subsystem
{
	TalonSRX pitch;
	
	public LateralPitch()
	{
		pitch = new TalonSRX(3539);
	}
	
	@Override
	protected void initDefaultCommand()
	{
		// TODO Auto-generated method stub
	}

}
