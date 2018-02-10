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

	TalonSRX liftTalon1, liftTalon2;
	int error = 0;
	int loopAmount = 0;
	int loopCounter = 0;
	int allowedError = 1000;

	public enum ElevatorPosition
	{
		FLOOR, SWITCH, SCALE, CLIMB
	}

	public Elevator()
	{
		liftTalon1 = new TalonSRX(RobotMap.elevatorMotor1);
		liftTalon2 = new TalonSRX(RobotMap.elevatorMotor2);
		configMotors();
		setMotorPower(0);
	}

	public void setMotorPower(double speed)
	{
	

		liftTalon1.set(ControlMode.PercentOutput, speed);
	}

	public void configMotors()
	{
		liftTalon1.configNominalOutputForward(.3, 10);
		liftTalon1.configNominalOutputForward(-.3, 10);
		liftTalon2.set(ControlMode.Follower, liftTalon1.getDeviceID());
	}

	@Override
	protected void initDefaultCommand()
	{
	}

	public void zeroEnc()
	{
		liftTalon1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, 0, 10);
		liftTalon1.getSensorCollection().setPulseWidthPosition(0, 10);
		liftTalon1.setSelectedSensorPosition(liftTalon1.getSelectedSensorPosition(0), 0, 10);
	}

	public void setPID(double P, double I, double D, double F)
	{
		liftTalon1.config_kF(0, F, 10);
		liftTalon1.config_kP(0, P, 10);
		liftTalon1.config_kI(0, I, 10);
		liftTalon1.config_kD(0, D, 10);
	}

	public void setSetpointLift(double inches)
	{
		liftTalon1.set(ControlMode.Position, inchToEncoder(inches));
	}

	public void setSetpointLift(ElevatorPosition position)
	{
		System.out.println(liftTalon1.getSelectedSensorPosition(0));
		if (position == ElevatorPosition.SWITCH)
		{
			liftTalon1.set(ControlMode.Position, RobotMap.elevatorEncSwitch);
		}
		else if (position == ElevatorPosition.SCALE)
		{
			liftTalon1.set(ControlMode.Position, RobotMap.elevatorEncScale);
		}
		else if (position == ElevatorPosition.FLOOR)
		{
			liftTalon1.set(ControlMode.Position, RobotMap.elevatorEncFloor);
		}
		else if (position == ElevatorPosition.CLIMB)
		{
			liftTalon1.set(ControlMode.Position, RobotMap.elevatorEncClimb);
		}
	}

	public boolean onTarget()
	{
		if (liftTalon1.getClosedLoopError(0) <= allowedError && liftTalon1.getClosedLoopError(0) >= -allowedError)
		{
			loopCounter++;
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
		liftTalon1.configAllowableClosedloopError(0, MotorTicks, 10);
		allowedError = MotorTicks;
	}

	public void zeroLoopCounter()
	{
		loopCounter = 0;
	}

	public double inchToEncoder(double inches)// Will Be A Different Conversion ration.
	{
		return (inches / 12.56) * 4096;
	}

	public void updateEnc()
	{
		SmartDashboard.putNumber("Left Elevator Enc", liftTalon1.getSelectedSensorPosition(0));
	}

}
