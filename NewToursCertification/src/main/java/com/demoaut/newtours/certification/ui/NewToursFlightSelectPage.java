package com.demoaut.newtours.certification.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class NewToursFlightSelectPage {
	
	public static final Target OUT_FLIGHT = Target.the("Out flight selection").locatedBy("//input[contains(@value, '{0}')]");
	public static final Target IN_FLIGHT = Target.the("In flight selection").locatedBy("//input[contains(@value, '{0}')]");
	public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.name("reserveFlights"));
}
