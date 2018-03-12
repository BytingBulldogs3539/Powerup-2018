package org.usfirst.frc.team3539.robot.utilities;
//package org.usfirst.logging.is.the.most.cancerous.thing.ive.ever.done.utilities;

import java.text.SimpleDateFormat;
import java.io.*;

public class Logger
{
	private static int DEBUG = 0; // special stream for solving a problem
	private static int INFO = 1; // any information, like statuses, constant
									// logging
	private static int ERROR = 3; // caught errors or warnings
	private static int COMMAND = 4; // any command that is run
	private static int EVENT = 5; // useful things that happen (field control?
									// etc)

	private static String PERIODIC_BASE_FILE = "periodicLog";
	private static String EVENT_BASE_FILE = "eventLog";
	private static String COMMAND_BASE_FILE = "commandLog";
	private static String RIO_DIR = "/home/lvuser/logs/";

	private File periodicFile;
	private File eventFile;
	private File commandFile;

	private PrintStream periodicStream;
	private PrintStream eventStream;
	private PrintStream commandStream;

	private int entryCount;

	// Format: year, month, day, hour, minute, second, millisecond

	private int fileGeneration = 10;

	private boolean hasFiles = false;

	private Logger(boolean isPeriodicLogging, boolean isEventLogging, boolean isCommandLogging)
	{
		startLogging(isPeriodicLogging, isEventLogging, isCommandLogging);
	}

	public void startLogging(boolean isPeriodicLogging, boolean isEventLogging, boolean isCommandLogging)
	{
		System.out.println("Started logging");
		periodicStream = createFile(periodicFile, PERIODIC_BASE_FILE, periodicStream, isPeriodicLogging);
		eventStream = createFile(eventFile, EVENT_BASE_FILE, eventStream, isEventLogging);
		commandStream = createFile(commandFile, COMMAND_BASE_FILE, commandStream, isCommandLogging);
		hasFiles = true;
	}

	private PrintStream createFile(File file, String fileName, PrintStream stream, boolean isEnabled)
	{
		if(isEnabled)
		{
			entryCount = 0;
			String fileNamee = getDate() + "_" + getTime() + "_" + fileName + ".log";

			try
			{
				System.out.println("==========================================================");
				System.out.println("created log file on rio named: " + fileNamee);
				System.out.println("==========================================================");
				file = new File(RIO_DIR + fileNamee);
				stream = new PrintStream(new FileOutputStream(file));
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		return stream;
	}

	public String getDate()
	{
		return new SimpleDateFormat("yyyy.MM.dd").format(new java.util.Date());
	}

	public String getTime()
	{
		return new SimpleDateFormat("HH:mm:ss:SSS").format(new java.util.Date());
	}

	public void logDeb(String msg)
	{
		log(Logger.DEBUG, msg, true);
	}

	public void logInfo(String msg)
	{
		log(Logger.INFO, msg, true);
	}

	public void logErr(String msg)
	{
		log(Logger.ERROR, msg, true);
	}

	public void logCom(String msg)
	{
		log(Logger.COMMAND, msg, true);
	}

	public void logEve(String msg)
	{
		log(Logger.EVENT, msg, true);
	}

	private void log(int type, String msg, boolean printlin)
	{
		if(hasFiles)
		{
			entryCount++;
			String timeStamp = getTime();
			String logMsg = new String();

			switch (type)
			{
			case 0:
				logMsg = "[DEBUG - " + timeStamp + "] ";
				break;
			case 1:
				logMsg = "[INFO  - " + timeStamp + "] ";
				break;
			case 3:
				logMsg = "[ERROR - " + timeStamp + "] ";
				break;
			case 4:
				logMsg = "[COMMAND - " + timeStamp + "] ";
				break;
			case 5:
				logMsg = "[EVENT - " + timeStamp + "] ";
				break;
			default:
				logMsg = "[WHAT? - " + timeStamp + "] ";
			}

			logMsg = logMsg + msg;

			try
			{
				periodicStream.println(logMsg);
				this.periodicStream.flush();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			if(type == Logger.EVENT)
			{
				try
				{
					eventStream.println(logMsg);
					this.eventStream.flush();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			if(type == Logger.COMMAND)
			{
				try
				{
					commandStream.println(logMsg);
					this.commandStream.flush();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			if(printlin)
			{
				System.out.println(logMsg);
			}
		}
		else
			System.out.println("No Files!!!");
	}

	public void finishLogging()
	{
		String s = "We logged " + entryCount + " things! log log log";

		log(10, s, true);

		hasFiles = false;

		try
		{
			this.periodicStream.flush();
			this.periodicStream.close();
			this.eventStream.flush();
			this.eventStream.close();
			this.commandStream.flush();
			this.commandStream.close();
		}
		catch(Exception e)
		{

		}
	}
}
