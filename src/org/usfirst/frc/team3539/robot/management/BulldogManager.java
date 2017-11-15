package org.usfirst.frc.team3539.robot.management;

import java.util.ArrayList;

/**
 * Bulldog-Object manager for periodically polling data from classes implementing IManageable
 * 
 * @author FRC-3539
 *
 * @since 11/04/17
 */

public class BulldogManager
{
	// TODO: Implement JSON

	private static BulldogManager bm;

	@SuppressWarnings("unused")
	private ArrayList<IManageable> allData = new ArrayList<IManageable>();

	/**
	 * private constructor - Singleton
	 */
	private BulldogManager()
	{
		startManaging();
	}

	private void startManaging()
	{
		// TODO: Add main management loop for disabledPeriodic(), autonomousPeriodic(), teleopPeriodic()
	}

	public static BulldogManager getInstance()
	{
		if (bm == null)
		{
			bm = new BulldogManager();
			return bm;
		}
		else
			return bm;
	}

}
