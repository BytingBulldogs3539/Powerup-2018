package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.profiles.MidSwitchRightPoints;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidSwitchRight extends CommandGroup
{

	public MidSwitchRight()
	{
		addParallel( new AutonElevatorArm(30,90));
		addParallel(new AutonExtakeIntake(2.5));
		addSequential(new AutonMotionProfileEx(MidSwitchRightPoints.PointsR,MidSwitchRightPoints.PointsL,MidSwitchRightPoints.kNumPoints));
		addSequential(new AutonIntakeCommand(-.7, 1));
	}
}
