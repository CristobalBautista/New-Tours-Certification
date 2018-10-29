package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

/** UI donde se mapean los elementos de la pagina de busqueda de vuelo de New Tours. 
 * <p>
 * Se mapea el formulario de busqueda de vuelo para certificar que ha cargado la pagina.
 */

public class NewToursFlightSearchPage {
	
	public static final Target FLIGHT_SEARCH_FORMAT = Target.the("Flight search format").located(By.name("findflight"));

}
