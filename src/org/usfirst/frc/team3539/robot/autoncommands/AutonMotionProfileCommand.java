package org.usfirst.frc.team3539.robot.autoncommands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.utilities.MotionProfile;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonMotionProfileCommand extends Command
{
	private double[][] ProfileR;
	private double[][] ProfileL;
	private int totalPointNum;
	public MotionProfile m;
	public AutonMotionProfileCommand(double[][] ProfileR, double[][] ProfileL, int totalPointNum)
	{
		 m = new MotionProfile(Robot.driveTrain.rf,Robot.driveTrain.lf,ProfileR,totalPointNum,ProfileL);
	}

	protected void initialize()
	{		//m.reset();
		m.Tragectory();
		System.out.println("initialize=====================");
		m.statusFrame();

		m.setMotion();
	//	m.startFilling(ProfileR,totalPointNum,ProfileL);


	}

	protected void execute()
	
	{
		m.Tragectory();
		System.out.println("Execute=====================");

		m.control();
		m.startMotionProfile();
		
		// System.out.println("printing in execute");
		Robot.driveTrain.updateEncoders();
		//Robot.driveTrain.setMotionProfile();
	}

	protected boolean isFinished()
	{
		System.out.println(m.isFinished());
		return m.isFinished();
	}

	protected void end()
	{
		m.reset();
	}

	protected void interrupted()
	{
		end();
	}
}
