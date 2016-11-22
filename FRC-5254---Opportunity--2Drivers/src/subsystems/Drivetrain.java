package subsystems;

import org.usfirst.frc.team5255.robot.Constants;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Drivetrain{
	
	private DoubleSolenoid shiftingPiston = new DoubleSolenoid(Constants.SHIFTING_PISTON_EXTEND,Constants.SHIFTING_PISTON_RETRACT); 
	private RobotDrive myRobot = new RobotDrive(2, 3, 0, 1); //Front Left, Rear Left, Front Right, Rear Right
	
	public Drivetrain() {
	}
	
	//Split stick arcade drive
	public void drive(double Throttle, double Turn) {
		myRobot.arcadeDrive(Throttle,Turn);
	}
	
	//Button to shift high
	public void shiftHigh() {
		shiftingPiston.set(DoubleSolenoid.Value.kForward);
	}
	
	//Button to shift low 
	public void shiftLow() {
		shiftingPiston.set(DoubleSolenoid.Value.kReverse);
	}

	
}