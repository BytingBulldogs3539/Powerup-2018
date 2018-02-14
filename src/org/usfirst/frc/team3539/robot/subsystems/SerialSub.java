package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SerialSub extends Subsystem
{
	SerialPort arduino = new SerialPort(9600, SerialPort.Port.kUSB1);

	public void initDefaultCommand()
	{
	}

	public String readDistAsString()
	{
		return arduino.readString();
	}

	public double getDistance(int value)
	{
		String[] words = readDistAsString().split(",");
		return Double.parseDouble(words[value]);
	}
	public void updateDistances()
	{
		SmartDashboard.putNumber("Range Finder Front", Robot.serialSub.getDistance(RobotMap.frontRangeFinder));
		SmartDashboard.putNumber("Range Finder Right", Robot.serialSub.getDistance(RobotMap.rightRangeFinder));
		SmartDashboard.putNumber("Range Finder Left", Robot.serialSub.getDistance(RobotMap.leftRangeFinder));
		SmartDashboard.putNumber("Range Finder Back", Robot.serialSub.getDistance(RobotMap.backRangeFinder));
	}
}
