package org.usfirst.frc.team3539.robot.logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LogMethod
{
	public String name;
	private Method m;
	private Object[] o;
	
	public LogMethod(String name, Method m, Object[] o)
	{
		this.name = name;
		this.m = m;
		this.o = o;
	}
	public String invoke(Object o)
	{
		try
		{
			return m.invoke(o, this.o).toString();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
