package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.subsystems.Solenoids;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class IntakeSolenoidCommand extends Command
{
	private boolean Forward = false;

	public IntakeSolenoidCommand(boolean Position)
	{
		Forward = Position;
	}

	protected void initialize()
	{
		if (Forward)
			Robot.solenoid.intakeSol(DoubleSolenoid.Value.kForward);
		else
		{
			Robot.solenoid.intakeSol(DoubleSolenoid.Value.kReverse);
		}
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return true;
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
		end();
	}
}
