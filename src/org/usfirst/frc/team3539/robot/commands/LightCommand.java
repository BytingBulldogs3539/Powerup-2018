package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LightCommand extends Command 
{

    public LightCommand() 
    {
    	requires(Robot.light);	
    }

    protected void initialize() 
    {
    	System.out.println(Robot.light.getBeam());
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
