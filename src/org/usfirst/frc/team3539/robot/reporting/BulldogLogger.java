package org.usfirst.frc.team3539.robot.reporting;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

//import java.util.Random;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Logging class for all Team 3539 file logging somewhat kinda-ish maybe similiar to Log4J
 * 
 * @author Kevin Hein
 * @author Programmers of 3539
 * 
 * @version 3.539
 *
 */

public class BulldogLogger
{
	private static BulldogLogger bl;
	
	private ArrayList<BulldogLog> logs = new ArrayList<BulldogLog>();

	private BulldogLog periodicLog;
	private BulldogLog eventLog;
	private BulldogLog commandLog;

	// TODO: UUID?
	// private int fileGeneration = 10;

	/**
	 * private constructor - Singleton
	 */
	private BulldogLogger()
	{
		startLogging();
	}

	public void startLogging()
	{
		System.out.println("Started logging");

		periodicLog = new BulldogLog("periodicLog", true);
		eventLog = new BulldogLog("eventLog", true);
		commandLog = new BulldogLog("commandLog", true);
		
		logs.add(periodicLog);
		logs.add(eventLog);
		logs.add(commandLog);
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

	// if the directory does not exist, this code will not create it
	// home/lvuser/logs does not exist by default

	// This stores Data about the day and persists between runs
	// public void getDataFile()
	// {
	// try
	// {
	//
	// }
	// catch (Exception e)
	// {
	//
	// e.printStackTrace();
	// }
	//
	// File folderUSB = new File(""); // USB
	// File folderRIO = new File("");// RIO
	//
	// // put a singleton style file creator here. 1 per directory (directory
	// // per day needs to work first);
	//
	// // check if directory of the day exists.
	// // if it does not then create a new data file inside the date directory.
	// // fill the data with defaults to be read
	//
	// // if the directory exists then check for file
	// // if file doesnt exist then create defaults
	// // if file does exist then read all the defaults and load the variables
	//
	// // Lets use a .JSON file for this because it's easier
	//
	// JSONParser parser = null;
	// JSONObject jsonObject = null;
	//
	// try
	// {
	// // FindFolder + date.json
	// parser = new JSONParser();
	// jsonObject = (JSONObject) parser.parse(new FileReader(FLASH_DIR +
	// getDate() + ".json"));
	// }
	// catch (Exception e)
	// {
	// try
	// {
	// parser = new JSONParser();
	// jsonObject = (JSONObject) parser.parse(new FileReader(RIO_DIR + getDate()
	// + ".json"));
	// }
	// catch (Exception ee)
	// {
	// ee.printStackTrace();
	// }
	// }
	//
	// try
	// {
	// System.out.println(jsonObject);
	//
	// String name = (String) jsonObject.get("name");
	// System.out.println(name);
	//
	// long age = (Long) jsonObject.get("age");
	// System.out.println(age);
	//
	// // loop array
	// // JSONArray msg = (JSONArray) jsonObject.get("messages");
	// // Iterator<String> iterator = msg.iterator();
	// while (iterator.hasNext())
	// {
	// System.out.println(iterator.next());
	// }
	// }
	// catch (Exception e)
	// {
	// e.printStackTrace();
	// }
	// }

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

/*
 * try { periodicStream.println(logMsg); if (periodicStream.checkError()) { System.out.println(
 * "flash drive removed, detected ===========================================================================" ); System.out.println("done making new file on rio FIRST ONE"); } } catch (Exception e) {
 * System.out.println("error in wtf"); e.printStackTrace(); System.out.println("done making new file on rio SECOND ONE"); }
 */