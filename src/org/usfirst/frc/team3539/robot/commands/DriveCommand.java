package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command
{
	public DriveCommand()
	{
		requires(Robot.drivetrain);
	}
    protected void initialize() {
    }
    protected void execute() {
    	Robot.drivetrain.driveArcade(Robot.oi.controller1.getRawAxis(RobotMap.Y_AxisL),-Robot.oi.controller1.getRawAxis(RobotMap.X_AxisR));
    }
    
	@Override
	protected boolean isFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
    protected void end() {
    Robot.drivetrain.stopDrive();
    }
    protected void interrupted() {
    	end();
    }
	
}
