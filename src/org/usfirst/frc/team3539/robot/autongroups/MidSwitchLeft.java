package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitch;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchLeft extends CommandGroup
{

	public MidSwitchLeft()
	{
	//	addParallel( new AutonElevatorArm(30,90));
		//addParallel(new AutonExtakeIntake(2.2));
		addSequential(new AutonMotionProfileEx(LeftSwitch.PointsR,LeftSwitch.PointsL,LeftSwitch.kNumPoints));
	//	addSequential(new AutonIntakeCommand(-.7, 1));
	}
}
