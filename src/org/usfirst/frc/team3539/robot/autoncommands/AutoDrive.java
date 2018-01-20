package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 */
public class AutoDrive extends PIDCommand {

    public AutoDrive(double inches) {
    	super(RobotMap.driveP, RobotMap.driveI, RobotMap.driveD);
    	this.getPIDController().setSetpoint(inches);
        requires(Robot.drivetrain);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    	Robot.drivetrain.zeroEncoder();
    	this.getPIDController().setAbsoluteTolerance(5);
    	this.getPIDController().setPID(RobotMap.driveP, RobotMap.driveI, RobotMap.driveD);
    	this.getPIDController().enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	System.out.println(Robot.drivetrain.getBalEnc()/4096*12.56);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.getPIDController().onTarget();
    }

    // Called once after isFinished returns true
    protected void end()
    {
    	Robot.drivetrain.stopDrive();
    	this.getPIDController().disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    	end();
    }

	@Override
	protected double returnPIDInput()
	{
		return -Robot.drivetrain.getBalEnc()/4096*12.56;
	}

	@Override
	protected void usePIDOutput(double output)
	{
		Robot.drivetrain.driveArcade(output, 0);
		System.out.println(output);
	}
}
