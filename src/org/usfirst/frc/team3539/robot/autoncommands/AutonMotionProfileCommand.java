package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonMotionProfileCommand extends Command {

    public AutonMotionProfileCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.motion);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.motion.Disabled();
    	Robot.motion.Reset();
    	Robot.motion.setMotionProfile();
    	System.out.println("-----motion profile mode set on talon----");
    	Robot.motion.Process();   	
    	Robot.motion.startMotionProfile();

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       	Robot.motion.Control();
       	//
      	//Robot.motion.setMotionProfile(); possibly should be here


    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
   		Robot.motion.SetMotionFalse();
    	Robot.motion.Reset();


    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
