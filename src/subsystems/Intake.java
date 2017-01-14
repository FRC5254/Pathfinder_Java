package subsystems;

import org.usfirst.frc.team5254.robot.Constants;
import org.usfirst.frc.team5254.robot.Team5254Libraries.PneumaticToggle;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Intake{
	
	//creates a toggler object for intake 
	DoubleSolenoid doubleSolenoid;
	private PneumaticToggle intakeToggle;

	//Opens a talon motor controller for intake
	Talon intakeMotor = new Talon(Constants.INTAKE_MOTOR);

	//sets the variable for down to be used in intakeDown()
	static final Value down = DoubleSolenoid.Value.kForward;
	static final Value up = DoubleSolenoid.Value.kForward;
	
	public Intake(){
		doubleSolenoid = new DoubleSolenoid(Constants.INTAKE_PISTON_EXTEND,Constants.INTAKE_PISTON_RETRACT);
		intakeToggle = new PneumaticToggle(doubleSolenoid);
	}
	
	//toggles intake up or down with button press of input
	public void toggleIntake(boolean input1) {
		intakeToggle.DoubleToggle(input1);
	}

	//sets intake motor to full speed in
	public void intakeIn() {
		System.out.println("IntakeIn");
		intakeMotor.set(1);
	}
	
	//sets intake motor to full speed out
	public void intakeOut() {
		intakeMotor.set(-1);
	}
	
	//turns intake motor off 
	public void intakeOff() {
		intakeMotor.set(0);
	}
	
	//returns if the intake is currently down 
	public boolean intakeDown(){
		return (down == doubleSolenoid.get());
	}
	
	//reurns if the intake is currently up
	public boolean intakeUp(){
		return (up == doubleSolenoid.get());
	}	
}