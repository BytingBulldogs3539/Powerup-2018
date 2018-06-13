package org.usfirst.frc.team3539.robot.logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reader
{

	private Object o;
	private List<String> fields = new ArrayList<String>();
	private List<LogMethod> methods = new ArrayList<LogMethod>();

	private int level = 3;
	private boolean readPrivate = false;

	public Reader(Object o, int level, boolean readPrivate)
	{
		this.o = o;
		this.level = level;
		this.readPrivate = readPrivate;

		this.Update();
	}

	public int setLevel(int level)
	{
		this.level = level;
		this.Update();
		return this.level;
	}

	public boolean setReadPrivate(boolean readPrivate)
	{
		this.readPrivate = readPrivate;
		this.Update();
		return this.readPrivate;
	}

	public void addMethod(String className, String name, Object... pram)
	{
		for (Method m : getMethods())
		{
			System.out.println(m.getName() + ":" + m.getParameterTypes().length + ":" + name);
			if (m.getParameterTypes().length < 4 && name == m.getName())
			{
				this.methods.add(new LogMethod(className+"."+m.getName(),m,pram));
			}
		}
	}

	public void Update()
	{
		for (Field f : getFields())
		{
			if (f.isAnnotationPresent(Log.class))
			{
				Log anno = f.getAnnotation(Log.class);
				if (anno.level() <= this.level)
				{
					int access = f.getModifiers();
					if (access == 1)
					{
						fields.add(f.getName());
					} else if (access == 2 && this.readPrivate)
					{
						f.setAccessible(true);
						fields.add(f.getName());
					}
				}
			}
		}
	}

	public String header()
	{
		List<String> values = new ArrayList<String>();

		for (String str : fields)
		{
			String name = "";
			Field f = getField(str);
			try
			{
				Method m = o.getClass().getMethod("getName");
				if (m != null)
					name = m.invoke(o, null).toString() + "." + f.getName();
				else
					name = o.getClass().getName() + "--." + f.getName();
			} catch (Exception e)
			{
				name = f.toGenericString();
			}
			values.add(name);

		}
		for (LogMethod lm : methods)
		{
			values.add(lm.name + "()");
		}
		return String.join(",", values);
	}

	public String read()
	{
		List<String> values = new ArrayList<String>();

		for (String str : fields)
		{
			Field f = getField(str);
			try
			{
				values.add(f.get(o).toString());
			} catch (IllegalArgumentException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (LogMethod lm : methods)
		{
			values.add(lm.invoke(o));
		}

		return String.join(",", values);
	}

	private Field[] getFields()
	{
		return o.getClass().getFields();
	}

	private Method[] getMethods()
	{
		return o.getClass().getMethods();
	}

	private Field getField(String name)
	{
		try
		{
			return o.getClass().getField(name);
		} catch (NoSuchFieldException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
