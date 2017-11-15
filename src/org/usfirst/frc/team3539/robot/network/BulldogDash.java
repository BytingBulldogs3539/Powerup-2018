package org.usfirst.frc.team3539.robot.network;

/**
 * Singleton class for SmartDashboard display
 * 
 * @author FRC-3539
 *
 * @since 11/04/17
 */

// TODO: Review for construction
// TODO: Implement default "Menu Bar"
// TODO: Create sample subclass
// TODO: Log it!
// TODO: Integrate BytePackets

public class BulldogDash
{
	private static BulldogDash bd;

	/**
	 * private constructor - Singleton
	 */
	private BulldogDash()
	{
	}

	public static BulldogDash getInstance()
	{
		if (bd == null)
		{
			bd = new BulldogDash();
			return bd;
		}
		else
			return bd;
	}
}
