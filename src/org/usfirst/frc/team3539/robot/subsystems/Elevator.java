package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.ElevatorManualCommand;
import org.usfirst.frc.team3539.robot.logger.Log;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem
{
	private TalonSRX liftMaster, liftSlave;
	
	@Log(level = 1) int elevatorEncPos;
	@Log(level = 1) int elevatorEncVel;
	@Log(level = 1) double elevatorMotorPercent;
	@Log(level = 1) double elevatorStick;
	@Log(level = 1) double elevatorCurrent;

	public enum ElevatorPosition
	{
		FLOOR, SWITCH, SCALE, CLIMB
	}

	public Elevator()
	{

		liftMaster = new TalonSRX(RobotMap.elevatorMotorTwo);

		liftMaster.configSelectedFeedbackSensor(FeedbackDevice.PulseWidthEncodedPosition, 0, 10);

		liftMaster.configNominalOutputForward(0, 10);
		liftMaster.configNominalOutputReverse(0, 10);

		liftMaster.configPeakOutputReverse(-1, 10);
		liftMaster.configPeakOutputForward(1, 10);

		liftSlave = new TalonSRX(RobotMap.elevatorMotorOne);

		liftSlave.configNominalOutputForward(0, 10);
		liftSlave.configNominalOutputReverse(0, 10);

		liftSlave.configPeakOutputReverse(-1, 10);
		liftSlave.configPeakOutputForward(1, 10);

		liftMaster.setSensorPhase(true);

		setFollower();

		configureSoftLimits();

		configureBrakeMode();

		enableRamp();

		// disableRamp();

		zeroEncoders();

	}
	
	public void updateLog()
	{
		elevatorEncPos = liftMaster.getSelectedSensorPosition(0);
		elevatorEncVel = liftMaster.getSelectedSensorVelocity(0);
		elevatorStick = Robot.oi.two.getLeftStickY();
		elevatorMotorPercent = liftMaster.getMotorOutputPercent();
		elevatorCurrent = liftMaster.getOutputCurrent();
		
	}

	private void configureBrakeMode()
	{
		liftMaster.setNeutralMode(NeutralMode.Brake);
		liftSlave.setNeutralMode(NeutralMode.Brake);
	}

	private void setInverted()
	{
		liftMaster.setInverted(false);
		liftSlave.setInverted(false);
	}

	private void configureSoftLimits()
	{
		liftMaster.configForwardSoftLimitThreshold(50000, 0); // TODO
		liftMaster.configReverseSoftLimitThreshold(0, 0); // TODO

		liftMaster.configForwardSoftLimitEnable(true, 10);
		liftMaster.configReverseSoftLimitEnable(true, 10);
	}

	public void enableRamp()
	{
		liftMaster.configOpenloopRamp(.5, 10);
	}

	public void disableRamp()
	{
		liftMaster.configOpenloopRamp(0, 0);
	}

	public void shouldSoftLimit(boolean shouldSoftLimit)
	{
		liftMaster.configForwardSoftLimitEnable(shouldSoftLimit, 10);
		liftMaster.configReverseSoftLimitEnable(shouldSoftLimit, 10);
	}

	public void setMotorPower(double throttle)
	{
		liftMaster.set(ControlMode.PercentOutput, throttle);
	}

	public double getEncoder()
	{
		return liftMaster.getSelectedSensorPosition(0);
	}

	private void enableCurrentLimit()
	{
		// Omar I hate u
		liftMaster.enableCurrentLimit(false);// TODO - Change to true and add rest of current code
		liftSlave.enableCurrentLimit(false);
	}

	private void setFollower()
	{
		liftSlave.set(ControlMode.Follower, liftMaster.getDeviceID());
	}

	public void zeroEncoders()
	{
		liftMaster.getSensorCollection().setPulseWidthPosition(0, 0);
		liftMaster.getSensorCollection().setQuadraturePosition(0, 0);
		liftMaster.setSelectedSensorPosition(0, 0, 0);
	}

	public void setPID(double P, double I, double D, double F)
	{
		liftMaster.config_kF(0, F, 10);

		liftMaster.config_kP(0, P, 10);

		liftMaster.config_kI(0, I, 10);

		liftMaster.config_kD(0, D, 10);
	}

	public void setSetpointLift(double inches)
	{
		// DO NOT ZERO ENCODER

		liftMaster.set(ControlMode.Position, inchToEncoder(inches));
	}

	public void setSetpointLift(ElevatorPosition position)
	{
		double inches = 0;

		if (position == ElevatorPosition.SWITCH)
		{
			inches = RobotMap.elevatorEncoderSwitch;
		}
		else if (position == ElevatorPosition.SCALE)
		{
			inches = RobotMap.elevatorEncoderScale;
		}
		else if (position == ElevatorPosition.FLOOR)
		{
			inches = RobotMap.elevatorEncoderFloor;
		}
		else if (position == ElevatorPosition.CLIMB)
		{
			inches = RobotMap.elevatorEncoderClimb;
		}

		setSetpointLift(inches);
	}

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;
	private boolean isSet;

	public boolean onTarget()
	{
		if (isSet)
		{
			if (Math.abs(liftMaster.getClosedLoopError(0)) <= allowedErrorRange)
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

		liftMaster.configAllowableClosedloopError(0, ticks, 10);

		// set tolerance in ticks
		allowedErrorRange = ticks;
	}

	// Will be a different conversion ratio
	public double inchToEncoder(double inches)
	{
		System.out.println((inches * 826) * .82);
		return ((inches * 826) * .82);

	}

	public double encoderToInches(double inches)
	{
		System.out.println((inches / 826) / .82);
		return ((inches / 826) / .82);
	}

	public void updateEncoders()
	{
		SmartDashboard.putNumber("Elevator Encoder", liftMaster.getSelectedSensorPosition(0));
		liftMaster.getSensorCollection().getPulseWidthPosition();
	}

	@Override
	protected void initDefaultCommand()
	{
		setDefaultCommand(new ElevatorManualCommand());
	}
	
	
}
