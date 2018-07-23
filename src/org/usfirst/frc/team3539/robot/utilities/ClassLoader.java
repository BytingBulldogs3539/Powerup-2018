package org.usfirst.frc.team3539.robot.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoader
{
	private Class<?> classfile;
	public ClassLoader(String className)
	{
		URL[] classLoaderUrls;
		try
		{
			classLoaderUrls = new URL[] { new URL("file:///home/lvuser/profiles/test.jar") };
			URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);
			classfile = urlClassLoader.loadClass(className);

		}
		catch (MalformedURLException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Create a new URLClassLoader
	}
	public double[][] getRightPoints()
	{
		try
		{
			return (double[][]) classfile.getField("PointsR").get(null);
		}
		catch (IllegalArgumentException |IllegalAccessException |NoSuchFieldException|SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public double[][] getLeftPoints()
	{
		try
		{
			return (double[][]) classfile.getField("PointsL").get(null);
		}
		catch (IllegalArgumentException |IllegalAccessException |NoSuchFieldException|SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public int getkNumPoints()
	{
		try
		{
			return classfile.getField("kNumPoints").getInt(null);
		}
		catch (IllegalArgumentException |IllegalAccessException |NoSuchFieldException|SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Integer) null;
	}
	
}
