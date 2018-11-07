package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.certification.ui.NewToursFlightConfirmationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LogOut implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NewToursFlightConfirmationPage.LOG_OUT_BUTTON));
	}

	public static LogOut ofHisAccount() {
		return instrumented(LogOut.class);
	}
	
}
