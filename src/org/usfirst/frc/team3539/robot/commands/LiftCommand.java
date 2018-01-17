package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftCommand extends Command {

    public LiftCommand() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.lifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.twoPadUp.get())
    	{
    		Robot.lifter.upLift(1);
    	}
    	else if (Robot.oi.twoA.get())
    	{
    		Robot.lifter.downLift(1);
    	}
    } //Temp set for operator dPad

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (!Robot.oi.twoPadUp.get() && !Robot.oi.twoA.get())
    	{
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lifter.stop();
    	System.out.println("Ended");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
