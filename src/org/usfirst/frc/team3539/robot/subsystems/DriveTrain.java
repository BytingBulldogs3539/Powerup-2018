package org.usfirst.frc.team3539.robot.subsystems;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.DriveCommand;
import org.usfirst.frc.team3539.robot.utilities.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem {
	PowerDistributionPanel pdp = new PowerDistributionPanel();
	ADXL362 Acc = new ADXL362(SPI.Port.kOnboardCS1, Accelerometer.Range.k8G);
	ADXRS450_Gyro Gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
	TalonSRX lf, lb, rf, rb, lm, rm;
	Drive drive;

	int error = 1000;
	int maxpdpCount = 250;
	int recpdpCount=0;
	int neededrecloopcount=100;
	int loopAmount = 0;
	int loopCounter = 0;
	int allowedError = 0;
<<<<<<< HEAD
	String motors;
=======
	int pdpLoopCounter = 0;
	currentLimitStage currentCurrentStage;
>>>>>>> a8dcaf28fb52d120b1d3976e88b07912cccc08ab

	public DriveTrain() {
		// gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

		lf = new TalonSRX(RobotMap.lf);
		rf = new TalonSRX(RobotMap.rf);

		lm = new TalonSRX(RobotMap.lm);
		rm = new TalonSRX(RobotMap.rm);

		lb = new TalonSRX(RobotMap.lb);
		rb = new TalonSRX(RobotMap.rb);

		lf.configPeakOutputForward(1, 10);
		lf.configPeakOutputReverse(-1, 10);

		rf.configPeakOutputForward(1, 10);
		rf.configPeakOutputReverse(-1, 10);

		rm.configPeakOutputForward(1, 10);
		rm.configPeakOutputReverse(-1, 10);

		lm.configPeakOutputForward(1, 10);
		lm.configPeakOutputReverse(-1, 10);

		lb.configPeakOutputForward(1, 10);
		lb.configPeakOutputReverse(-1, 10);

		rb.configPeakOutputForward(1, 10);
		rb.configPeakOutputReverse(-1, 10);

		lf.configNominalOutputForward(0, 10);
		rf.configNominalOutputForward(0, 10);
		lb.configNominalOutputForward(0, 10);
		rb.configNominalOutputForward(0, 10);

		lm.configNominalOutputForward(0, 10);
		rm.configNominalOutputForward(0, 10);
		lm.configNominalOutputReverse(0, 10);
		rm.configNominalOutputReverse(0, 10);

		lf.configNominalOutputReverse(0, 10);
		rf.configNominalOutputReverse(0, 10);
		lb.configNominalOutputReverse(0, 10);
		rb.configNominalOutputReverse(0, 10);

		// lb.setNeutralMode(NeutralMode.Brake);
		// rb.setNeutralMode(NeutralMode.Brake);
		//
		// lf.setNeutralMode(NeutralMode.Brake);
		// rf.setNeutralMode(NeutralMode.Brake);

		drive = new Drive(rf, lf);

		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);

		// lf.configClosedloopRamp(1, 10);
		// rf.configClosedloopRamp(1, 10);

		lf.configAllowableClosedloopError(10, 0, 10);
		rf.configAllowableClosedloopError(10, 0, 10);

		setFollower();
		setInverted();
		SmartDashboard.putData("PDP", pdp);
		SmartDashboard.putData("Acc", Acc);
		SmartDashboard.putData("Gyro", Gyro);
	}

	public void zeroEnc() {
		lf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rf.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		lf.getSensorCollection().setPulseWidthPosition(0, 10);
		rf.getSensorCollection().setPulseWidthPosition(0, 10);
		lf.setSelectedSensorPosition(lf.getSelectedSensorPosition(10), 0, 10);
		rf.setSelectedSensorPosition(rf.getSelectedSensorPosition(10), 0, 10);
	}

	public void setFollower() {
		lm.set(ControlMode.Follower, lf.getDeviceID());
		rm.set(ControlMode.Follower, rf.getDeviceID());
		lb.set(ControlMode.Follower, lf.getDeviceID());
		rb.set(ControlMode.Follower, rf.getDeviceID());
	}

	public void disableTwoMotors() {
		lb.set(ControlMode.Disabled, 0);
		rb.set(ControlMode.Disabled, 0);
	}

	public void enableTwoMotors() {
		setFollower();
	}

	public void setInverted() {
		lf.setInverted(true);
		rf.setInverted(true);

		lm.setInverted(false);
		rm.setInverted(false);

		lb.setInverted(false);

		rb.setInverted(false);
	}

	public boolean lonTarget() {
		return false;
	}

	public boolean ronTarget() {
		return false;
	}

	public void driveArcade(double forward, double rotate) {
		drive.driveArcade(forward, rotate);
	}

	public void setPID(double P, double I, double D, double F) {
		lf.config_kF(0, F, 10);
		rf.config_kF(0, F, 10);
		lf.config_kP(0, P, 10);
		rf.config_kP(0, P, 10);
		lf.config_kI(0, I, 10);
		rf.config_kI(0, I, 10);
		lf.config_kD(0, D, 10);
		rf.config_kD(0, D, 10);
	}

	public void setSetpointDrive(double setpointinches) {
		zeroEnc();

		lb.set(ControlMode.Follower, RobotMap.lf);
		rb.set(ControlMode.Follower, RobotMap.rf);

		System.out.println("lbcontrol" + lb.getControlMode());
		System.out.println("rbcontrol" + rb.getControlMode());
		lf.set(ControlMode.Position, setpointinches);
		rf.set(ControlMode.Position, -setpointinches);
	}

	public void setSetpointTurn(double setpointdegrees) {
		zeroEnc();

		lb.set(ControlMode.Follower, RobotMap.lf);
		rb.set(ControlMode.Follower, RobotMap.rf);

		System.out.println("setpoint" + degreesToEnc(setpointdegrees));
		lf.set(ControlMode.Position, degreesToEnc(setpointdegrees));
		rf.set(ControlMode.Position, degreesToEnc(setpointdegrees));
	}

	public void DriveSpeed(double Velocity) {
		lb.set(ControlMode.Follower, RobotMap.lf);
		rb.set(ControlMode.Follower, RobotMap.rf);
		System.out.println("lbcontrol" + lb.getControlMode());
		System.out.println("rbcontrol" + rb.getControlMode());
		lf.set(ControlMode.Velocity, ftpsToEncps(Velocity));
		rf.set(ControlMode.Velocity, ftpsToEncps(-Velocity));
	}

	public double ftpsToEncps(double ftps) {

		return ftps * 394;
		// return ftps * 100.0;
	}

	public double degreesToEnc(double degrees) {
		return inchToEncoder((RobotMap.robotCir / 360) * degrees);
	}

	public void stopDrive() {
		driveArcade(0, 0);
	}

	public boolean onTarget() {
		if (lf.getClosedLoopError(0) <= allowedError && lf.getClosedLoopError(0) >= -allowedError
				&& rf.getClosedLoopError(0) <= allowedError && rf.getClosedLoopError(0) >= -allowedError) {
			loopCounter++;
			System.out.println(loopCounter);
		} else
			loopCounter = 0;
		if (loopCounter >= loopAmount) {
			return true;
		}

		return false;
	}

	public void setLoopOnTarget(int LoopAmount) {
		loopAmount = LoopAmount;
	}

	public void setTargetAllowedError(int MotorTicks) {
		lf.configAllowableClosedloopError(0, MotorTicks, 10);
		rf.configAllowableClosedloopError(0, MotorTicks, 10);
		allowedError = MotorTicks;
	}

	public void zeroLoopCounter() {
		loopCounter = 0;
	}

	public double inchToEncoder(double inches) {
		return (inches / 12.56) * 4096;
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}

	public void updateEnc() {
		SmartDashboard.putNumber("Right Enc", rf.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Enc", lf.getSelectedSensorPosition(0));
	}

	public void effectiveArcadeDrive(double throttle, double wheel) {
		wheel = applyDeadband(wheel, RobotMap.wheelDeadband);
		throttle = applyDeadband(throttle, RobotMap.throttleDeadband);

		// Apply a sin function that's scaled to make it feel better.
		final double wheelDenominator = Math.sin(Math.PI / 2.0 * RobotMap.wheelNonLinearity);
		wheel = Math.sin(Math.PI / 2.0 * RobotMap.wheelNonLinearity * wheel) / wheelDenominator;

		// Apply a tan function that's scaled to make it feel better.
		final double throttleDenominator = Math.tan(Math.PI / 2.0 * RobotMap.throttleNonLinearity);
		throttle = Math.tan(Math.PI / 2.0 * RobotMap.throttleNonLinearity * throttle) / throttleDenominator;

		// Decrease wheel by __% at high speed
		if (Math.abs(throttle) > RobotMap.throttleHighPass) {
			wheel = wheel * RobotMap.highSpeedWheel;
		}

		driveArcade(throttle, wheel);
	}

	public double applyDeadband(double value, double deadband) {
		// if abs(val) > abs(deadband) return val; else return 0.0;
		return (Math.abs(value) > Math.abs(deadband)) ? value : 0.0;
	}
<<<<<<< HEAD
	public void motorTest()
	{
		StringBuilder Motors = new StringBuilder(1000) ;

	lf.set(ControlMode.PercentOutput, 0);
	lm.set(ControlMode.PercentOutput, 0);
	lb.set(ControlMode.PercentOutput, 0);
	rf.set(ControlMode.PercentOutput, 0);
	rm.set(ControlMode.PercentOutput, 0);
	rb.set(ControlMode.PercentOutput, 0);
	
	
	lf.set(ControlMode.PercentOutput,.5);//set to .5 
	Timer.delay(2);//wait
	System.out.println("--------");
	Motors.append("  lfMotorCurrent= "+lf.getOutputCurrent());
	Motors.append("  lfMotorVoltage = "+lf.getMotorOutputVoltage());

	lf.set(ControlMode.PercentOutput, 0);//set to 0
	
	Timer.delay(2);//wait before starting other motor
	
	lm.set(ControlMode.PercentOutput,.5);
	Timer.delay(2);
	
	Motors.append("  lmMotorCurrent= "+lm.getOutputCurrent());
	Motors.append("  lmMotorVoltage = "+lm.getMotorOutputVoltage());


	lm.set(ControlMode.PercentOutput, 0);
	
	Timer.delay(2);//wait before starting other motor

	lb.set(ControlMode.PercentOutput,.5);
	Timer.delay(2);
	Motors.append("  lbMotorCurrent= "+lb.getOutputCurrent());
	Motors.append("  lbMotorVoltage = "+lb.getMotorOutputVoltage());

	lb.set(ControlMode.PercentOutput, 0);
	
	Timer.delay(2);//wait before starting other motor
	
	rf.set(ControlMode.PercentOutput,.5);
	Timer.delay(2);
	Motors.append("  rfMotorCurrent= "+rf.getOutputCurrent());
	Motors.append("  rfMotorVoltage = "+rf.getMotorOutputVoltage());

	rf.set(ControlMode.PercentOutput, 0);
	
	Timer.delay(2);
	
	rm.set(ControlMode.PercentOutput,.5);
	Timer.delay(2);
	Motors.append("  rmMotorCurrent = "+rm.getOutputCurrent());
	Motors.append("  rmMotorVoltage = "+rm.getMotorOutputVoltage());

	rm.set(ControlMode.PercentOutput, 0);
	
	Timer.delay(2);
	
	
	rb.set(ControlMode.PercentOutput,.5);
	Timer.delay(2);
	Motors.append("  rbMotorCurrent= "+rb.getOutputCurrent());
	Motors.append("  rbMotorVoltage = "+rb.getMotorOutputVoltage());

	rb.set(ControlMode.PercentOutput, 0);
	 motors =Motors.toString();
	

	
		
	}
	public String print()
	{
	return motors;
=======

	public double getTotalCurrent() {
		return pdp.getCurrent(0) + pdp.getCurrent(1) + pdp.getCurrent(2) + pdp.getCurrent(3) + pdp.getCurrent(4)
				+ pdp.getCurrent(5) + pdp.getCurrent(6) + pdp.getCurrent(7) + pdp.getCurrent(8) + pdp.getCurrent(9)
				+ pdp.getCurrent(10) + pdp.getCurrent(11) + pdp.getCurrent(12) + pdp.getCurrent(13) + pdp.getCurrent(14)
				+ pdp.getCurrent(15);
	}

	public enum currentLimitStage {
		STAGE1, STAGE2, STAGE3
	}

	public void controlCurrent() {
		double totalCurrent = getTotalCurrent();
		if (totalCurrent >= RobotMap.maxCurrent) {
			recpdpCount=0;
			System.err.println("OVER MAX CURRENT");
			pdpLoopCounter++;
			if (pdpLoopCounter > maxpdpCount) {
				switch (currentCurrentStage) {
				case STAGE1:
					for(int i=0;i>5;i++)
					{
						System.err.println("DROPPING Compressor");
					}
					Robot.c.stop();
					pdpLoopCounter = pdpLoopCounter - (int) (pdpLoopCounter * .75);
					currentCurrentStage = currentLimitStage.STAGE2;
					break;
				case STAGE2:
					for(int i=0;i>5;i++)
					{
						System.err.println("DROPPING 2 CIMS");
					}
					disableTwoMotors();
					pdpLoopCounter = pdpLoopCounter - (int) (pdpLoopCounter * .75);
					currentCurrentStage = currentLimitStage.STAGE3;
					break;
				case STAGE3:
					for(int i=0;i>5;i++)
					{
						System.err.println("DISABLING THE INTAKE");
					}
					// ADD CODE FOR INTAKE WHEN CREATED!!
					break;
				}
			}
		}
		else	
		{
			recpdpCount++;
			if(recpdpCount >= neededrecloopcount)
			{
				pdpLoopCounter=0;
				recpdpCount=0;
				Robot.c.start();
				enableTwoMotors();
				
			}
		}

>>>>>>> a8dcaf28fb52d120b1d3976e88b07912cccc08ab
	}
}
