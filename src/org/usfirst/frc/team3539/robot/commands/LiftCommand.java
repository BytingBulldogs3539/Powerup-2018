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
    		Robot.lifter.upLift(.5);
    	}
    	else if (Robot.oi.twoPadDown.get())
    	{
    		Robot.lifter.downLift(-.5);
    	}
    } //Temp set for operator dPad

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Robot.oi.twoPadUp.get() || Robot.oi.twoPadDown.get())
    	{
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lifter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
