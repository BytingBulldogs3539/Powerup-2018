package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.ParamEnum;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.RemoteSensorSource;
import com.ctre.phoenix.motorcontrol.SensorTerm;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author 3539
 */
public final class DriveTrain extends Subsystem
{
	private ADXRS450_Gyro gyro;
	public TalonSRX lf, lb, rf, rb,_talonPigeon;
public 	PigeonIMU _imu;
	private Drive drive;

	private int maxLoopNumber = 0;
	private int onTargetCounter = 0;
	private int allowedErrorRange = 0;

	public DriveTrain()
	{

		gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

		 _talonPigeon = new TalonSRX(9);
		 _imu = new PigeonIMU(_talonPigeon);

		lf = new TalonSRX(RobotMap.lf);
		rf = new TalonSRX(RobotMap.rf);

		lb = new TalonSRX(RobotMap.lb);
		rb = new TalonSRX(RobotMap.rb);
		init();

	}
	public void init()
	{		// Reader r = new Reader(rf, 1, true);
		// r.addMethod("rf", "getSelectedSensorPosition", 0);
		// r.addMethod("rf", "getSelectedSensorVelocity", 0);
		// r.addMethod("rf", "getOutputCurrent");
		// r.addMethod("rf", "getMotorOutputPercent");
		// Robot.l.add(r);
		//
		// Reader l = new Reader(lf, 1, true);
		// l.addMethod("lf", "getSelectedSensorPosition", 0);
		// l.addMethod("lf", "getSelectedSensorVelocity", 0);
		// l.addMethod("lf", "getOutputCurrent");
		// l.addMethod("lf", "getMotorOutputPercent");
		// Robot.l.add(l);

		double peakOut = 1;// 1 is full ouput
		lf.configPeakOutputForward(peakOut, 10);
		lf.configPeakOutputReverse(-peakOut, 10);

		rf.configPeakOutputForward(peakOut, 10);
		rf.configPeakOutputReverse(-peakOut, 10);

		lb.configPeakOutputForward(peakOut, 10);
		lb.configPeakOutputReverse(-peakOut, 10);

		rb.configPeakOutputForward(peakOut, 10);
		rb.configPeakOutputReverse(-peakOut, 10);

		// Nominal is the default output when given no instruction
		lf.configNominalOutputForward(0, 10);
		rf.configNominalOutputForward(0, 10);

		lf.configNominalOutputReverse(0, 10);
		rf.configNominalOutputReverse(0, 10);

		lb.configNominalOutputForward(0, 10);
		rb.configNominalOutputForward(0, 10);

		lb.configNominalOutputReverse(0, 10);
		rb.configNominalOutputReverse(0, 10);

		drive = new Drive(rf, lf);

		lf.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 10, 10);
		rf.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 10, 10);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);

		lf.clearStickyFaults(0);
		rf.clearStickyFaults(0);
		lb.clearStickyFaults(0);
		rb.clearStickyFaults(0);

		// leftTrack = new BulldogMotionProfile(lf, "Left Track ");
		// rightTrack = new BulldogMotionProfile(rf, "Right Track ");

		setBrakeMode(true);
		setFollower();
		setInverted();
		// Omar CTRE I hate you sometimes - Do not remove
		enableCurrentLimit();
		// enableRamp();

		// SmartDashboard.putData("Accelerometer", accelerometer);
		SmartDashboard.putData("Gyro", gyro);

		setSensorPhase(false);
		
	}

	public void updateLog()
	{

	}

	public void setBrakeMode(boolean shouldBrakeMode)
	{
		if (shouldBrakeMode)
		{
			lf.setNeutralMode(NeutralMode.Brake);
			rf.setNeutralMode(NeutralMode.Brake);
			lb.setNeutralMode(NeutralMode.Brake);
			rb.setNeutralMode(NeutralMode.Brake);
		}
		else
		{
			lf.setNeutralMode(NeutralMode.Coast);
			rf.setNeutralMode(NeutralMode.Coast);
			lb.setNeutralMode(NeutralMode.Coast);
			rb.setNeutralMode(NeutralMode.Coast);
		}
	}

	private void setFollower()
	{

		lb.set(ControlMode.Follower, lf.getDeviceID());
		rb.set(ControlMode.Follower, rf.getDeviceID());
	}

	private void setInverted()
	{
		lf.setInverted(true);
		lb.setInverted(true);

		rf.setInverted(false);
		rb.setInverted(false);
	}

	@SuppressWarnings("unused")
	private void enableCurrentLimit()
	{
		lf.configPeakCurrentLimit(30, 10);
		rf.configPeakCurrentLimit(30, 10);

		lf.configPeakCurrentDuration(100, 10);
		rf.configPeakCurrentDuration(100, 10);//50

		lf.configContinuousCurrentLimit(25, 10);
		rf.configContinuousCurrentLimit(25, 10);//25 

		lf.enableCurrentLimit(true); // TODO - Change to true and add rest of current code
		rf.enableCurrentLimit(true);
	}

	public void setSensorPhase(boolean phase)
	{
		rf.setSensorPhase(phase);
		lf.setSensorPhase(phase);
	}

	public void zeroEncoders()
	{
		lf.setSelectedSensorPosition(0, 0, 10);
		rf.setSelectedSensorPosition(0, 0, 10);
	}

	public void zeroGyro()
	{
		gyro.reset();
	}

	public double getHeading()
	{
		return gyro.getAngle();
	}

	public void calibrateGyro()
	{
		gyro.calibrate();
	}

	public void driveArcade(double throttle, double wheel)
	{
		// drive.driveArcade(Math.copySign(Math.pow(throttle, 2), throttle),
		// Math.copySign(Math.pow(wheel, 2), wheel));
		drive.driveArcade(throttle , wheel * 0.9);
	}

	public void setPID(double P, double I, double D, double F)
	{
		lf.config_kF(0, F, 10);

		lf.config_kP(0, P, 10);// 

		lf.config_kI(0, I, 10);

		lf.config_kD(0, D, 10);

		rf.config_kF(0, F, 10);//*1.3 on practice 

		rf.config_kP(0, P, 10);//*1.3 on practice 

		rf.config_kI(0, I, 10);
		rf.config_kD(0, D, 10);

	}
	public void setPIDScale(double P, double I, double D, double F)
	{
		lf.config_kF(0, F, 10);

		lf.config_kP(0, P, 10);// 

		lf.config_kI(0, I, 10);

		lf.config_kD(0, D, 10);

		rf.config_kF(0, F*1.2, 10);//*1.3 on practice 

		rf.config_kP(0, P*1.2, 10);//*1.3 on practice 

		rf.config_kI(0, I, 10);
		rf.config_kD(0, D, 10);

	}

	public void setSetpointDrive(double setpointinches)
	{
		lf.set(ControlMode.Position, inchToEncoder(setpointinches));
		rf.set(ControlMode.Position, inchToEncoder(setpointinches));
	}

	public void setSetpointTurn(double setpointdegrees)
	{
		zeroEncoders();

		System.out.println("setpoint: " + degreesToEncoder(setpointdegrees));

		lf.set(ControlMode.Position, -degreesToEncoder(setpointdegrees));
		rf.set(ControlMode.Position, degreesToEncoder(setpointdegrees));
	}

	public void enableRamp()
	{
		lf.configOpenloopRamp(.075, 0);
		rf.configOpenloopRamp(.075, 0);

	}

	public void disableRamp()
	{
		lf.configOpenloopRamp(0, 0);
		rf.configOpenloopRamp(0, 0);

	}

	public double degreesToEncoder(double degrees)
	{
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	public boolean onTarget()
	{
		if (Math.abs(lf.getClosedLoopError(0)) <= allowedErrorRange && Math.abs(rf.getClosedLoopError(0)) <= allowedErrorRange)
		{
			onTargetCounter++;
			System.out.println(onTargetCounter);
		}
		else
		{
			System.out.println(onTargetCounter);
			onTargetCounter = 0;
		}

		if (maxLoopNumber <= onTargetCounter)
		{
			System.out.println(onTargetCounter);

			return true;
		}

		return false;
	}

	public void setupOnTarget(int ticks, int maxLoopNumber)
	{
		// zero the on target counter
		onTargetCounter = 0;

		lf.configAllowableClosedloopError(0, ticks, 10);
		rf.configAllowableClosedloopError(0, ticks, 10);

		// set tolerance in ticks
		allowedErrorRange = ticks;

		this.maxLoopNumber = maxLoopNumber;
	}

	public double inchToEncoder(double inches)
	{
		System.out.println((inches / RobotMap.wheelCir) * 4096);
		return (inches / RobotMap.wheelCir) * 4096;
	}

	public void updateEncoders()
	{
		updateLog();
		// if (logging)
		// {
		// log.print(lf.getSelectedSensorPosition(0) + "," +
		// lf.getSelectedSensorVelocity(0) + "," + lf.getMotorOutputPercent() + "," +
		// rf.getSelectedSensorPosition(0) + "," + rf.getSelectedSensorVelocity(0) + ","
		// + rf.getMotorOutputPercent());
		// log.println("");
		// }

		SmartDashboard.putNumber("Right Encoder", rf.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Encoder", lf.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Right Enc VEL", rf.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("Left Enc VEL", lf.getSelectedSensorVelocity(0));
	}

	public void effectiveDriveArcade(double throttle, double wheel)
	{
		wheel = applyDeadband(wheel, RobotMap.wheelDeadband);
		throttle = applyDeadband(throttle, RobotMap.throttleDeadband);

		// Apply a sin function that's scaled to make it feel better.
		final double wheelDenominator = Math.sin(Math.PI / 2.0 * RobotMap.wheelNonLinearity);
		wheel = Math.sin(Math.PI / 2.0 * RobotMap.wheelNonLinearity * wheel) / wheelDenominator;

		// Apply a tan function that's scaled to make it feel better.
		final double throttleDenominator = Math.tan(Math.PI / 2.0 * RobotMap.throttleNonLinearity);
		throttle = Math.tan(Math.PI / 2.0 * RobotMap.throttleNonLinearity * throttle) / throttleDenominator;

		// Decrease wheel by __% at high speed
		if (Math.abs(throttle) > RobotMap.throttleHighPass)
		{
			wheel = wheel * RobotMap.highSpeedWheel;
		}

		driveArcade(throttle, wheel);
	}

	public double applyDeadband(double value, double deadband)
	{
		// if abs(val) > abs(deadband) return val; else return 0.0;
		return (Math.abs(value) > Math.abs(deadband)) ? value : 0.0;
	}

	// public BulldogMotionProfile leftTrack;
	// public BulldogMotionProfile rightTrack;
	//
	// public void setMotionProfile()
	// {
	// leftTrack.set();
	// rightTrack.set();
	//
	// }

	public void MotionProfile()
	{
		lf.changeMotionControlFramePeriod(5);
		rf.changeMotionControlFramePeriod(5);
	}

	// public boolean isFinished()
	// {
	// return leftTrack.isFinished();
	// }

	public void testTalons()
	{
		StringBuilder Motors = new StringBuilder(1000);

		lf.set(ControlMode.PercentOutput, 0);
		lb.set(ControlMode.PercentOutput, 0);
		rf.set(ControlMode.PercentOutput, 0);
		rb.set(ControlMode.PercentOutput, 0);

		lf.set(ControlMode.PercentOutput, .5);// set to .5
		Timer.delay(2);// wait
		System.out.println("--------");
		Motors.append(" lfMotorCurrent= " + lf.getOutputCurrent());
		Motors.append(" lfMotorVoltage = " + lf.getMotorOutputVoltage());

		lf.set(ControlMode.PercentOutput, 0);// set to 0

		Timer.delay(2);// wait before starting other motor

		lb.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append(" lbMotorCurrent= " + lb.getOutputCurrent());
		Motors.append(" lbMotorVoltage = " + lb.getMotorOutputVoltage());

		lb.set(ControlMode.PercentOutput, 0);

		Timer.delay(2);// wait before starting other motor

		rf.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append(" rfMotorCurrent= " + rf.getOutputCurrent());
		Motors.append(" rfMotorVoltage = " + rf.getMotorOutputVoltage());

		rf.set(ControlMode.PercentOutput, 0);

		Timer.delay(2);

		Timer.delay(2);

		rb.set(ControlMode.PercentOutput, .5);
		Timer.delay(2);
		Motors.append(" rbMotorCurrent= " + rb.getOutputCurrent());
		Motors.append(" rbMotorVoltage = " + rb.getMotorOutputVoltage());

		rb.set(ControlMode.PercentOutput, 0);
		Motors.toString();
	}

	// public void DisabledMotionProfile()// probably want new name
	// {
	// lf.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
	// // status 10 provides the trajectory target for motion profile AND motion
	// magic
	// lf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10,
	// RobotMap.kTimeoutMs);
	// rf.configMotionProfileTrajectoryPeriod(10, RobotMap.kTimeoutMs);
	// rf.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10,
	// RobotMap.kTimeoutMs);
	// }

	@Override
	protected void initDefaultCommand()
	{
		setDefaultCommand(new DriveCommand());
	}

	public void printEnc()
	{
		System.out.println(" leftPosition " + lf.getSelectedSensorPosition(0) + " rightPosition " + rf.getSelectedSensorPosition(0) + " rightVelocity " + rf.getSelectedSensorVelocity(0) + " leftVelocity " + lf.getSelectedSensorVelocity(0));
		System.out.println(" leftTragPos " + lf.getActiveTrajectoryPosition() + " leftTragVel " + lf.getActiveTrajectoryPosition());

		System.out.println(" RightTragPos " + rf.getActiveTrajectoryPosition() + " RightTragVel " + rf.getActiveTrajectoryVelocity());

	}

	public void initMotionProfile(){
		rf.set(ControlMode.PercentOutput, 0);

		//------------ talons -----------------//
		lf.setInverted(true);
		lf.setSensorPhase(false);
		rf.setInverted(false);
		rf.setSensorPhase(false);

		//------------ setup filters -----------------//
		/* other side is quad */
		lf.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder,
												NewAndImproved.Constants.PID_PRIMARY,
												NewAndImproved.Constants.kTimeoutMs);

		/* Remote 0 will be the other side's Talon */
		rf.configRemoteFeedbackFilter(	lf.getDeviceID(),
												RemoteSensorSource.TalonSRX_SelectedSensor,
												NewAndImproved.Constants.REMOTE_0,
												NewAndImproved.Constants.kTimeoutMs);
		/* Remote 1 will be a pigeon */
		rf.configRemoteFeedbackFilter(	_talonPigeon.getDeviceID(),
												RemoteSensorSource.GadgeteerPigeon_Yaw,
												NewAndImproved.Constants.REMOTE_1,
												NewAndImproved.Constants.kTimeoutMs);
		/* setup sum and difference signals */
		rf.configSensorTerm(SensorTerm.Sum0, FeedbackDevice.RemoteSensor0, NewAndImproved.Constants.kTimeoutMs);
		rf.configSensorTerm(SensorTerm.Sum1, FeedbackDevice.QuadEncoder, NewAndImproved.Constants.kTimeoutMs);
		rf.configSensorTerm(SensorTerm.Diff1, FeedbackDevice.RemoteSensor0, NewAndImproved.Constants.kTimeoutMs);
		rf.configSensorTerm(SensorTerm.Diff0, FeedbackDevice.QuadEncoder, NewAndImproved.Constants.kTimeoutMs);
		/* select sum for distance(0), different for turn(1) */
		rf.configSelectedFeedbackSensor(FeedbackDevice.SensorSum, NewAndImproved.Constants.PID_PRIMARY, NewAndImproved.Constants.kTimeoutMs);
		
		if (NewAndImproved.Constants.kHeadingSensorChoice == 0) {

			rf.configSelectedFeedbackSensor(FeedbackDevice.SensorDifference,
													NewAndImproved.Constants.PID_TURN,
													NewAndImproved.Constants.kTimeoutMs);

			/* do not scale down the primary sensor (distance) */
			rf.configSelectedFeedbackCoefficient(1, NewAndImproved.Constants.PID_PRIMARY, NewAndImproved.Constants.kTimeoutMs);

			/* scale empirically measured units to 3600units, this gives us
			 * - 0.1 deg resolution
			 * - scales to human-readable units
			 * - keeps target away from overflow (12bit)
			 *
			 * Heading units should be scaled to ~4000 per 360 deg, due to the following limitations...
			 * - Target param for aux PID1 is 18bits with a range of [-131072,+131072] units.
			 * - Target for aux PID1 in motion profile is 14bits with a range of [-8192,+8192] units.
			 *  ... so at 3600 units per 360', that ensures 0.1 deg precision in firmware closed-loop
			 *  and motion profile trajectory points can range +-2 rotations.
			 */
			rf.configSelectedFeedbackCoefficient(NewAndImproved.Constants.kTurnTravelUnitsPerRotation / NewAndImproved.Constants.kEncoderUnitsPerRotation, NewAndImproved.Constants.PID_TURN, NewAndImproved.Constants.kTimeoutMs);
		} else {

			/* do not scale down the primary sensor (distance).  If selected sensor is going to be a sensorSum
			 * user can pass 0.5 to produce an average. */
			rf.configSelectedFeedbackCoefficient(1.0, NewAndImproved.Constants.PID_PRIMARY, NewAndImproved.Constants.kTimeoutMs);

			rf.configSelectedFeedbackSensor(FeedbackDevice.RemoteSensor1,
													NewAndImproved.Constants.PID_TURN,
													NewAndImproved.Constants.kTimeoutMs);

			rf.configSelectedFeedbackCoefficient(NewAndImproved.Constants.kTurnTravelUnitsPerRotation / NewAndImproved.Constants.kPigeonUnitsPerRotation, NewAndImproved.Constants.PID_TURN, NewAndImproved.Constants.kTimeoutMs);
		}
		
		//------------ telemetry-----------------//
				rf.setStatusFramePeriod(StatusFrame.Status_12_Feedback1, 20, NewAndImproved.Constants.kTimeoutMs);
				rf.setStatusFramePeriod(StatusFrame.Status_13_Base_PIDF0, 20, NewAndImproved.Constants.kTimeoutMs);
				rf.setStatusFramePeriod(StatusFrame.Status_14_Turn_PIDF1, 20, NewAndImproved.Constants.kTimeoutMs);
				rf.setStatusFramePeriod(StatusFrame.Status_10_Targets, 20, NewAndImproved.Constants.kTimeoutMs);
				/* speed up the left since we are polling it's sensor */
				lf.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 5, NewAndImproved.Constants.kTimeoutMs);

				lf.configNeutralDeadband(NewAndImproved.Constants.kNeutralDeadband, NewAndImproved.Constants.kTimeoutMs);
				rf.configNeutralDeadband(NewAndImproved.Constants.kNeutralDeadband, NewAndImproved.Constants.kTimeoutMs);

				rf.configMotionAcceleration(1000, NewAndImproved.Constants.kTimeoutMs);
				rf.configMotionCruiseVelocity(1000, NewAndImproved.Constants.kTimeoutMs);

				/* max out the peak output (for all modes).  However you can
				 * limit the output of a given PID object with configClosedLoopPeakOutput().
				 */
				lf.configPeakOutputForward(+1.0, NewAndImproved.Constants.kTimeoutMs);
				lf.configPeakOutputReverse(-1.0, NewAndImproved.Constants.kTimeoutMs);
				rf.configPeakOutputForward(+1.0, NewAndImproved.Constants.kTimeoutMs);
				rf.configPeakOutputReverse(-1.0, NewAndImproved.Constants.kTimeoutMs);

				/* distance servo */
				rf.config_kP(NewAndImproved.Constants.kSlot_Distanc, NewAndImproved.Constants.kGains_Distanc.kP, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kI(NewAndImproved.Constants.kSlot_Distanc, NewAndImproved.Constants.kGains_Distanc.kI, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kD(NewAndImproved.Constants.kSlot_Distanc, NewAndImproved.Constants.kGains_Distanc.kD, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kF(NewAndImproved.Constants.kSlot_Distanc, NewAndImproved.Constants.kGains_Distanc.kF, NewAndImproved.Constants.kTimeoutMs);
				rf.config_IntegralZone(NewAndImproved.Constants.kSlot_Distanc, (int)NewAndImproved.Constants.kGains_Distanc.kIzone, NewAndImproved.Constants.kTimeoutMs);
				rf.configClosedLoopPeakOutput(	NewAndImproved.Constants.kSlot_Distanc,
														NewAndImproved.Constants.kGains_Distanc.kPeakOutput,
														NewAndImproved.Constants.kTimeoutMs);

				/* turn servo */
				rf.config_kP(NewAndImproved.Constants.kSlot_Turning, NewAndImproved.Constants.kGains_Turning.kP, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kI(NewAndImproved.Constants.kSlot_Turning, NewAndImproved.Constants.kGains_Turning.kI, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kD(NewAndImproved.Constants.kSlot_Turning, NewAndImproved.Constants.kGains_Turning.kD, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kF(NewAndImproved.Constants.kSlot_Turning, NewAndImproved.Constants.kGains_Turning.kF, NewAndImproved.Constants.kTimeoutMs);
				rf.config_IntegralZone(NewAndImproved.Constants.kSlot_Turning, (int)NewAndImproved.Constants.kGains_Turning.kIzone, NewAndImproved.Constants.kTimeoutMs);
				rf.configClosedLoopPeakOutput(	NewAndImproved.Constants.kSlot_Turning,
														NewAndImproved.Constants.kGains_Turning.kPeakOutput,
														NewAndImproved.Constants.kTimeoutMs);

				/* magic servo */
				rf.config_kP(NewAndImproved.Constants.kSlot_MotProf, NewAndImproved.Constants.kGains_MotProf.kP, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kI(NewAndImproved.Constants.kSlot_MotProf, NewAndImproved.Constants.kGains_MotProf.kI, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kD(NewAndImproved.Constants.kSlot_MotProf, NewAndImproved.Constants.kGains_MotProf.kD, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kF(NewAndImproved.Constants.kSlot_MotProf, NewAndImproved.Constants.kGains_MotProf.kF, NewAndImproved.Constants.kTimeoutMs);
				rf.config_IntegralZone(NewAndImproved.Constants.kSlot_MotProf, (int)NewAndImproved.Constants.kGains_MotProf.kIzone, NewAndImproved.Constants.kTimeoutMs);
				rf.configClosedLoopPeakOutput(	NewAndImproved.Constants.kSlot_MotProf,
														NewAndImproved.Constants.kGains_MotProf.kPeakOutput,
														NewAndImproved.Constants.kTimeoutMs);

				/* velocity servo */
				rf.config_kP(NewAndImproved.Constants.kSlot_Velocit, NewAndImproved.Constants.kGains_Velocit.kP, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kI(NewAndImproved.Constants.kSlot_Velocit, NewAndImproved.Constants.kGains_Velocit.kI, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kD(NewAndImproved.Constants.kSlot_Velocit, NewAndImproved.Constants.kGains_Velocit.kD, NewAndImproved.Constants.kTimeoutMs);
				rf.config_kF(NewAndImproved.Constants.kSlot_Velocit, NewAndImproved.Constants.kGains_Velocit.kF, NewAndImproved.Constants.kTimeoutMs);
				rf.config_IntegralZone(NewAndImproved.Constants.kSlot_Velocit, (int)NewAndImproved.Constants.kGains_Velocit.kIzone, NewAndImproved.Constants.kTimeoutMs);
				rf.configClosedLoopPeakOutput(	NewAndImproved.Constants.kSlot_Velocit,
														NewAndImproved.Constants.kGains_Velocit.kPeakOutput,
														NewAndImproved.Constants.kTimeoutMs);

				lf.setNeutralMode(NeutralMode.Brake);
				rf.setNeutralMode(NeutralMode.Brake);
				
				/* 1ms per loop.  PID loop can be slowed down if need be.
				 * For example,
				 * - if sensor updates are too slow
				 * - sensor deltas are very small per update, so derivative error never gets large enough to be useful.
				 * - sensor movement is very slow causing the derivative error to be near zero.
				 */
				int closedLoopTimeMs = 1;
				rf.configSetParameter(ParamEnum.ePIDLoopPeriod, closedLoopTimeMs, 0x00, NewAndImproved.Constants.PID_PRIMARY, NewAndImproved.Constants.kTimeoutMs);
				rf.configSetParameter(ParamEnum.ePIDLoopPeriod, closedLoopTimeMs, 0x00, NewAndImproved.Constants.PID_TURN, NewAndImproved.Constants.kTimeoutMs);

				/**
				 * false means talon's local output is PID0 + PID1, and other side Talon is PID0 - PID1
				 * true means talon's local output is PID0 - PID1, and other side Talon is PID0 + PID1
				 */
				rf.configAuxPIDPolarity(false, NewAndImproved.Constants.kTimeoutMs);
				
				zeroSensors();
	}
	void zeroSensors() {
		
		lf.getSensorCollection().setQuadraturePosition(0, NewAndImproved.Constants.kTimeoutMs);
		rf.getSensorCollection().setQuadraturePosition(0, NewAndImproved.Constants.kTimeoutMs);
		_imu.setYaw(0,NewAndImproved.Constants.kTimeoutMs);
		_imu.setAccumZAngle(0, NewAndImproved.Constants.kTimeoutMs);
		System.out.println("        [Sensors] All sensors are zeroed.\n");
	}
	
	public void neutralMotors(){
		lf.neutralOutput();
		rf.neutralOutput();
	}
	
	
}
