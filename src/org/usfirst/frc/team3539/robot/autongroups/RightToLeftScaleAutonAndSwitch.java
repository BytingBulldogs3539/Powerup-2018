package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonMotionProfileEx;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.commands.TeleopElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;
import org.usfirst.frc.team3539.robot.profiles.LeftScaleTurnReverse;
import org.usfirst.frc.team3539.robot.profiles.RightSwitchReverse;
import org.usfirst.frc.team3539.robot.profiles.RightToLeftScale;
import org.usfirst.frc.team3539.robot.profiles.RightToLeftSwitch;
import org.usfirst.frc.team3539.robot.profiles.ScaleReverse;
import org.usfirst.frc.team3539.robot.profiles.Straight533;
import org.usfirst.frc.team3539.robot.profiles.StraightCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToLeftScaleAutonAndSwitch extends CommandGroup
{

	public RightToLeftScaleAutonAndSwitch()
	{

		addParallel(new AutonElevatorArm(70, 40,4.3,0));
		addSequential(new AutonMotionProfileEx(RightToLeftScale.PointsR,RightToLeftScale.PointsL,RightToLeftScale.kNumPoints));
		addSequential(new AutonWaitCommand(.5));
		addSequential(new AutonIntakeCommand(-1,1));
		
		//turn and go to second cube 
		addSequential(new AutonMotionProfileEx(LeftScaleTurnReverse.PointsR, LeftScaleTurnReverse.PointsL, LeftScaleTurnReverse.kNumPoints));
		addSequential(new AutonElevatorArm(0,100,0,0));
		addSequential(new AutonMotionProfileEx(StraightCube.PointsR,StraightCube.PointsL,StraightCube.kNumPoints));
		

		if (Robot.gameData.charAt(0) == 'L')
		{
			addParallel(new AutonIntakeCommand(.5, 1));
			addSequential(new IntakeSolenoidCommand());
			addSequential(new AutonWaitCommand(.5));

			// puts cube in switch

			addSequential(new TeleopElevatorPositionCommand(30));
			addSequential(new AutonMotionProfileEx(Straight533.PointsR, Straight533.PointsL, Straight533.kNumPoints));
			addSequential(new AutonIntakeCommand(-1, 1));

		}


		
		

	}
}
