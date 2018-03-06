package org.usfirst.frc.team3539.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3539.robot.utilities.ClassLoader;;
/**
 *
 */
public class loadClass extends Command {

	ClassLoader cl = new ClassLoader("cal");
    public loadClass() 
    {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Points "+cl.getkNumPoints());
    	double[][] Rpoints = cl.getRightPoints();
    	System.out.println("Point 1 "+Rpoints[0][1]);
    	System.out.println("Point 2 "+Rpoints[1][1]);
    	System.out.println("Point 3 "+Rpoints[2][1]);
    	System.out.println("Point 4 "+Rpoints[3][1]);
    	double[][] Lpoints = cl.getLeftPoints();
    	System.out.println("Point 1 "+Lpoints[0][1]);
    	System.out.println("Point 2 "+Lpoints[1][1]);
    	System.out.println("Point 3 "+Lpoints[2][1]);
    	System.out.println("Point 4 "+Lpoints[3][1]);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
