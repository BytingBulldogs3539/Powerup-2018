package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem
{
	private TalonSRX liftMaster, liftSlave;

	public enum ElevatorPosition
	{
		FLOOR, SWITCH, SCALE, CLIMB
	}

	public Elevator()
	{
		liftMaster = new TalonSRX(RobotMap.elevatorMotor1);
		liftSlave = new TalonSRX(RobotMap.elevatorMotor2);
		
		liftMaster.configNominalOutputForward(1, 10);
		liftMaster.configNominalOutputForward(-1, 10);
		
		liftSlave.configNominalOutputForward(1, 10);
		liftSlave.configNominalOutputForward(-1, 10);
		
		double peakOut = 1;// 1 is full ouput
		liftMaster.configPeakOutputForward(peakOut, 10);
		liftMaster.configPeakOutputReverse(-peakOut, 10);
		
		liftSlave.configPeakOutputForward(peakOut, 10);
		liftSlave.configPeakOutputReverse(-peakOut, 10);

		liftMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, 0, 10);
		
		setFollower();
		enableCurrentLimit();
		setInverted();
	}
	
	private void setInverted()
	{
		liftMaster.setInverted(false);
		liftSlave.setInverted(true);
	}

	public void setMotorPower(double throttle)
	{
		liftMaster.set(ControlMode.PercentOutput, throttle);
	}
	
	private void enableCurrentLimit()
	{
		liftMaster.enableCurrentLimit(true);
		liftSlave.enableCurrentLimit(true);
	}

	private void setFollower()
	{
		liftSlave.set(ControlMode.Follower, liftMaster.getDeviceID());
	}
	
	public void zeroEncoders()
	{
		liftMaster.getSensorCollection().setPulseWidthPosition(0, 10);

		liftMaster.setSelectedSensorPosition(0, 0, 10);
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
		

		System.out.println("lbcontrol: " + liftMaster.getControlMode());
	}

	public void setSetpointLift(ElevatorPosition position)
	{	
		if (position == ElevatorPosition.SWITCH)
		{
			liftMaster.set(ControlMode.Position, RobotMap.elevatorEncSwitch);
		}
		else if (position == ElevatorPosition.SCALE)
		{
			liftMaster.set(ControlMode.Position, RobotMap.elevatorEncScale);
		}
		else if (position == ElevatorPosition.FLOOR)
		{
			liftMaster.set(ControlMode.Position, RobotMap.elevatorEncFloor);
		}
		else if (position == ElevatorPosition.CLIMB)
		{
			liftMaster.set(ControlMode.Position, RobotMap.elevatorEncClimb);
		}
	}

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;

	public boolean onTarget()
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

		return false;
	}

	public void setupOnTarget(int ticks, int maxLoopNumber)
	{
		// zero the on target counter
		onTargetCounter = 0;
		
		liftMaster.configAllowableClosedloopError(0, ticks, 10);
		
		// set tolerance in ticks
		allowedErrorRange = ticks;
	}

	// Will be a different conversion ratio
	public double inchToEncoder(double inches)
	{
		return (inches / 12.56) * 4096;
	}
	
	public void updateEncoders()
	{
		SmartDashboard.putNumber("Elevator Enc", liftMaster.getSelectedSensorPosition(0));
	}
	
	@Override
	protected void initDefaultCommand()
	{
	}
}
