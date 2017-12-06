package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.bytewrapper.ByteCommand;

public class IntakeCommand extends ByteCommand
{
	private double motorPower;
	
	public IntakeCommand(double motorPower)
	{
		super("IntakeCommand");
		requires(Robot.intake);
		this.motorPower = motorPower;
	}

	@Override
	protected void bInit()
	{
		Robot.intake.setMotorPower(motorPower);
	}

	@Override
	protected void bExecute()
	{
	}

	@Override
	protected boolean bIsFinished()
	{
		return false;
	}

	@Override
	protected void bEnd()
	{
		
	}

	@Override
	protected void bInterrupted()
	{
	}
}
