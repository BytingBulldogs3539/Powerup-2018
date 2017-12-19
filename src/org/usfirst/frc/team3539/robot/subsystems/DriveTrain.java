package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteSystem;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteTalon;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;

import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain extends ByteSystem
{
	private ByteTalon lf, rf, lb, rb;
	private RobotDrive drive;
	
	public DriveTrain(String name, boolean isEnabled)
	{
		super(name, isEnabled);

		lf = new ByteTalon(this, RobotMap.lfMotorTalon, "lfMotorTalon");
		lb = new ByteTalon(this, RobotMap.lbMotorTalon, "lbMotorTalon");
		rf = new ByteTalon(this, RobotMap.rfMotorTalon, "rfMotorTalon");
		rb = new ByteTalon(this, RobotMap.rbMotorTalon, "rbMotorTalon");

		lf.changeControlMode(TalonControlMode.PercentVbus);
		rf.changeControlMode(TalonControlMode.PercentVbus);

		rb.changeControlMode(TalonControlMode.Follower);
		lb.changeControlMode(TalonControlMode.Follower);

		rb.set(rf.getDeviceID());
		lb.set(lb.getDeviceID());

		drive = new RobotDrive(lf, rf);

		lf.setSafetyEnabled(false);
		rf.setSafetyEnabled(false);
		lb.setSafetyEnabled(false);
		rb.setSafetyEnabled(false);
	}


	public void driveArcade(double moveValue, double rotateValue)
	{
		drive.arcadeDrive(moveValue, rotateValue);
	}

	
	public void initDefaultCommand()
	{
		setDefaultCommand(new DriveCommand());
	}
}
