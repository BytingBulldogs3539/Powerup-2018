package org.usfirst.frc.team3539.robot.commands;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class KeyboardDriveCommand extends Command
{
	

	public KeyboardDriveCommand()
	{
		requires(Robot.driveTrain);
	}

	protected void initialize()
	{
	}

	public void keyPressed(KeyEvent e)
	{
		if (e.isControlDown())
			System.out.println("A and Ctrl are pressed.");
		else
			System.out.println("Only A is pressed");
	}

	protected void execute()
	{
		
		JTextField InputField = new JTextField();
		KeyEvent e = new KeyEvent(InputField, KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED, 'Z');

		switch (e.getKeyCode())
		{
		case KeyEvent.VK_W:
			Robot.driveTrain.effectiveArcadeDrive(1, 0);
		case KeyEvent.VK_A:
			Robot.driveTrain.effectiveArcadeDrive(0, -1);
		case KeyEvent.VK_S:
			Robot.driveTrain.effectiveArcadeDrive(-1, 0);
		case KeyEvent.VK_D:
			Robot.driveTrain.effectiveArcadeDrive(0, 1);
		}
	}

	protected boolean isFinished()
	{
		return false;
	}

	protected void end()
	{
		Robot.driveTrain.stopDrive();
	}

	protected void interrupted()
	{
		end();
	}
}