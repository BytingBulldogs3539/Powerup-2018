package org.usfirst.frc.team3539.robot.logging;

import java.util.ArrayList;

/**
 * Logging class for file logging somewhat kinda-ish maybe similiar to Log4J
 * 
 * @author FRC-3539
 * @author Kevin Hein
 *
 * @since 3/01/17
 */

// TODO: UUID?
// TODO: Add JSON file to keep metadata
// TODO: Create new files in RobotMap.RIO_DIR when RobotMap.FLASH_DIR is lost
// TODO: Create options for when to print data to console
// TODO: Diversify methods use to log
// TODO: Refractor log names to better fit their intended purpose

public class BulldogLogger
{
	private static BulldogLogger bl;
	
	private ArrayList<BulldogLog> logs = new ArrayList<BulldogLog>();

	private BulldogLog periodicLog;
	private BulldogLog eventLog;
	private BulldogLog commandLog;
	// private int fileGeneration = 10;

	/**
	 * private constructor - Singleton
	 */
	private BulldogLogger()
	{

		System.out.println("Started logging");

		periodicLog = new BulldogLog("periodicLog", true);
		eventLog = new BulldogLog("eventLog", true);
		commandLog = new BulldogLog("commandLog", true);
		
		logs.add(periodicLog);
		logs.add(eventLog);
		logs.add(commandLog);;
	}

	public static BulldogLogger getInstance()
	{
		if (bl == null)
		{
			bl = new BulldogLogger();
			return bl;
		}
		else
			return bl;
	}

	public void logPeriodic(String msg)
	{
		periodicLog.log(msg, true);
	}

	public void logEvent(String msg)
	{
		eventLog.log(msg, true);
	}

	public void logCommand(String msg)
	{
		commandLog.log(msg, true);
	}

	public void finishLogging()
	{
		int total = 0;
		
		for (BulldogLog bulldogLog : logs)
		{
			total += bulldogLog.getLogNum();
		}
		
		String s = "We logged " + total + 1 + " things! log log log";

		periodicLog.log(s, true);

		for (BulldogLog bulldogLog : logs)
		{
			bulldogLog.exit();
		}
	}
}