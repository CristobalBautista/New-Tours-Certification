package com.demoaut.newtours.certification.questions;

import static net.serenitybdd.screenplay.questions.Visibility.of;

import com.demoaut.newtours.certification.ui.NewToursFlightConfirmationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class theFlightConfirmation implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return of(NewToursFlightConfirmationPage.FLIGHT_CONFIRMATION).viewedBy(actor).asBoolean();
	}

	public static Question<Boolean> messageIsDisplayed() {
		return new theFlightConfirmation();
	}
}
