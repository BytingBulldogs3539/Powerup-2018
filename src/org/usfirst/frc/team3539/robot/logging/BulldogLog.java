package org.usfirst.frc.team3539.robot.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

import org.usfirst.frc.team3539.robot.RobotMap;

/**
 * Combination of java.io.PrintStream and java.io.File to better encapsulate logging procedure
 * 
 * @author FRC-3539
 *
 * @since 11/12/17
 */

//TODO: Integrate methods for handling JSON data

public class BulldogLog
{
	private PrintStream stream;
	private File file;
	private int logNum;

	public BulldogLog(String fileName, boolean isEnabled)
	{
		if (isEnabled)
		{
			// TODO: Add FileGen UUID or other generation stamp
			String appendFileName = getDate() + "_" + getTime() + "_" + fileName + ".log";

			// Place the log file

			try // Put file on Flash Drive
			{
				file = new File(RobotMap.FLASH_DIR + appendFileName);
				stream = new PrintStream(new FileOutputStream(file));
				System.out.println("==========================================================");
				System.out.println(" FILE IS ON THE USB STICK");
				System.out.println("==========================================================");

			}
			catch (FileNotFoundException e)
			{
				try // If it fails, put file on RIO
				{
					System.out.println("==========================================================");
					System.out.println(" FILE IS ON THE ROBORIO");
					System.out.println("==========================================================");

					file = new File(RobotMap.RIO_DIR + appendFileName);
					stream = new PrintStream(new FileOutputStream(file));

				}
				catch (FileNotFoundException ee)
				{
					ee.printStackTrace();

					e.printStackTrace();
				}
			}
		}
		else
		{
			System.out.println("WARNING!!! YOU SHOULD NEVER SEE THIS EVER!!! " + fileName);
		}
	}

	public void log(String msg, boolean shouldPrint)
	{
		String logMsg = "[" + getTime() + "] " + msg;

		try
		{
			stream.println(logMsg);
			stream.flush();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		if (shouldPrint)
		{
			System.out.println(logMsg);
		}

		logNum++;
	}

	private String getDate()
	{
		return new SimpleDateFormat("yyyy.MM.dd").format(new java.util.Date());
	}

	private String getTime()
	{
		return new SimpleDateFormat("HH:mm:ss:SSS").format(new java.util.Date());
	}

	public int getLogNum()
	{
		return logNum;
	}

	public PrintStream getStream()
	{
		return stream;
	}

	public void exit()
	{
		try
		{
			stream.flush();
			stream.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
