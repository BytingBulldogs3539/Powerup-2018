package NewAndImproved;

import org.usfirst.frc.team3539.robot.Robot;
import org.usfirst.frc.team3539.robot.RobotMap;
import org.usfirst.frc.team3539.robot.commands.TeleopElevatorPositionCommand;
import org.usfirst.frc.team3539.robot.utilities.MotionProfile;
import org.usfirst.frc.team3539.robot.utilities.MotionProfileExample;

import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FollowerType;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
@SuppressWarnings("unused")
public class AutonMotionProfileEx2 extends Command
{
boolean bMoveForward;
MotionProfileExample2 m;

	public AutonMotionProfileEx2(double[][] Profile, int totalPointNum,boolean forward)
	{
		requires(Robot.driveTrain);
		bMoveForward = forward;

		 m = new MotionProfileExample2(Robot.driveTrain.rf, Profile, totalPointNum);

	}

	

	protected void initialize()
	{
		m.reset();
		Robot.driveTrain.initMotionProfile();
	m.start(900, bMoveForward);//end heading is currently not used 

	}

	protected void execute()

	{
		


		Robot.driveTrain.rf.set(ControlMode.MotionProfileArc, m.getSetValue().value);
			Robot.driveTrain.lf.follow(Robot.driveTrain.rf, FollowerType.AuxOutput1);
		
		/* call this periodically, and catch the output.  Only apply it if user wants to run MP. */
		m.control();


	}

	protected boolean isFinished()
	{

		return m.finished;
	}

	protected void end()
	{
		Robot.driveTrain.neutralMotors();
			// isfinished = false;
	}

	protected void interrupted()
	{
		end();
	}
}
