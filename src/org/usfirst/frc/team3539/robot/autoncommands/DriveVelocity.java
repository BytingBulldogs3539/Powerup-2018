package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveVelocity extends Command {
	double V;
    public DriveVelocity(double Velocity) {
        requires(Robot.driveTrain);
        V=Velocity;
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		Robot.driveTrain.setPID(SmartDashboard.getNumber("P", 0), SmartDashboard.getNumber("I", 0), SmartDashboard.getNumber("D", 0),SmartDashboard.getNumber("F", 0));
		Robot.driveTrain.zeroEnc();
		System.out.println(V*394);
		Robot.driveTrain.DriveSpeed(V);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
