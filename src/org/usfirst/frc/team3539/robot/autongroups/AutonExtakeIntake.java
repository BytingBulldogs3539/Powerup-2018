package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonPitchCommand;
import org.usfirst.frc.team3539.robot.autoncommands.AutonWaitCommand;
import org.usfirst.frc.team3539.robot.instantcommands.ElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.instantcommands.IntakeSolenoidCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonExtakeIntake extends CommandGroup {

    public AutonExtakeIntake(double T1) {
		addSequential(new AutonIntakeCommand(.4,T1));
		//addSequential(new AutonIntakeCommand(-1,1));
		addSequential(new IntakeSolenoidCommand());



    }
}
