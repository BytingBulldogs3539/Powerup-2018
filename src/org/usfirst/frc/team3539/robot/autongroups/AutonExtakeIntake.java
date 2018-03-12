package org.usfirst.frc.team3539.robot.autongroups;

import org.usfirst.frc.team3539.robot.autoncommands.AutonIntakeCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonExtakeIntake extends CommandGroup
{

<<<<<<< HEAD
    public AutonExtakeIntake(double T1) {
		addSequential(new AutonIntakeCommand(.3,T1));
		//addSequential(new AutonIntakeCommand(-1,1));
	//	addSequential(new IntakeSolenoidCommand());
=======
	// Called to hold the box in around corners or turns in auton.
>>>>>>> 19b22d74ca6e974dcd9f8ddef79c0dd556335c38

	public AutonExtakeIntake(double T1)
	{
		addSequential(new AutonIntakeCommand(.4, T1));
	}
}
