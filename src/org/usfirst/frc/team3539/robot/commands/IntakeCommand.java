package org.usfirst.frc.team3539.robot.commands;

import java.awt.Robot;

import org.usfirst.frc.team3539.robot.OI;
import org.usfirst.frc.team3539.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeCommand extends Command

{

	public IntakeCommand()
	{
		requires(org.usfirst.frc.team3539.robot.Robot.intake);
	}

	protected void initialize()
	{
	}

	protected void execute()
	{
		if (org.usfirst.frc.team3539.robot.Robot.oi.twoA.get())
			org.usfirst.frc.team3539.robot.Robot.intake.setMotorPower(5);// Go full speed in on both motors

		if (org.usfirst.frc.team3539.robot.Robot.oi.twoB.get())
			org.usfirst.frc.team3539.robot.Robot.intake.setMotorPower(-5);// Go full speed out

		if (org.usfirst.frc.team3539.robot.Robot.oi.twoX.get())
			org.usfirst.frc.team3539.robot.Robot.intake.setMotorPower(2.5);// Go half speed in

		if (org.usfirst.frc.team3539.robot.Robot.oi.twoY.get())
			org.usfirst.frc.team3539.robot.Robot.intake.setMotorPower(-2.5);// Go half speed out

	}

	protected boolean isFinished()
	{
		if (!org.usfirst.frc.team3539.robot.Robot.oi.twoA.get() && !org.usfirst.frc.team3539.robot.Robot.oi.twoB.get() && !org.usfirst.frc.team3539.robot.Robot.oi.twoX.get()&&!org.usfirst.frc.team3539.robot.Robot.oi.twoY.get())
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	protected void end()
	{
		org.usfirst.frc.team3539.robot.Robot.intake.setMotorPower(0);
	}

	protected void interrupted()
	{
	}
}
