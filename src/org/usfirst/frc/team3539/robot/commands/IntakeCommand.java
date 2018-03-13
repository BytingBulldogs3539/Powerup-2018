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
		//System.out.println("execute");
		Robot.intake.setMotorPower((-Robot.oi.two.getLeftTrigger()+Robot.oi.two.getRightTrigger()));

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
