package org.usfirst.frc.team3539.robot.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Logger
{

	private long counter = 0;

	public boolean debug = false;
	public static final double WRITE_TIME = 100;
	public static final long READ_TIME_MS = 20;
	

	private List<Reader> Readers = new ArrayList<Reader>();

	private static Logger inst = null;
	private File logFile = null;

	private Timer logTimer = null;
	private TimerTask readTask;
	private double lastTime;

	public BufferedWriter writer = null;
	private ArrayBlockingQueue<String> messages = new ArrayBlockingQueue<String>(3000);

	public volatile static boolean finished = false;

	private Thread writeThread;
	private Thread readThread;

	// Singleton for Logger instance
	public static Logger getInstance()
	{
		if (inst == null)
		{
			inst = new Logger();
		}
		return inst;
	}

	// Constructor
	public Logger()
	{
		readTask=this.getTTask();
	}

	// File write task to thread
	Runnable writeTask = new Runnable()
	{
		public void run()
		{
			double lasttime = System.currentTimeMillis();
			while (!finished)
			{
				try
				{
					String msg = messages.take();
					writer.write(msg);
					writer.newLine();
					if (System.currentTimeMillis() >= lasttime + WRITE_TIME)
					{
						writer.flush();
						lasttime = System.currentTimeMillis();
					}
				} catch (InterruptedException | IOException e)
				{
					e.printStackTrace();
				}
			}

		}
	};

	// Object variable read task
	public TimerTask getTTask()
	{
		TimerTask readTask = new TimerTask()
		{
			public void run()
			{
				List<String> elements = new ArrayList<String>();

				double time = (System.currentTimeMillis() - counter) / 1000.0;
				elements.add(Double.toString(time));
				for (Reader r : Readers)
				{
					elements.add(r.read());
				}
				TimerTask readTask = new TimerTask()
				{
					public void run()
					{
						List<String> elements = new ArrayList<String>();

						double time = (System.currentTimeMillis() - counter) / 1000.0;
						elements.add(Double.toString(time));
						for (Reader r : Readers)
						{
							elements.add(r.read());
						}

						try
						{
							messages.put(String.join(",", elements));
							if (debug)
								System.out.println(String.join(",", elements));

						} catch (InterruptedException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				try
				{
					messages.put(String.join(",", elements));
					if (debug)
						System.out.println(String.join(",", elements));

				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		return readTask;
	}

	// Start the Logger but starting the read and write threads.
	public void start()
	{
		try
		{
			if (writer != null)
			{
				writer.close();
			}
		} catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File lastfile = this.getLastLogFile();
		int number = 0;
		if (lastfile != null)
		{
			String name = lastfile.getName();
			number = Integer.parseInt(name.substring(0, name.lastIndexOf('.')));
		}
		logFile = new File(getLogDirectory(), String.format("%04d.log", number + 1));
		try
		{
			FileOutputStream out = new FileOutputStream(logFile);
			OutputStreamWriter stream = new OutputStreamWriter(out);
			writer = new BufferedWriter(stream);

		} catch (IOException e)
		{
			System.out.println("Error creating file");
			e.printStackTrace();
		}

		Logger.finished = false;
		if (writer != null)
		{
			List<String> elements = new ArrayList<String>();
			elements.add("time (sec)");
			for (Reader r : Readers)
			{
				elements.add(r.header());

			}
			try
			{
				messages.put(String.join(",", elements));
				if (debug)
					System.out.println(String.join(",", elements));
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			readTask=this.getTTask();

			logTimer = new Timer("LOGGER");
			logTimer.schedule(readTask, 0L, READ_TIME_MS);

			if (writeThread != null)
			{
				writeThread.stop();
			}
			writeThread = new Thread(writeTask);
			writeThread.setName("writeTask");
			writeThread.setPriority(Thread.MIN_PRIORITY);
			counter = System.currentTimeMillis();
			writeThread.start();
		} else
		{
			System.out.println("[Logger] No writer enabled...");
		}
	}

	// stops the writer and Reader thread. Writer must be stopped first or the
	// thread will lock.
	public void stop()
	{
		this.finished = true;
		if (logTimer != null)
		{
			logTimer.cancel();
			logTimer.purge();
			readTask=null;
		}
		// logTimer.();
	}

	// adds the Reader object that interrogates the desired class object
	public void add(Reader o)
	{
		if (writeThread == null)
			Readers.add(o);
	}

	// Find the UNIX mount point or defaults to "C:/test"
	public static File determineMountPoint()
	{
		char iter = 'z';
		for (int i = 0; i < 16; i++)
		{
			File f = new File("/" + iter);
			if (f.exists() && f.isDirectory())
			{
				return f;
			}
			iter--;
		}
		// return new File("C:\\test");
		return new File("/home/lvuser");
	}

	// Gets or creats the logging directory ".../log"
	public static File getLogDirectory()
	{
		File base = determineMountPoint();
		if (base == null)
			return base;

		File logDir = new File(base, "logs");
		if (!logDir.exists())
			logDir.mkdirs();
		return logDir;
	}

	// Get a collection of files that match the name format of our log file.
	public static Collection<File> getAllLogFiles()
	{
		FilenameFilter filter = new FilenameFilter()
		{
			@Override
			public boolean accept(File dir, String name)
			{
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

	// find the last log file by index number
	public static File getLastLogFile()
	{
		List<String> filenames = getAllLogFiles().stream().map(File::getName).collect(Collectors.toList());
		filenames.sort(null);
		if (filenames.isEmpty())
			return null;

		String lastfile = filenames.get(filenames.size() - 1);
		return new File(getLogDirectory(), lastfile);
	}
}
