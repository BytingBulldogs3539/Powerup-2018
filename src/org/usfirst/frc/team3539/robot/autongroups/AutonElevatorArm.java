package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonElevatorArm extends CommandGroup {

    public AutonElevatorArm(double elevatorPos,int pitchPos ) {
    	addSequential( new ElevatorPositionCommand(elevatorPos));
		addSequential( new AutonPitchCommand(pitchPos));

    }
}
