package org.usfirst.frc.team3539.robot.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.profiles.MotionProfile;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Notifier;



public class BulldogMotionProfile
{
	private String name;
	private TalonSRX talon;
	private MotionProfileStatus status = new MotionProfileStatus();
	private SetValueMotionProfile setValue = SetValueMotionProfile.Disable;
	private boolean isFinished = false;
	double heading;
	double pos;
	double vel;

	private Notifier process = new Notifier(new PeriodicRunnable());


	public BulldogMotionProfile(TalonSRX talon, String name)
	{
	
		this.talon = talon;
		this.name = name;
		talon.changeMotionControlFramePeriod(5);
		process.startPeriodic(0.005);

	}


	class PeriodicRunnable implements java.lang.Runnable
	{
		public void run()// add to drive train last
		{
			talon.processMotionProfileBuffer();
		}
	}
	public void Read(String file)
	{
		//check for file
		
	}
	public MotionProfile readFile(String filename)
	{
		MotionProfile profile = new MotionProfile();
//		BufferedReader br;
//		    List<double[]> left = new ArrayList<double[]>();
//		    List<double[]> right = new ArrayList<double[]>();
//
//		    try {
//			br = new BufferedReader(new FileReader(filename));
//		    String line = br.readLine();
//
//  
//		    while (line != null) {
//		    	String[] out = line.split(",");
//		    	double[] leftA = {Double.parseDouble(out[0]),Double.parseDouble(out[1]),Double.parseDouble(out[4])};
//		    	double[] rightA = {Double.parseDouble(out[2]),Double.parseDouble(out[3]),Double.parseDouble(out[4])};
//		    	left.add(leftA);
//		    	right.add(right);
//		    	
//		        line = br.readLine();
//		    }
//
//		} finally {
//		    br.close();
//		}
//		
//		profile.kNumPoints = left.size();
//		profile.leftPoints = (double[][]) left.toArray();
//		profile.rightPoints = (double[][]) right.toArray();
//		
		return profile;
	}
	public void configure()// probably want new name
	{
		isFinished = false;
		talon.clearMotionProfileTrajectories();
		setValue = SetValueMotionProfile.Disable;

		

		talon.setSelectedSensorPosition(0, 0, 10);
	//	talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		// talon.setSensorPhase(true);
		talon.configNeutralDeadband(RobotMap.kNeutralDeadband, RobotMap.kTimeoutMs);
		talon.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
		/*
		 * status 10 provides the trajectory target for motion profile AND motion magic
		 */
		talon.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.kTimeoutMs);
	}

	public void startFilling(double[][] profile, int totalCnt)
	{
		TrajectoryPoint point = new TrajectoryPoint();

		if (status.hasUnderrun)
		{
			Instrumentation.OnUnderrun();
			talon.clearMotionProfileHasUnderrun(0);
		}

		talon.clearMotionProfileTrajectories();// make sure nothing is interrupted

		talon.configMotionProfileTrajectoryPeriod(RobotMap.kBaseTrajPeriodMs, RobotMap.kTimeoutMs);

		for (int i = 0; i < totalCnt; ++i)
		{
			double positionRot = profile[i][0];
			double velocityRPM = profile[i][1];
			point.position = (positionRot) * 4096; // Prac 478mm Tina 318mm
			point.velocity = (velocityRPM )*4096/600;// * 52.2894);// * (4096.0/4700.0)));
			point.headingDeg = 0;
			point.profileSlotSelect0 = 0; // there are multiple pid slots now
			point.profileSlotSelect1 = 0;
			point.timeDur = GetTrajectoryDuration((int) profile[i][2]);
			point.zeroPos = false;
			if (i == 0)
				point.zeroPos = true;

			if ((i + 1) == totalCnt)
				point.isLastPoint = true; /* set this to true on the last point */

			talon.pushMotionProfileTrajectory(point);
		}
	}

	public void set()
	{
		talon.getMotionProfileStatus(status);

		//System.out.println("statusCnt" + status.btmBufferCnt);

		if (status.btmBufferCnt > 10)
		{
			//System.out.println("print btm buffercn is true");
			setValue = SetValueMotionProfile.Enable;
			
		}

		talon.set(ControlMode.MotionProfile, setValue.value);
		talon.getMotionProfileStatus(status);
		 heading = talon.getActiveTrajectoryHeading();
		pos = talon.getActiveTrajectoryPosition();
		vel = talon.getActiveTrajectoryVelocity();

		/* printfs and/or logging */
		Instrumentation.process(status, pos, vel, heading,isFinished);
//
//		System.out.println("tragectory position" + talon.getActiveTrajectoryPosition());
//		System.out.println("EncPos" + talon.getSelectedSensorPosition(0));
//		System.out.println("tragectory Velocity" + talon.getActiveTrajectoryVelocity());
//		System.out.println("EncVel" + talon.getSelectedSensorVelocity(0));

		if (status.isLast && status.activePointValid)
		{
			System.out.println(name + "Finished");

			process.stop();
			isFinished = true;
			setValue = SetValueMotionProfile.Hold;
			talon.set(ControlMode.MotionProfile, setValue.value);
		}
	}
	
	
	public double tragectoryVelocity()
	{
		return talon.getActiveTrajectoryVelocity();
		
	}
	public double tragectoryPosition()
	{
		return talon.getActiveTrajectoryPosition();
		
	}
	public boolean isFinished()
	{
		return isFinished;
	}

//	public void resetProfile()
//	{
//		isFinished = false;
//		setValue = SetValueMotionProfile.Disable;
//
//		talon.clearMotionProfileTrajectories();
//		talon.setSelectedSensorPosition(0, 0, 10);
//	}

	private TrajectoryDuration GetTrajectoryDuration(int durationMs)
	{
		TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_10ms;
		retval = retval.valueOf(durationMs);

		return retval;
	}
}
