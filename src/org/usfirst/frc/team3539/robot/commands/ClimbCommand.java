package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.subsystems.Climb;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbCommand extends Command {
private double speed= 0;
    public ClimbCommand() {
    	requires(Robot.climb);
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double x = -Robot.oi.one.getRightTrigger()+(Robot.oi.one.getLeftTrigger());
    	//System.out.println("climbing power"+x);
    	System.out.println("climb speed"+x);
        Robot.climb.setMotorPower(x);	

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climb.setMotorPower(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}