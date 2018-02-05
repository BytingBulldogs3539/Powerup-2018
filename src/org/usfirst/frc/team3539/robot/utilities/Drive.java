package org.usfirst.frc.team3539.robot.utilities;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public final class Drive
{
	//TODO - Add mecanum drive, holonomic drive
	
	TalonSRX talon1, talon2, talon3, talon4, talon5, talon6;
	DriveMode driveMode;

	public static enum DriveMode
	{
		TWO, FOUR, SIX;
	}

	public Drive(TalonSRX right, TalonSRX left)
	{
		driveMode = DriveMode.TWO;

		talon1 = right;
		talon2 = left;
	}

	public Drive(TalonSRX rightFront, TalonSRX rightBack, TalonSRX leftFront, TalonSRX leftBack)
	{
		driveMode = DriveMode.FOUR;
		talon1 = rightFront;
		talon2 = rightBack;
		talon3 = leftFront;
		talon4 = leftBack;
	}

	public Drive(TalonSRX rightFront, TalonSRX rightMiddle, TalonSRX rightBack, TalonSRX leftFront, TalonSRX leftMiddle, TalonSRX leftBack)
	{
		driveMode = DriveMode.SIX;
		talon1 = rightFront;
		talon2 = rightMiddle;
		talon3 = rightBack;
		talon4 = leftFront;
		talon5 = leftMiddle;
		talon6 = leftBack;
	}

	public void driveArcade(double throttle, double wheel)
	{
		double leftMotorSpeed;
		double rightMotorSpeed;

		wheel = limitValue(wheel);
		throttle = limitValue(throttle);

		if (wheel > 0.0)
		{
			if (throttle > 0.0)
			{
				leftMotorSpeed = wheel - throttle;
				rightMotorSpeed = Math.max(wheel, throttle);
			}
			else
			{
				leftMotorSpeed = Math.max(wheel, -throttle);
				rightMotorSpeed = wheel + throttle;
			}
		}
		else
		{
			if (throttle > 0.0)
			{
				leftMotorSpeed = -Math.max(-wheel, throttle);
				rightMotorSpeed = wheel + throttle;
			}
			else
			{
				leftMotorSpeed = wheel - throttle;
				rightMotorSpeed = -Math.max(-wheel, -throttle);
			}
		}
		setLeftRightMotorOutputs(rightMotorSpeed, leftMotorSpeed);
	}

	public void setLeftRightMotorOutputs(double right, double left)
	{
		if (driveMode == DriveMode.TWO)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, left);

		}
		if (driveMode == DriveMode.FOUR)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, right);
			talon3.set(ControlMode.PercentOutput, left);
			talon4.set(ControlMode.PercentOutput, left);
			// System.out.println(right+" "+left);
		}
		if (driveMode == DriveMode.SIX)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, right);
			talon3.set(ControlMode.PercentOutput, right);
			talon4.set(ControlMode.PercentOutput, left);
			talon5.set(ControlMode.PercentOutput, left);
			talon6.set(ControlMode.PercentOutput, left);
		}
	}

	public double limitValue(double value)
	{
		if (value > 1.0)
			value = 1.0;
		if (value < -1.0)
			value = -1.0;
		return value;
	}
}
