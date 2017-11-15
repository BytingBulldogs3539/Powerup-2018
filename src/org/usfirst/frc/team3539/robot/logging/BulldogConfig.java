package org.usfirst.frc.team3539.robot.logging;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.usfirst.frc.team3539.robot.RobotMap;

/**
 * TODO: Add proper desc.
 * 
 * @author FRC-3539
 *
 * @since 11/13/17
 */

// TODO: Review for integration with logging and Dash
// TODO: Fix suppressed Warnings

public class BulldogConfig
{
	JSONObject cfg = new JSONObject();
	JSONParser parser = new JSONParser();
	Object read;

	public BulldogConfig()
	{
		try
		{
			this.read = parser.parse(new FileReader(RobotMap.FLASH_DIR));
			System.out.println("==========================================================");
			System.out.println(" FILE IS ON THE USB STICK");
			System.out.println("==========================================================");
		}
		catch (Exception e)
		{
			try
			{
				this.read = parser.parse(new FileReader(RobotMap.RIO_DIR));
				System.out.println("==========================================================");
				System.out.println(" FILE IS ON THE ROBORIO");
				System.out.println("==========================================================");

			}
			catch (Exception ee)
			{
				System.out.println("WARNING!!! YOU SHOULD NEVER SEE THIS EVER: JSON ERROR!");
				e.printStackTrace();
				ee.printStackTrace();
			}
		}

	}

	@SuppressWarnings("unchecked")
	public void updateInt(String name, int number)
	{
		cfg.put(name, number);
		write();
	}

	@SuppressWarnings("unchecked")
	public void updateString(String name, String text)
	{
		cfg.put(name, text);
		write();
	}

	@SuppressWarnings("unchecked")
	public void updateInt(String name, boolean torf)
	{
		cfg.put(name, torf);
		write();
	}

	public int getIntValue(String name)
	{
		return (Integer) cfg.get(name);
	}

	public String getStringValue(String name)
	{
		return (String) cfg.get(name);
	}

	public boolean name(String name)
	{
		return (Boolean) cfg.get(name);
	}

	public void write()
	{
		try (FileWriter file = new FileWriter("savePlace"))
		{
			file.write(cfg.toJSONString());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
