package org.usfirst.frc.team3539.robot.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
	private int totalLines;
	private int totalAttempts;

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
				System.out.println(fileName + " FILE IS ON THE USB STICK");
				System.out.println(">>>");

			}
			catch (FileNotFoundException e)
			{
				try // If it fails, put file on RIO
				{
					System.out.println("==========================================================");
					System.out.println(fileName + " FILE IS ON THE ROBORIO");
					System.out.println(">>>");

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
			System.out.println("WARNING!!! YOU SHOULD NEVER SEE THIS EVER!!! LOG NOT ENABLED " + fileName);
		}
	}

	public void log(String msg, boolean shouldPrint)
	{
		String logMsg = "[" + getTime() + "] " + msg;

		try
		{
			stream.println(logMsg);
			stream.flush();
			totalLines++;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		if (shouldPrint)
		{
			System.out.println(logMsg);
		}
		totalAttempts++;
	}

	private String getDate()
	{
		return new SimpleDateFormat("yyyy.MM.dd").format(new java.util.Date());
	}

	private String getTime()
	{
		return new SimpleDateFormat("HH:mm:ss:SSS").format(new java.util.Date());
	}

	public int getTotalLines()
	{
		return totalLines;
	}
	
	public int getTotalAttempts()
	{
		return totalAttempts;
	}

	public PrintStream getStream()
	{
		return stream;
	}
	
	public static File getLastLogFile()
	{
		List<String> filenames = getAllLogFiles().stream().map(File::getName).collect(Collectors.toList());
		filenames.sort(null);
		if(filenames.isEmpty())
			return null;
		
		String lastfile = filenames.get(filenames.size()-1);
		return new File(getLogDirectory(), lastfile);	
	}
	
	public static File getLogDirectory()
	{
		File base = determineMountPoint();
		if (base == null)
			return base;
		
		File logDir = new File(base,"logs"); //-----------------------------------------------------------
		if (!logDir.exists())
			logDir.mkdirs();
		return logDir;
	}
	
	public static File determineMountPoint()
	{
        char iter = 'z';
        for (int i = 0; i < 16; i++) {
        	System.out.println("thing: " + iter);
            File f = new File("/" + iter);
            if (f.exists() && f.isDirectory()) {
                return f;
            }
            iter--;
        }
        return new File("C:\\test");		
	}
	
	//public static Collection<File> getAllLogFolders()
	//{
	
	public static Collection<File> getAllLogFiles()
	{
		FilenameFilter filter = new FilenameFilter()
				{
					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						String lc = name.toLowerCase();
						return lc.matches("\\d\\d\\d\\d.log");
					}
				};
		File logDir = getLogDirectory();
		File[] files = logDir.listFiles(filter);
		
		if (files == null)
			return new ArrayList<File>();
		
		return Arrays.asList(files);
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
