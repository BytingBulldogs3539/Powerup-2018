package org.usfirst.frc.team3539.robot.subsystems;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SerialSub extends Subsystem {
	SerialPort arduino;

	public SerialSub() {
		try {
			arduino = new SerialPort(9600, SerialPort.Port.kUSB1);
		} catch (Exception e) {
			System.out.println("ARDUINO NOT PLUGGED IN????");
		}
	}

	public void initDefaultCommand() {
	}

	public String readDistAsString() {
		try {
			return arduino.readString();
		} catch (Exception e) {
			return "";
		}
	}

	public double getDistance(int value) {

		try {
			String[] words = readDistAsString().split(",");
			return Double.parseDouble(words[value]);
		} catch (Exception e) {
			return 0;
		}

	}
	public void write(String value)
	{
		try {
			arduino.writeString(value);
		}
		catch(Exception e){
			
		}
	}
	public void setColor(int RED, int GREEN, int BLUE)
	{
		int rgb = RED;
		rgb = (rgb << 8) + GREEN;
		rgb = (rgb << 8) + BLUE;
		write(""+rgb);
		
	}
}
