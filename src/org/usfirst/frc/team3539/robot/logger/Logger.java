package org.usfirst.frc.team3539.robot.logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Logger {

	private float  counter = 0;
	
	public boolean debug = true;
	public static final double WRITE_TIME = .1;
	public static final long READ_TIME_MS = 10;
	
	private List<Reader> readers = new ArrayList<Reader>();
	
	private static Logger inst = null;
	private File logFile = null;
	
	private Timer logTimer = null;
	
	public BufferedWriter writer = null;
	private ArrayBlockingQueue<String> messages = new ArrayBlockingQueue<String>(3000);
	
	public volatile static boolean finished = false;

	private Thread writeThread;
	private Thread readThread;
	
	//Singleton for logger instance
	public static Logger getInstance()
	{
		if (inst == null)
		{
			inst = new Logger();
		}
			return inst;	
	}

	//Constructor
	public Logger()
	{
		File lastfile = this.getLastLogFile();

		int number =0;
		if(lastfile != null)
		{
			String name = lastfile.getName();
			number = Integer.parseInt(name.substring(0,name.lastIndexOf('.')));
		}
		
		logFile = new File(getLogDirectory(), String.format("%04d.log",number+1));

		try{
			FileOutputStream out = new FileOutputStream(logFile);
			OutputStreamWriter stream = new OutputStreamWriter(out);
			writer = new BufferedWriter(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//File write task to thread
	Runnable writeTask = new  Runnable() {
		public void run()
		{
			double lasttime = System.currentTimeMillis();
			while(!finished)
			{
				try{
					String msg = messages.take();
					writer.write(msg);
					writer.newLine();
					if (System.currentTimeMillis() >= lasttime + WRITE_TIME)
					{
						writer.flush();
						lasttime = System.currentTimeMillis();
					}
				} catch (InterruptedException | IOException e) {
					e.printStackTrace();
				}
			}

		}
	};

	//Object variable read task
	TimerTask readTask = new TimerTask()
			{
				public void run()
				{
					List<String> elements = new ArrayList<String>();
 
					elements.add(Float.toString(System.currentTimeMillis() - counter));
					for (Reader r : readers)
					{
						elements.add(r.read());
					}

					try {
							messages.put(String.join(",", elements));
							if (debug)
								System.out.println(String.join(",", elements));
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			};
	
	//Start the logger but starting the read and write threads.
	public void start()
	{
		if (writer != null)
		{
			List<String> elements = new ArrayList<String>();
			elements.add("time (ms)");
			for (Reader r : readers)
			{
				elements.add(r.header());

			}
			try {
				messages.put(String.join(",", elements));
				if (debug)
					System.out.println(String.join(",", elements));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			logTimer = new Timer("logger");
			logTimer.schedule(readTask, 0L, READ_TIME_MS);

			writeThread = new Thread(writeTask);
			writeThread.setName("writeTask");
			writeThread.setPriority(Thread.MIN_PRIORITY);
			counter = System.currentTimeMillis();
			writeThread.start();
		} else 
		{
			System.out.println("[logger] No writer enabled...");
		}
	}

	//stops the writer and reader thread. Writer must be stopped first or the thread will lock.
	public void stop()
	{
		this.finished = true;
		try {
			Thread.sleep((long) (this.READ_TIME_MS + 100));
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		logTimer.cancel();
	}
	
	//adds the reader object that interrogates the desired class object
	public void add(Reader o)
	{
		if (writeThread == null)
			readers.add(o);
	}
	
	//Find the UNIX mount point or defaults to "C:/test"
	public static File determineMountPoint()
	{
        char iter = 'z';
        for (int i = 0; i < 16; i++) {
            File f = new File("/" + iter);
            if (f.exists() && f.isDirectory()) {
                return f;
            }
            iter--;
        }
        //return new File("C:\\test");
        return new File("/home/lvuser/logs");
	}
	
	//Gets or creats the logging directory ".../log"
	public static File getLogDirectory()
	{
		File base = determineMountPoint();
		if (base == null)
			return base;
		
		File logDir = new File(base,"logs");
		if (!logDir.exists())
			logDir.mkdirs();
		return logDir;
	}
	
	//Get a collection of files that match the name format of our log file.
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
	
	//find the last log file by index number
	public static File getLastLogFile()
	{
		List<String> filenames = getAllLogFiles().stream().map(File::getName).collect(Collectors.toList());
		filenames.sort(null);
		if(filenames.isEmpty())
			return null;
		
		String lastfile = filenames.get(filenames.size()-1);
		return new File(getLogDirectory(), lastfile);	
	}
}
