package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SerialSub extends Subsystem
{
	// SerialPort arduino = new SerialPort(9600, SerialPort.Port.kUSB1);

	public void initDefaultCommand()
	{
	}

	// public String readDistAsString()
	// {
	// return arduino.readString();
	// }
	//
	// public double getDistance(int value)
	// {
	// String[] words = readDistAsString().split(",");
	// return Double.parseDouble(words[value]);
	// }
}
