package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeCommand extends Command
{
	//double power;

	public IntakeCommand()//double power)
	{
		requires(Robot.intake);
	//	this.power = power;
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		double x =-Robot.oi.two.getLeftTrigger()+Robot.oi.two.getRightTrigger();
		//System.out.println("execute");
		Robot.intake.setMotorPower(Math.copySign(Math.sqrt(Math.abs(x)), x));
		//System.out.println("power"+Math.copySign(Math.sqrt(Math.abs(x)), x));
	//	System.out.println(x);
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.intake.setMotorPower(0);
	}

	protected void interrupted()
	{
		end();
	}
}
