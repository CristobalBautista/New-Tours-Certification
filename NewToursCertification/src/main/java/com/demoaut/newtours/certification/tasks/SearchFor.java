package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.certification.models.FlightSearchModel;
import com.demoaut.newtours.certification.ui.NewToursFlightSearchPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SearchFor implements Task{
	
	private FlightSearchModel flightSearchModel;

	public SearchFor(FlightSearchModel flightSearchModel) {
		this.flightSearchModel = flightSearchModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {	
		actor.attemptsTo(
				Click.on(NewToursFlightSearchPage.TRIP_TYPE.of(flightSearchModel.gettripType())),
				SelectFromOptions.byVisibleText(flightSearchModel.getpassCount()).from(NewToursFlightSearchPage.PASS_COUNT),
				SelectFromOptions.byVisibleText(flightSearchModel.getfromPort()).from(NewToursFlightSearchPage.FROM_PORT),
				SelectFromOptions.byVisibleText(flightSearchModel.getfromMonth()).from(NewToursFlightSearchPage.FROM_MONTH),
				SelectFromOptions.byVisibleText(flightSearchModel.getfromDay()).from(NewToursFlightSearchPage.FROM_DAY),
				SelectFromOptions.byVisibleText(flightSearchModel.gettoPort()).from(NewToursFlightSearchPage.TO_PORT),
				SelectFromOptions.byVisibleText(flightSearchModel.gettoMonth()).from(NewToursFlightSearchPage.TO_MONTH),
				SelectFromOptions.byVisibleText(flightSearchModel.gettoDay()).from(NewToursFlightSearchPage.TO_DAY),
				Click.on(NewToursFlightSearchPage.SERVICE_CLASS.of(flightSearchModel.getservClass())),
				SelectFromOptions.byVisibleText(flightSearchModel.getairline()).from(NewToursFlightSearchPage.AIRLINE),
				Click.on(NewToursFlightSearchPage.CONTINUE_BUTTON));
	}

	public static SearchFor aFlightWith(FlightSearchModel flightSearchModel) {
		return instrumented(SearchFor.class, flightSearchModel);
	}

}
