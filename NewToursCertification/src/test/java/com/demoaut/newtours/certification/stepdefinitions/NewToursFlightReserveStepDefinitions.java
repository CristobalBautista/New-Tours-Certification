package com.demoaut.newtours.certification.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.certification.models.FlightBookingModel;
import com.demoaut.newtours.certification.models.FlightSearchModel;
import com.demoaut.newtours.certification.models.FlightSelectModel;
import com.demoaut.newtours.certification.models.LoginModel;
import com.demoaut.newtours.certification.questions.theFlightConfirmation;
import com.demoaut.newtours.certification.tasks.Books;
import com.demoaut.newtours.certification.tasks.LogOut;
import com.demoaut.newtours.certification.tasks.Login;
import com.demoaut.newtours.certification.tasks.OpenTheBrowser;
import com.demoaut.newtours.certification.tasks.SearchFor;
import com.demoaut.newtours.certification.tasks.Select;
import com.demoaut.newtours.certification.ui.NewToursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NewToursFlightReserveStepDefinitions {
	
	@Managed (driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor diego = Actor.named("Diego");
	
	private NewToursHomePage newToursHomePage;

	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Diego logins into the New Tours page with his credentials$")
	public void thatDiegoLoginsIntoTheNewToursPageWithHisCredentials(List<LoginModel> credentials) {
		diego.wasAbleTo(
				OpenTheBrowser.on(newToursHomePage),
				Login.withHis(credentials.get(0)));
	}

	@When("^he searches for a flight with the next filters$")
	public void heSearchesForAFlightWithTheNextFilters(List<FlightSearchModel> flightFilters) {
		diego.attemptsTo(SearchFor.aFlightWith(flightFilters.get(0)));
	}

	@When("^he selects the departure flight and the return flight$")
	public void heSelectsTheDepartureFlightAndTheReturnFlight(List<FlightSelectModel> flights){
		diego.attemptsTo(Select.the(flights.get(0)));
	}
	
	@When("^he books the flight with the next personal information$")
	public void heBooksTheFlightWithTheNextPersonalInformation(List<FlightBookingModel> travelInformationIn) {
		diego.attemptsTo(Books.theFlightsWithHis(travelInformationIn.get(0), hisBrowser));
	}

	@Then("^he should see in the screen the flight confirmation message$")
	public void heShouldSeeInTheScreenTheFlightConfirmationMessage() {
		diego.should(seeThat(theFlightConfirmation.messageIsDisplayed()));
		diego.attemptsTo(LogOut.ofHisAccount());
	}
}
