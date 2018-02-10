package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
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

		pitch.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, 0, 10);
		
		pitch.config_kP(0, RobotMap.pitchPea, 10);
		pitch.config_kI(0, RobotMap.pitchEye, 10);
		pitch.config_kD(0, RobotMap.pitchDee, 10);

		pitch.configNominalOutputForward(0, 10);

		pitch.configNominalOutputReverse(0, 10);

		pitch.configPeakOutputReverse(-1, 10);
		pitch.configPeakOutputForward(1, 10);

		pitch.configForwardSoftLimitThreshold(RobotMap.pitchLimitUp, 10);
		pitch.configReverseSoftLimitThreshold(RobotMap.pitchLimitDown, 10);
	}

	public void movePitchUp()
	{
		pitch.set(ControlMode.PercentOutput, .20);
	}

	public void movePitchDown()
	{
		pitch.set(ControlMode.PercentOutput, -.20);
	}

	public void setPID(double P, double I, double D)
	{
		pitch.config_kP(0, P, 10);
		
		pitch.config_kI(0, I, 10);
		
		pitch.config_kD(0, D, 10);
	}

	public void setSetpointPitch(PitchAngle pitchAngle)
	{
		if (pitchAngle == PitchAngle.DOWN)
		{
			pitch.set(ControlMode.Position, RobotMap.pitchEncPosDown);
		}
		else if (pitchAngle == PitchAngle.UP)
		{
			pitch.set(ControlMode.Position, RobotMap.pitchEncPosUp);
		}
		else if (pitchAngle == PitchAngle.INTAKE)
		{
			pitch.set(ControlMode.Position, RobotMap.pitchEncPosIntake);
		}
	}

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;

	public boolean onTarget()
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

		return false;
	}

	public void setupOnTarget(int ticks, int maxLoopNumber)
	{
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

}
