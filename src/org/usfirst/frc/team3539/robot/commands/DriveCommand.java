package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command
{

	protected DriveCommand(String name)
	{
		super(name);
	}
	
	protected void execute()
	{
		Robot.drivetrain.driveTrain(Robot.oi.controller1.getRawAxis(RobotMap.Y_AxisL), Robot.oi.controller1.getRawAxis(RobotMap.X_AxisR));
	}

	@Override
	protected boolean isFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
