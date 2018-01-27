//package org.usfirst.frc.team3539.robot.commands;
//
//import org.usfirst.frc.team3539.robot.Robot;
//
//import edu.wpi.first.wpilibj.command.Command;
//
///**
// *
// */
//public class ElevatorCommand extends Command
//{
//	double power;
//	
//	public ElevatorCommand(double power)
//	{
//		requires(Robot.elevator);
//		this.power = power;
//	}
//
//	protected void initialize()
//	{
//		Robot.elevator.setMotorPower(power);
//	}
//
//	protected void execute()
//	{
//	}
//
//	protected boolean isFinished()
//	{
//		return false;
//	}
//
//	//protected void end()
//	//{
//	//	Robot.elevator.setMotorPower(0);
//	//}
//
//	protected void interrupted()
//	{
//		end();
//	}
//}
