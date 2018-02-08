package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.MotionProfile;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MotionProfileCommand extends Command {

    public MotionProfileCommand() {
        // Use requires() here to declare subsystem dependencies
      requires(Robot.motion);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.motion.Disabled();

    	Robot.motion.Reset();
    	Robot.motion.setMotionProfile();
    	System.out.println("-----motion profile mode set on talon----");
    	Robot.motion.Process();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
   	Robot.motion.Control();	
  	Robot.motion.setMotionProfile();
   	
  	//if (Robot.m_oi.one.buttonX.get())
  		//Robot.motion.reset();
  	if(Robot.m_oi.one.buttonB.get()&&!Robot.motion.start())
  	{
   	//	System.out.println("-------------------------");
   		Robot.motion.startMotionProfile();
   	}else
   	{
   		Robot.motion.SetMotionFalse();
   	}
  	if (Robot.m_oi.one.buttonX.get())
    	Robot.motion.Reset();
    	//Robot.motion.print();

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
