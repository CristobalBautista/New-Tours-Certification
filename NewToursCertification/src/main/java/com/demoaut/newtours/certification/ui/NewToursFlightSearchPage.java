package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

/** UI donde se mapean los elementos de la pagina de busqueda de vuelo de New Tours. 
 * <p>
 * Se mapea el formulario de busqueda de vuelo para certificar que ha cargado la pagina.
 */

public class NewToursFlightSearchPage {
	
	public static final Target FLIGHT_SEARCH_FORMAT = Target.the("Flight search format").located(By.name("findflight"));
	
	public static final Target TRIP_TYPE = Target.the("Trip type").locatedBy("//input[@value='{0}']");	
	public static final Target PASS_COUNT = Target.the("Passenger count").located(By.name("passCount"));
	public static final Target FROM_PORT = Target.the("Flight departure city").located(By.name("fromPort"));
	public static final Target FROM_MONTH = Target.the("Flight departure month").located(By.name("fromMonth"));
	public static final Target FROM_DAY = Target.the("Flight departure day").located(By.name("fromDay"));
	public static final Target TO_PORT = Target.the("Flight destination city").located(By.name("toPort"));
	public static final Target TO_MONTH = Target.the("Flight return month").located(By.name("toMonth"));
	public static final Target TO_DAY = Target.the("Flight return day").located(By.name("toDay"));
	public static final Target SERVICE_CLASS = Target.the("Service class").locatedBy("//input[@value='{0}']");
	public static final Target AIRLINE = Target.the("Airline").located(By.name("airline"));
	public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.name("findFlights"));
}
