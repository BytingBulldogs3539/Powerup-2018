package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonGameDataCheck extends Command {

    public AutonGameDataCheck() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.gameData.equals("   ") || this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	System.out.println("AUTON GAME DATA ENDED============================================");
    	System.out.println(Robot.gameData);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
