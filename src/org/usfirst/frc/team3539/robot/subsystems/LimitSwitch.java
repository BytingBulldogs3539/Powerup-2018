package org.usfirst.frc.team3539.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LimitSwitch extends Subsystem {

	private DigitalInput limitSwitch; 
	
	public LimitSwitch()
	{
		limitSwitch = new DigitalInput(1);
	}

    public void initDefaultCommand() {
    }
    
    public void switcher()
    {
    	if(limitSwitch.get())
    	{
    		System.out.println("True");
    	}
    	else
    	{
    		System.out.println("False");
    	}
    }
}

