package NewAndImproved;

public class Constants {
	/* ---- Flat constants, you should need to change these ------ */
	public final static int REMOTE_0 = 0;
	public final static int REMOTE_1 = 1;
	public final static int PID_PRIMARY = 0;
	public final static int PID_TURN = 1;
	public final static int SLOT_0 = 0;
	public final static int SLOT_1 = 1;
	public final static int SLOT_2 = 2;
	public final static int SLOT_3 = 3;

	/**
	 * How many joystick buttons to poll.
	 * 10 means buttons[1,9] are polled, which is actually 9 buttons
	 */
	public final static int kNumButtonsPlusOne = 10;

	/**
	 * How many sensor units per rotation.
	 * Using CTRE Magnetic Encoder.
	 * @link https://github.com/CrossTheRoadElec/Phoenix-Documentation#what-are-the-units-of-my-sensor
	 */
	public final static int kSensorUnitsPerRotation = 4096;

	public final static double kRotationsToTravel = 6;

	/**
	 * How to measure robot heading. 0 for Difference between left and right quad encoder. 1 for Pigeon IMU.
	 */
	public final static int kHeadingSensorChoice = 1;

	/**
	 * Empirically measure what the difference between encoders per 360'
	 * Drive the robot in clockwise rotations and measure the units per rotation.
	 * Drive the robot in counter clockwise rotations and measure the units per rotation.
	 * Take the average of the two.
	 */
	public final static int kEncoderUnitsPerRotation = 17011;

	/**
	 * This is a property of the Pigeon IMU, and should not be changed.
	 */
	public final static int kPigeonUnitsPerRotation = 8192;


	/**
	 * Using the config feature, scale units to 3600 per rotation.
	 * This is nice as it keeps 0.1 deg resolution, and is fairly intuitive.
	 */
	public final static double kTurnTravelUnitsPerRotation = 3600;

	/**
	 * set to zero to skip waiting for confirmation, set to nonzero to wait
	 * and report to DS if action fails.
	 */
	public final static int kTimeoutMs = 10;

	/**
	 * Base trajectory period to add to each individual 
	 * trajectory point's unique duration.  This can be set
	 * to any value within [0,255]ms.
	 */
	public final static int kBaseTrajPeriodMs = 0;

	/**
	 * Motor neutral dead-band, set to the minimum 0.1%.
	 */
	public final static double kNeutralDeadband = 0.001;

	//                                         			   kP   kI   kD   kF              Iz    PeakOut
	public final static Gains kGains_Distanc = new Gains( 0.75, 0.0,  0.0, 0.0,            100,  0.50 );
	public final static Gains kGains_Turning = new Gains( 4.2, 0,  15, 0.0,            200,  1.00 );
	public final static Gains kGains_Velocit = new Gains( 0.04, 0.0, 20.0, 1023.0/2300.0,  300,  0.50 ); /* measured 6800 velocity units at full motor output */
	public final static Gains kGains_MotProf = new Gains( .2, 0.0,  0.0, 1023.0/2300.0,  400,  1.00 ); 

	public final static int kSlot_Distanc = SLOT_0;
	public final static int kSlot_Turning = SLOT_1;
	public final static int kSlot_Velocit = SLOT_2;
	public final static int kSlot_MotProf = SLOT_3;
}
