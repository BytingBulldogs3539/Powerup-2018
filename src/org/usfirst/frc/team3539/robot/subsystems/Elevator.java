package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
//import org.usfirst.frc.team3539.robot.commands.ElevatorCommand;
import org.usfirst.frc.team3539.robot.utilities.LightBeam;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem
{
	private static LightBeam beam;
	TalonSRX lLift, rLift;
	int error = 1000;
	int loopAmount = 0;
	int loopCounter = 0;
	int allowedError = 0;

	public Elevator()
	{
		beam = new LightBeam(0);
		lLift = new TalonSRX(RobotMap.l1LifterMotor);
		
		rLift = new TalonSRX(RobotMap.r1LifterMotor);
		
	}

	public void setMotorPower(double speed)
	{
		lLift.set(ControlMode.PercentOutput, speed);
	
		rLift.set(ControlMode.PercentOutput, -speed);
		
	}
	
	public boolean isTriggered()
	{
		return beam.get();
	}

	@Override
	protected void initDefaultCommand()
	{
		//setDefaultCommand(new ElevatorCommand()); this stuff needs to be fixed
	}
	
	public void zeroEnc()
	{
		lLift.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rLift.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		lLift.getSensorCollection().setPulseWidthPosition(0, 10);
		rLift.getSensorCollection().setPulseWidthPosition(0, 10);
		lLift.setSelectedSensorPosition(lLift.getSelectedSensorPosition(10), 0, 10);
		rLift.setSelectedSensorPosition(rLift.getSelectedSensorPosition(10), 0, 10);
	}

	public void setPID(double P, double I, double D, double F)
	{
		lLift.config_kF(0, F, 10);
		rLift.config_kF(0, F, 10);
		lLift.config_kP(0, P, 10);
		rLift.config_kP(0, P, 10);
		lLift.config_kI(0, I, 10);
		rLift.config_kI(0, I, 10);
		lLift.config_kD(0, D, 10);
		rLift.config_kD(0, D, 10);
	}

	public void setSetpointLift(double setpointinches)
	{
		zeroEnc();
		lLift.set(ControlMode.Position, setpointinches);
		rLift.set(ControlMode.Position, -setpointinches);
	}

	public void DriveSpeed(double Velocity)
	{
		lLift.set(ControlMode.Velocity, ftpsToEncps(Velocity));
		rLift.set(ControlMode.Velocity, ftpsToEncps(-Velocity));
	}

	public double ftpsToEncps(double ftps) // will probably be changed
	{

		return ftps * 394;
		// return ftps * 100.0;
	}

	public double degreesToEnc(double degrees)
	{
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	public boolean onTarget()
	{
		if (lLift.getClosedLoopError(0) <= allowedError && lLift.getClosedLoopError(0) >= -allowedError
				&& rLift.getClosedLoopError(0) <= allowedError && rLift.getClosedLoopError(0) >= -allowedError)
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
		lLift.configAllowableClosedloopError(0, MotorTicks, 10);
		rLift.configAllowableClosedloopError(0, MotorTicks, 10);
		allowedError = MotorTicks;
	}

	public void zeroLoopCounter()
	{
		loopCounter = 0;
	}

	public double inchToEncoder(double inches)
	{
		return (inches / 12.56) * 4096;
	}

	public void updateEnc()
	{
		SmartDashboard.putNumber("Right Enc", rLift.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Enc", lLift.getSelectedSensorPosition(0));
	}

}

