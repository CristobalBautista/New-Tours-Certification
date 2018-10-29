package com.demoaut.newtours.certification.questions;

import static net.serenitybdd.screenplay.questions.Visibility.of;

import com.demoaut.newtours.certification.ui.NewToursFlightSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

	/** Pregunta donde se verifica que la ventana de busqueda de vuelo aparezca luego del logueo.
	* <p>
	* Se devuelve un objeto Question tipo Boolean, en el cual se verifico la visibilidad de la ventana de busqueda de vuelos. 
	*/

public class theFlightSearch implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return of(NewToursFlightSearchPage.FLIGHT_SEARCH_FORMAT).viewedBy(actor).asBoolean();
	}

	public static Question<Boolean> windowIsDisplayed() {		
		return new theFlightSearch();
	}
	
	

}
