package com.demoaut.newtours.certification.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewToursFlightConfirmationPage {

	public static final Target FLIGHT_CONFIRMATION = Target.the("Flight confirmation message").locatedBy("//font[@size='+1']");
	public static final Target LOG_OUT_BUTTON = Target.the("Log out button").locatedBy("//img[@src='/images/forms/Logout.gif']");
	
}
