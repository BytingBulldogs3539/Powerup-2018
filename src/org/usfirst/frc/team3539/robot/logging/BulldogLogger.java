package org.usfirst.frc.team3539.robot.logging;

import java.util.ArrayList;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteSystem;

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

	//SmartDash log
	//Network tables log
	//Input log for controllers
	private BulldogLog inputLog;
	private BulldogLog eventLog;
	private BulldogLog commandLog;
	// private int fileGeneration = 10;

	/**
	 * private constructor - Singleton
	 */
	private BulldogLogger()
	{
		System.out.println("*** BULLDOGLOGGER FIRST CALL ***");

		eventLog = createLog("eventLog", true);
		inputLog = createLog("inputLog", true);
		commandLog = createLog("commandLog", true);
		
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
	
	public BulldogLog createLog(String name, boolean isEnabled)
	{
		BulldogLog log = new BulldogLog(name, isEnabled);
		logs.add(log);
		return log;
	}

	public void logEvent(String msg)
	{
		eventLog.log(msg, RobotMap.shouldPrintEvent);
	}

	public void logCommand(String msg)
	{
		commandLog.log(msg, RobotMap.shouldPrintCommand);
	}
	
	public void logInput(String msg)
	{
		inputLog.log(msg, RobotMap.shouldPrintInput);
	}
	
	public void log(ByteSystem b, String msg)
	{
		b.getLog().log(msg, RobotMap.shouldPrintSubsystem);
	}

	public void finishLogging()
	{
		int totalLines = 0;
		int totalAttempts = 0;
		
		for (BulldogLog bulldogLog : logs)
		{
			totalLines += bulldogLog.getTotalLines();
		}
		
		//We do one additional line before we close the files but after we count so
		//the following lines account for it
		totalLines++;
		totalAttempts++;
		
		String s = "We logged " + totalLines + " things! with " + totalAttempts + "attempts. log! log! log!";

		eventLog.log(s, true);
		
		if(totalLines != totalAttempts)
		{
			System.out.println("WARNING - DATA HAS FAILED TRY CATCH FOR FILE!!!!! - FIX ASAP");
			System.out.println("WARNING - DATA HAS FAILED TRY CATCH FOR FILE!!!!! - FIX ASAP");
			System.out.println("WARNING - DATA HAS FAILED TRY CATCH FOR FILE!!!!! - FIX ASAP");
		}

		for (BulldogLog bulldogLog : logs)
		{
			bulldogLog.exit();
		}
		
		System.out.println("*** BULLDOGLOGGER LAST CALL ***");
	}
}