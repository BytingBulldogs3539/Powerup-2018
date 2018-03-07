package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem
{
	private TalonSRX intakeMotorLeft;
	private TalonSRX intakeMotorRight;

	public Intake()
	{
		intakeMotorLeft = new TalonSRX(RobotMap.lIntakeMotor);
		intakeMotorRight = new TalonSRX(RobotMap.rIntakeMotor);
		intakeMotorRight.setNeutralMode(NeutralMode.Brake);
		intakeMotorLeft.setNeutralMode(NeutralMode.Brake);


		enableCurrentLimit();
	}

	public void setMotorPower(double power)
	{
		intakeMotorLeft.set(ControlMode.PercentOutput, power);
		intakeMotorRight.set(ControlMode.PercentOutput, -power);
	}
	
	private void enableCurrentLimit()
	{
		intakeMotorLeft.configPeakCurrentLimit(35, 10);
		intakeMotorRight.configPeakCurrentLimit(35, 10);
		
		intakeMotorLeft.configPeakCurrentDuration(200, 10);
		intakeMotorRight.configPeakCurrentDuration(200, 10);
		
		intakeMotorLeft.configContinuousCurrentLimit(35, 10);
		intakeMotorRight.configContinuousCurrentLimit(35, 10);

		intakeMotorLeft.enableCurrentLimit(true); // TODO - Change to true and add rest of current code
		intakeMotorRight.enableCurrentLimit(true);
	}

	public void initDefaultCommand()
	{
	}
}
