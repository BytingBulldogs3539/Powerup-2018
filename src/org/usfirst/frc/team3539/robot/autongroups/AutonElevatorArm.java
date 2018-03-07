package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonElevatorArm extends CommandGroup {

    public AutonElevatorArm() {
    	addSequential( new ElevatorPositionCommand(30));
		addSequential( new AutonPitchCommand(90));

    }
}
