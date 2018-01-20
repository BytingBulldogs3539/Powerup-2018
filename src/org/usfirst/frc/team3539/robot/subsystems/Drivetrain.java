package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem 
{
	TalonSRX lf, lb, rf, rb;
	Drive drive;
	
	public Drivetrain(String name, boolean isEnabled)
	{
		lf = new TalonSRX(RobotMap.lf);
		lb = new TalonSRX(RobotMap.lb);
		rf = new TalonSRX(RobotMap.rf);
		rb = new TalonSRX(RobotMap.rb);

		lf.configPeakOutputForward(1, 1);
		lf.configPeakOutputReverse(-1, 1);
		rf.configPeakOutputForward(1, 1);
		rf.configPeakOutputReverse(-1, 1);

		lb.configPeakOutputForward(1, 1);
		lb.configPeakOutputReverse(-1, 1);
		rb.configPeakOutputForward(1, 1);
		rb.configPeakOutputReverse(-1, 1);


		lf.configNominalOutputForward(0, 1);
		rf.configNominalOutputForward(0, 1);
		lb.configNominalOutputForward(0, 1);
		rb.configNominalOutputForward(0, 1);
		lf.configNominalOutputReverse(0, 1);
		rf.configNominalOutputReverse(0, 1);
		lb.configNominalOutputReverse(0, 1);
		rb.configNominalOutputReverse(0, 1);

		drive = new Drive(rf,rb,lf,lb);
	}
	
	public void driveArcade(double forward, double rotate)
	{
		System.out.println(forward+" "+rotate);
		drive.driveArcade(forward, rotate);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
		
	}

	public void stopDrive()
	{
		// TODO Auto-generated method stub
		driveArcade(0,0);
	}

}
