package org.usfirst.frc.team3539.robot.management;

/**
 * Management Interface which should be implemented by a Byte-Object wrapper to ensure the processes
 * mesh well with logging, console output, and Dashboard interfacing
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

public interface IManageable
{

	int interval = 50;

	abstract void register();

	abstract void setInterval();

	abstract void getInterval();

	abstract void poll();

	abstract void close();
}
