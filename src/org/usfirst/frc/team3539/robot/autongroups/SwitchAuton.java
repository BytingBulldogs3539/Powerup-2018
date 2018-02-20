package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonDriveCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileCommand;
import org.usfirst.frc.team3539.robot.commands.PitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.profiles.test;


import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchAuton extends CommandGroup
{
	public SwitchAuton()
	{

addSequential(new AutonMotionProfileCommand(test.PointsL,test.PointsR,test.kNumPoints));
addParallel(new ElevatorPositionCommand(50));
addParallel(new PitchCommand(90));

addSequential(new AutonIntakeCommand(-1,1));

	}
}
