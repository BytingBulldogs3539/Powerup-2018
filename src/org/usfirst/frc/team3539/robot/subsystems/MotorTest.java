package org.usfirst.frc.team3539.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MotorTest extends Subsystem {

	//TalonSRX Motor=new TalonSRX(0);
	public MotorTest()
	{
		//Motor.set(ControlMode.PercentOutput, 0);
	}
	public void setMotor(double Speed)
	{
		//Motor.set(ControlMode.PercentOutput, Speed);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

