//package org.usfirst.frc.team3539.robot.instantcommands;
//
//import org.usfirst.frc.team3539.robot.Robot;
//
//import edu.wpi.first.wpilibj.command.Command;
//
//public class PitchManualCommand extends Command
//{
//	public PitchManualCommand()
//	{
//		requires(Robot.pitch);
//	}
//
//	protected void initialize()
//	{
//		
//	}
//	
//	protected void execute()
//	{
//		Robot.pitch.rotate(Robot.oi.two.getRightStickY()/2.0);
//		System.out.println("arm move pos " + Robot.pitch.getEncoder());
//	}
//
//	@Override
//	protected boolean isFinished()
//	{
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//	protected void end()
//	{
//		Robot.pitch.rotate(0);
//	}
//}
