package org.usfirst.frc.team3539.robot.commands;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class BeamSensorCommand extends Command 
{

    public BeamSensorCommand() 
    {
    	requires(Robot.lightBeam);	
    }

    protected void initialize() 
    {
    	System.out.println(Robot.lightBeam.getBeam());
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
