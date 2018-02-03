/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3539.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	// Drive talon
	

	
	public static final int leftMaster = 6;
	public static final int leftFollower1 = 7;
//	public static final int leftFollower2 = 0;
	public static final int rightMaster = 4;
	public static final int rightFollower1 = 3;
	//public static final int rightFollower2 = 0;

	// Controllers
	// CONTROLLER AXIS
	public static final int X_AxisL = 0;
	public static final int Y_AxisL = 1;
	public static final int X_AxisR = 4;
	public static final int Y_AxisR = 5;
	public static final int RIGHT_TRIGGER = 3;
	public static final int LEFT_TRIGGER = 2;
	public static final int A = 1;
	public static final int B = 2;
	public static final int X = 3;
	public static final int Y = 4;
	public static final int START = 8;
	public static final int LS = 9;
	public static final int RS = 10;
	public static final int BL = 5;
	public static final int BR = 6;
	public static final int DRIVER = 1;
	public static final int OPERATOR = 0;

	public static final double UnitsPerRotation = 4096;

	//Pid Slot
	public static final int kSlotIdx = 0;

	/**
	 * Talon SRX/ Victor SPX will supported multiple (cascaded) PID loops. For now
	 * we just want the primary one.
	 */
	public static final int kPIDLoopIdx = 0;
	/**
	 * set to zero to skip waiting for confirmation, set to nonzero to wait and
	 * report to DS if action fails.
	 */
	public static final int kTimeoutMs = 10;

	/**
	 * Base trajectory period to add to each individual trajectory point's unique
	 * duration. This can be set to any value within [0,255]ms.
	 */
	public static final int kBaseTrajPeriodMs = 0;

	public static final double kNeutralDeadband = 0.01; // Motor deadband, set to 1%.

}
