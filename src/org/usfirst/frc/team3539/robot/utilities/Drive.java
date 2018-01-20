package org.usfirst.frc.team3539.robot.utilities;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drive 
	TalonSRX talon1,talon2,talon3,talon4,talon5,talon6;
	DriveMode driveMode;
	
	public enum DriveMode
	{
		Four, Six, Two
	}
	
	public Drive(TalonSRX Right, TalonSRX Left)
	{
		driveMode = DriveMode.Two;
		
		talon1 = Right;
		talon2 = Left;
	}
	public Drive(TalonSRX RightFront, TalonSRX RightBack,TalonSRX LeftFront, TalonSRX LeftBack)
	{
		driveMode = DriveMode.Four;
		talon1= RightFront;
		talon2= RightBack;
		talon3= LeftFront;
		talon4= LeftBack;
	}
	public Drive(TalonSRX RightFront, TalonSRX RightMiddle,TalonSRX RightBack, TalonSRX LeftFront,TalonSRX LeftMiddle, TalonSRX LeftBack)
	{
		driveMode = DriveMode.Six;
		talon1=RightFront;
		talon2=RightMiddle;
		talon3=RightBack;
		talon4=LeftFront;
		talon5=LeftMiddle;
		talon6=LeftBack;
	}
	
	public void driveArcade(double axis0, double axis1)
	{
	    double leftMotorSpeed;
	    double rightMotorSpeed;
	    
	    
	    axis0 = limit(axis0);
	    axis1 = limit(axis1);
	    
	    
	    if (axis0 > 0.0) {
	        if (axis1 > 0.0) {
	          leftMotorSpeed = axis0 - axis1;
	          rightMotorSpeed = Math.max(axis0, axis1);
	        } else {
	          leftMotorSpeed = Math.max(axis0, -axis1);
	          rightMotorSpeed = axis0 + axis1;
	        }
	      } else {
	        if (axis1 > 0.0) {
	          leftMotorSpeed = -Math.max(-axis0, axis1);
	          rightMotorSpeed = axis0 + axis1;
	        } else {
	          leftMotorSpeed = axis0 - axis1;
	          rightMotorSpeed = -Math.max(-axis0, -axis1);
	        }
	      }
	    setLeftRightMotorOutputs(rightMotorSpeed, leftMotorSpeed);
	}
	public void setLeftRightMotorOutputs(double right, double left)
	{
		if (driveMode == DriveMode.Two)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, left);
		}
		if (driveMode == DriveMode.Four)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, right);
			talon3.set(ControlMode.PercentOutput, left);
			talon4.set(ControlMode.PercentOutput, left);
		}
		if (driveMode == DriveMode.Six)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, right);
			talon3.set(ControlMode.PercentOutput, right);
			talon4.set(ControlMode.PercentOutput, left);
			talon5.set(ControlMode.PercentOutput, left);
			talon6.set(ControlMode.PercentOutput, left);
		}
	}
	public double limit(double limiting)
	{
		if (limiting > 1.0)
			limiting = 1.0;
		if (limiting < -1.0)
			limiting = -1.0;
		return limiting;
	}
}
