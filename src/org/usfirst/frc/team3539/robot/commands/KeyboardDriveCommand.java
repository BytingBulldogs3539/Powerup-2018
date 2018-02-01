package org.usfirst.frc.team3539.robot.commands;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import org.usfirst.frc.team3539.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class KeyboardDriveCommand extends Command
{
	int w = KeyEvent.VK_W;
	int a = KeyEvent.VK_A;
	int s = KeyEvent.VK_S;
	int d = KeyEvent.VK_D;

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
		int W = KeyEvent.VK_W;
		int A = KeyEvent.VK_W;
		int S = KeyEvent.VK_S;
		int D = KeyEvent.VK_D;

		JTextField InputField = new JTextField();
		KeyEvent e = new KeyEvent(InputField, KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED,
				'Z');

		switch (e.getKeyCode())
		{
		case KeyEvent.VK_W:
			keyPressed(e);
		}

		Robot.driveTrain.effectiveArcadeDrive(Robot.oi.one.getLeftStickY(), -Robot.oi.one.getRightStickX());
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