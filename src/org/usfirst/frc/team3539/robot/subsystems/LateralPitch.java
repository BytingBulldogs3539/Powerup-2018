package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LateralPitch extends Subsystem
{
	TalonSRX pitch;
	int pitchTimeout = 10;
	int pidIdx = 0;
	int error = 1000;
	int loopAmount = 0;
	int loopCounter = 0;
	int allowedError = 0;

	public enum PitchAngle
	{
		DOWN, INTAKE, UP
	}

	public LateralPitch()
	{
		pitch = new TalonSRX(RobotMap.pitch);

		pitch.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, pidIdx, pitchTimeout);
		pitch.config_kP(pidIdx, RobotMap.pitchPea, pitchTimeout);
		pitch.config_kI(pidIdx, RobotMap.pitchEye, pitchTimeout);
		pitch.config_kD(pidIdx, RobotMap.pitchDee, pitchTimeout);

		pitch.configNominalOutputForward(0, pitchTimeout);

		pitch.configNominalOutputReverse(0, pitchTimeout);

		pitch.configPeakOutputReverse(-1, pitchTimeout);
		pitch.configPeakOutputForward(1, pitchTimeout);

		pitch.configForwardSoftLimitThreshold(RobotMap.pitchLimitUp, pitchTimeout);
		pitch.configReverseSoftLimitThreshold(RobotMap.pitchLimitDown, pitchTimeout);
		pitch.configAllowableClosedloopError(pidIdx, 1000, pitchTimeout);
	}

	public void movePitchUp()
	{
		pitch.set(ControlMode.PercentOutput, .20);
	}

	public void movePitchDown()
	{
		pitch.set(ControlMode.PercentOutput, -.20);
	}

	public void setLateralPID(double p, double i, double d)
	{
		pitch.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, pidIdx, pitchTimeout);
		pitch.config_kP(pidIdx, p, pitchTimeout);
		pitch.config_kI(pidIdx, i, pitchTimeout);
		pitch.config_kD(pidIdx, d, pitchTimeout);
	}

	public void setPosition(PitchAngle position)
	{
		if (position == PitchAngle.DOWN)
		{
			pitch.set(ControlMode.Position, RobotMap.pitchEncPosDown);
		}
		else if (position == PitchAngle.UP)
		{
			pitch.set(ControlMode.Position, RobotMap.pitchEncPosUp);
		}
		else if (position == PitchAngle.INTAKE)
		{
			pitch.set(ControlMode.Position, RobotMap.pitchEncPosIntake);

		}
	}

	public double getEncPos()
	{
		return pitch.getSelectedSensorPosition(0);
	}

	public boolean onTarget()
	{
		if (pitch.getClosedLoopError(0) <= allowedError && pitch.getClosedLoopError(0) >= -allowedError)
		{
			loopCounter++;
			System.out.println(loopCounter);
		}
		else
			loopCounter = 0;
		if (loopCounter >= loopAmount)
		{
			return true;
		}

		return false;
	}

	public void setLoopOnTarget(int LoopAmount)
	{
		loopAmount = LoopAmount;
	}

	public void setTargetAllowedError(int MotorTicks)
	{
		pitch.configAllowableClosedloopError(0, MotorTicks, 10);
		allowedError = MotorTicks;
	}

	public void zeroLoopCounter()
	{
		loopCounter = 0;
	}

	@Override
	protected void initDefaultCommand()
	{
	}

}
