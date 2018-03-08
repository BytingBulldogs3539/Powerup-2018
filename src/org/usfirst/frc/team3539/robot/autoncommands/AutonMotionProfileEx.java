package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.utilities.MotionProfile;
import org.usfirst.frc.team3539.robot.utilities.MotionProfileExample;

import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonMotionProfileEx extends Command
{
	private double[][] ProfileR;
	private double[][] ProfileL;
	private int totalPointNum;
	public MotionProfileExample m;
	private boolean isfinished = false;
	SetValueMotionProfile setOutput;

	public AutonMotionProfileEx(double[][] ProfileR, double[][] ProfileL, int totalPointNum)
	{
		requires(Robot.driveTrain);

		m = new MotionProfileExample(Robot.driveTrain.rf, Robot.driveTrain.lf, ProfileR, ProfileL, totalPointNum);

	}

	protected void initialize()
	{
		m.reset();
		Robot.driveTrain.rf.configMotionProfileTrajectoryPeriod(10, 10);
		Robot.driveTrain.lf.configMotionProfileTrajectoryPeriod(10, 10);
		Robot.driveTrain.rf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, 10);
		Robot.driveTrain.lf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, 10);
		Robot.driveTrain.rf.setSelectedSensorPosition(0, 0, 10);
		Robot.driveTrain.lf.setSelectedSensorPosition(0, 0, 10);
		setOutput = m.getSetValue();

		Robot.driveTrain.rf.set(ControlMode.MotionProfile, setOutput.value);
		Robot.driveTrain.lf.set(ControlMode.MotionProfile, setOutput.value);
		m.startMotionProfile();
		m.update();

	}

	protected void execute()
	
	{
	///	System.out.println(Robot.driveTrain.rf.getControlMode());
		m.control();
		
		setOutput = m.getSetValue();
		Robot.driveTrain.rf.set(ControlMode.MotionProfile, setOutput.value);
		Robot.driveTrain.lf.set(ControlMode.MotionProfile, setOutput.value);
		
		if(setOutput== SetValueMotionProfile.Hold)
		{
			isfinished = true;
		}
		else
		{isfinished = false;
		}

	
	}

	protected boolean isFinished()
	{

		return isfinished;
	}

	protected void end()
	{
		m.reset();
		isfinished = false;
	}

	protected void interrupted()
	{
		end();
	}
}