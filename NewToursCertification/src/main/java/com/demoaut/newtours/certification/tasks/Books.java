package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.certification.models.FlightBookingModel;
import com.demoaut.newtours.certification.ui.NewToursFlightBookingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;;

public class Books implements Task{
	
	private FlightBookingModel flightBookingModel;
	private WebDriver hisBrowser;
	
	public Books (FlightBookingModel flightBookingModel, WebDriver hisBrowser) {
		this.flightBookingModel = flightBookingModel;
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(flightBookingModel.getpassFirst0()).into(NewToursFlightBookingPage.FIRST_NAME_PASS0),
				Enter.theValue(flightBookingModel.getpassLast0()).into(NewToursFlightBookingPage.LAST_NAME_PASS0),
				SelectFromOptions.byVisibleText(flightBookingModel.getpass_0_meal()).from(NewToursFlightBookingPage.PASS_MEAL_0));
		
		int passengers = Integer.valueOf(flightBookingModel.getpassCount());		
		int count = 1;
		while (passengers != count) {		
			count++;
			if (count == 2) {
				actor.attemptsTo(
						Enter.theValue(flightBookingModel.getpassFirst1()).into(NewToursFlightBookingPage.FIRST_NAME_PASS1),
						Enter.theValue(flightBookingModel.getpassLast1()).into(NewToursFlightBookingPage.LAST_NAME_PASS1),
						SelectFromOptions.byVisibleText(flightBookingModel.getpass_1_meal()).from(NewToursFlightBookingPage.PASS_MEAL_1));
			}
			if (count == 3) {
				actor.attemptsTo(
						Enter.theValue(flightBookingModel.getpassFirst2()).into(NewToursFlightBookingPage.FIRST_NAME_PASS2),
						Enter.theValue(flightBookingModel.getpassLast2()).into(NewToursFlightBookingPage.LAST_NAME_PASS2),
						SelectFromOptions.byVisibleText(flightBookingModel.getpass_2_meal()).from(NewToursFlightBookingPage.PASS_MEAL_2));
			}
			if (count == 4) {
				actor.attemptsTo(
						Enter.theValue(flightBookingModel.getpassFirst3()).into(NewToursFlightBookingPage.FIRST_NAME_PASS3),
						Enter.theValue(flightBookingModel.getpassLast3()).into(NewToursFlightBookingPage.LAST_NAME_PASS3),
						SelectFromOptions.byVisibleText(flightBookingModel.getpass_3_meal()).from(NewToursFlightBookingPage.PASS_MEAL_3));
			}
		}
		
		actor.attemptsTo(
				SelectFromOptions.byVisibleText(flightBookingModel.getcreditCard()).from(NewToursFlightBookingPage.CREDIT_CARD_TYPE),
				Enter.theValue(flightBookingModel.getcreditnumber()).into(NewToursFlightBookingPage.CREDIT_CARD_NUMBER),
				SelectFromOptions.byVisibleText(flightBookingModel.getcc_exp_dt_mn()).from(NewToursFlightBookingPage.CREDIT_CARD_EXP_MONTH),
				SelectFromOptions.byVisibleText(flightBookingModel.getcc_exp_dt_yr()).from(NewToursFlightBookingPage.CREDIT_CARD_EXP_YEAR),
				Enter.theValue(flightBookingModel.getcc_frst_name()).into(NewToursFlightBookingPage.CREDIT_CARD_FIRST_NAME),
				Enter.theValue(flightBookingModel.getcc_mid_name()).into(NewToursFlightBookingPage.CREDIT_CARD_MID_NAME),
				Enter.theValue(flightBookingModel.getcc_last_name()).into(NewToursFlightBookingPage.CREDIT_CARD_LAST_NAME),
				
				Enter.theValue(flightBookingModel.getbillAddress1()).into(NewToursFlightBookingPage.BILLING_ADDRESS1),
				Enter.theValue(flightBookingModel.getbillAddress2()).into(NewToursFlightBookingPage.BILLING_ADDRESS2),
				Enter.theValue(flightBookingModel.getbillCity()).into(NewToursFlightBookingPage.BILLING_CITY),
				Enter.theValue(flightBookingModel.getbillState()).into(NewToursFlightBookingPage.BILLING_STATE),
				Enter.theValue(flightBookingModel.getbillZip()).into(NewToursFlightBookingPage.BILLING_ZIP),
				SelectFromOptions.byVisibleText(flightBookingModel.getbillCountry()).from(NewToursFlightBookingPage.BILLING_COUNTRY),
				
				Enter.theValue(flightBookingModel.getdelAddress1()).into(NewToursFlightBookingPage.DELIVERY_ADDRESS1),
				Enter.theValue(flightBookingModel.getdelAddress2()).into(NewToursFlightBookingPage.DELIVERY_ADDRESS2),
				Enter.theValue(flightBookingModel.getdelCity()).into(NewToursFlightBookingPage.DELIVERY_CITY),
				Enter.theValue(flightBookingModel.getdelState()).into(NewToursFlightBookingPage.DELIVERY_STATE),
				Enter.theValue(flightBookingModel.getdelZip()).into(NewToursFlightBookingPage.DELIVERY_ZIP),
				SelectFromOptions.byVisibleText(flightBookingModel.getdelCountry()).from(NewToursFlightBookingPage.DELIVERY_COUNTRY));
		if (flightBookingModel.getdelCountry() != "UNITED STATES") {
			hisBrowser.switchTo().alert().accept();
		}
		actor.attemptsTo(Click.on(NewToursFlightBookingPage.PURCHASE_BUTTON));		
	}

	public static Books theFlightsWithHis(FlightBookingModel flightBookingModel, WebDriver hisBrowser) {
		return instrumented(Books.class, flightBookingModel, hisBrowser);
	}

}
