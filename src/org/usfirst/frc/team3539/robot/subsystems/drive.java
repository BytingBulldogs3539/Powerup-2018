package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.driveCommand;
import org.usfirst.frc.team3539.robot.utilities.SwerveWheel;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class drive extends Subsystem {

	TalonSRX frontRight = new TalonSRX(RobotMap.frontRight);
	TalonSRX frontRightR = new TalonSRX(RobotMap.frontRightR);
	
	TalonSRX frontLeft = new TalonSRX(RobotMap.frontLeft);
	TalonSRX frontLeftR = new TalonSRX(RobotMap.frontLeftR);

	
	TalonSRX rearRight = new TalonSRX(RobotMap.rearRight);
	TalonSRX rearRightR = new TalonSRX(RobotMap.rearRightR);
	
	TalonSRX rearLeft = new TalonSRX(RobotMap.rearLeft);
	TalonSRX rearLeftR = new TalonSRX(RobotMap.rearLeftR);
public drive()
{
	SwerveWheel frontR = new SwerveWheel(frontRightR, frontRight);
	SwerveWheel frontL = new SwerveWheel(frontLeftR, frontLeft);
	
	SwerveWheel rearR = new SwerveWheel(rearRightR, rearRight);
	SwerveWheel rearL = new SwerveWheel(rearLeftR, rearLeft);


}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new driveCommand());
    }
}

