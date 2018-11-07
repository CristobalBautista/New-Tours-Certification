package com.demoaut.newtours.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.certification.models.LoginModel;
import com.demoaut.newtours.certification.questions.theFlightSearch;
import com.demoaut.newtours.certification.tasks.Login;
import com.demoaut.newtours.certification.tasks.OpenTheBrowser;
import com.demoaut.newtours.certification.ui.NewToursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

/** Clase que implementa los pasos de la prueba definida en el archivo NewToursLogin.feature, usando el patron Screenplay. 
 * 
 * Se define el objeto "hisBrowser" para manejar el navegador.
 * Se define el actor "diego", sobre el que se ejecutaran los comandos.
 * 
 * Se crea una instancia de la pagina New Tours para pasa a la tarea "OpenTheBrowser", la cual abre el navegador
 * 
 * Los datos de la prueba, definidos en el feature, se reciben como una lista del modelo Login creado en el paquete MODELS
 * 
 * Para verificar el ingreso correcto, se revisa que la ventana de busqueda de vuelo aparece
 * */

public class NewToursLoginStepDefinitions {
	
	@Managed (driver = "chrome") 
	private WebDriver hisBrowser; 
	
	private Actor diego = Actor.named("Diego"); 
	
	private NewToursHomePage newToursHomePage; 
	
	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser));
	}
	
	// Precondiciones de la prueba - Ingreso a la pagina de New Tours
	@Given("^that Diego wants to enters into the New Tours page$")
	public void thatDiegoWantsToEntersIntoTheNewToursPage() {
		diego.wasAbleTo(OpenTheBrowser.on(newToursHomePage));
	}

	// Ejecucion de la prueba - Ingreso de credenciales en la pagina de entrada
	@When("^he logins into the page with his credentials$") 
	public void heLoginsIntoThePageWithHisCredentials(List<LoginModel> credentials) {
		diego.attemptsTo(Login.withHis(credentials.get(0)));
	}
	
	// Validación de la prueba - Verificación de un login correcto
	@Then("^he should see in the screen the flight search window$") 
	public void heShouldSeeInTheScreenTheFlightSearchWindow() { 
		diego.should(seeThat(theFlightSearch.windowIsDisplayed()));
	}
}
