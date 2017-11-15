package org.usfirst.frc.team3539.robot.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BulldogConfig 
{
	String savePlace;
	JSONObject cfg = new JSONObject();
	JSONParser parser = new JSONParser();
	Object read;
	enum saveLocation
	{
		RIO,USB
	}
	public BulldogConfig(saveLocation location)
	{
		if (location == saveLocation.RIO)
		{
			savePlace = "/home/lvuser/config/";
		}
		if (location == saveLocation.USB)
		{
			savePlace= "/u/";
		}
		try 
		{
			this.read = parser.parse(new FileReader(savePlace));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
	}
	public void updateInt(String name, int number)
	{
		cfg.put(name,number);
		write();
	}
	public void updateString(String name, String text)
	{
		cfg.put(name,text);
		write();
	}
	public void updateInt(String name, boolean torf)
	{
		cfg.put(name,torf);
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
