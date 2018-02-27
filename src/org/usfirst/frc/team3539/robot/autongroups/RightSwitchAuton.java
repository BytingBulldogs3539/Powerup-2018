package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.rightSwitch;
import org.usfirst.frc.team3539.robot.profiles.testmotion;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightSwitchAuton extends CommandGroup
{
	public RightSwitchAuton()
	{
		addSequential(new AutonMotionProfileCommand(rightSwitch.PointsL, rightSwitch.PointsR, rightSwitch.kNumPoints));
		//addParallel(new ElevatorPositionCommand(25));
	//	addParallel(new PitchCommand(90));
		// depending how we want to drop cube
//		addSequential(new AutonWaitCommand(2));
//		addSequential(new AutonIntakeCommand(1, 5)); 
//		addParallel(new IntakeSolenoidCommand());

	}
}
