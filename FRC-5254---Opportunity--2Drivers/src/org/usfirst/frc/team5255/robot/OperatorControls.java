package org.usfirst.frc.team5255.robot;

import org.usfirst.frc.team5255.robot.Team5254Libraries.xBox360;

public class OperatorControls extends Opportunity {

	// Opens a new xBox360 controller
	private xBox360 operator = new xBox360(Constants.OPERATOR_JOYSTICK_PORT);

	public OperatorControls() {
	}

	public void OperatorControls() {
		
		// intake
		// Y button toggles intake to either up or down
		intake.toggleIntake(operator.getLT(),operator.getRT());

		// Changes the wheel direction
		if (operator.getButtonA()) // button A = intake in
			intake.intakeIn();
		if (operator.getButtonB()) // button B = intake off
			intake.intakeOff();
		if (operator.getButtonX()) // button C = intake out
			intake.intakeOut();

	}
}
