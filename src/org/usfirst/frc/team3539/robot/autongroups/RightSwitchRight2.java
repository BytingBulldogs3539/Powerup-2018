package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchForwardCube;
import org.usfirst.frc.team3539.robot.profiles.LeftSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.RightForwardCube;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.SwitchLeft2;
import org.usfirst.frc.team3539.robot.profiles.switchRight2;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchRight2 extends CommandGroup
{

	public RightSwitchRight2()
	{
		addSequential( new AutonElevatorArm(30,90));
		addParallel(new AutonExtakeIntake(3.2));
		addSequential(new AutonMotionProfileEx(switchRight2.PointsR,switchRight2.PointsL,switchRight2.kNumPoints));
		
		
		addSequential(new AutonMotionProfileEx(RightSwitchReverse.PointsR,RightSwitchReverse.PointsL,RightSwitchReverse.kNumPoints));
//second cube
		//		addSequential(new AutonElevatorArm(0,90));
//		addSequential(new AutonMotionProfileEx(RightForwardCube.PointsR,RightForwardCube.PointsL,RightForwardCube.kNumPoints));
//		addParallel(new AutonWaitElevator(30,.5));
//		addParallel(new AutonIntakeCommand(1,3));
//		addSequential(new IntakeSolenoidCommand());
//		
		
		
		
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
