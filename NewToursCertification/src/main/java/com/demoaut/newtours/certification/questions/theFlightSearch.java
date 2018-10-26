package com.demoaut.newtours.certification.questions;

import static net.serenitybdd.screenplay.questions.Visibility.of;

import com.demoaut.newtours.certification.ui.NewToursFlightSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class theFlightSearch implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return of(NewToursFlightSearchPage.FLIGHT_SEARCH_FORMAT).viewedBy(actor).asBoolean();
	}

	public static Question<Boolean> windowIsDisplayed() {		
		return new theFlightSearch();
	}
	
	

}
