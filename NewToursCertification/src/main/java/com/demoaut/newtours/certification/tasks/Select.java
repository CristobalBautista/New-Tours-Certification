package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.certification.models.FlightSelectModel;
import com.demoaut.newtours.certification.ui.NewToursFlightSelectPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task{
	
	private FlightSelectModel flightSelectModel;

	public Select(FlightSelectModel flightSelectModel) {
		this.flightSelectModel = flightSelectModel;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(NewToursFlightSelectPage.OUT_FLIGHT.of(flightSelectModel.getoutFlight())),
				Click.on(NewToursFlightSelectPage.IN_FLIGHT.of(flightSelectModel.getinFlight())),
				Click.on(NewToursFlightSelectPage.CONTINUE_BUTTON));
	}

	public static Select the(FlightSelectModel flightSelectModel) {
		return instrumented(Select.class, flightSelectModel);
	}
}