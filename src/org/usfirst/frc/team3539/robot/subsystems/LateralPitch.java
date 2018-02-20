package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LateralPitch extends Subsystem
{
	private TalonSRX pitch;

	public enum PitchAngle
	{
		DOWN, INTAKE, UP
	}

	public LateralPitch()
	{
		pitch = new TalonSRX(RobotMap.pitch);

		pitch.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);

		pitch.configNominalOutputForward(0, 10);
		pitch.configNominalOutputReverse(0, 10);

		pitch.configPeakOutputReverse(-1, 10);
		pitch.configPeakOutputForward(1, 10);

		configureBrakeMode();
		configureSoftLimits();
		shouldSoftLimit(true);
		zeroEncoder();
	}

	private void configureBrakeMode()
	{
		pitch.setNeutralMode(NeutralMode.Brake);
	}

	private void configureSoftLimits()
	{
		pitch.configForwardSoftLimitThreshold(550000, 10); // TODO
		pitch.configReverseSoftLimitThreshold(0, 10); // TODO

		pitch.configForwardSoftLimitEnable(true, 10);
		pitch.configReverseSoftLimitEnable(true, 10);
	}

	public void zeroEncoder()
	{
		pitch.setSelectedSensorPosition(0, 0, 0);
		pitch.getSensorCollection().setPulseWidthPosition(0, 10);
	}

	public void shouldSoftLimit(boolean shouldSoftLimit)
	{
		pitch.overrideSoftLimitsEnable(shouldSoftLimit);
	}

	public void rotate(double power)
	{
		pitch.set(ControlMode.PercentOutput, power);
	}

	public void setPID(double P, double I, double D)
	{
		pitch.config_kP(0, P, 0);

		pitch.config_kI(0, I, 0);

		pitch.config_kD(0, D, 0);
	}

	public double angleToEncoder(double angle)
	{
		System.out.println(angle * 4834.25);
		return angle * 4834.25;
	}

	public void setSetpointPitch(double angle)
	{
		pitch.set(ControlMode.Position, angleToEncoder(angle));
	}

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;
	private boolean isSet;

	public boolean onTarget()
	{
		if (isSet)
		{
			if (Math.abs(pitch.getClosedLoopError(0)) <= allowedErrorRange)
			{
				onTargetCounter++;
			}
			else
			{
				onTargetCounter = 0;
			}

			if (maxLoopNumber <= onTargetCounter)
			{
				return true;
			}
		}
		else
		{
			System.out.println("ERROR - SetupOnTarget is not being called!!!!!!!!");
		}

		return false;
	}

	public void setupOnTarget(int ticks, int maxLoopNumber)
	{
		isSet = true;
		// zero the on target counter
		onTargetCounter = 0;

		pitch.configAllowableClosedloopError(0, ticks, 10);

		// set tolerance in ticks
		allowedErrorRange = ticks;
	}

	@Override
	protected void initDefaultCommand()
	{
	}

	public double getEncoder()
	{
		return pitch.getSelectedSensorPosition(0);
	}

}
