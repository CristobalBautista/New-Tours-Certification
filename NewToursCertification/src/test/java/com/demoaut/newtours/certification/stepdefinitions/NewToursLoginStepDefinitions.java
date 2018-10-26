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

public class NewToursLoginStepDefinitions {

	@Managed (driver = "chrome") // Anotación para manejar el navegador Chrome
	private WebDriver hisBrowser; // Instancia del objeto WebDriver, que se pasa al ACTOR para que este lo maneje
	
	private Actor diego = Actor.named("Diego"); // Aplicando Screenplay, se define el actor llamado "Diego"
	
	private NewToursHomePage newToursHomePage; // Se crea una instancia de la pagina New Tours para pasarla a la TAREA que abre el navegador
	
	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser)); // Se usa la habilidad del ACTOR para navegar con la instancia del objeto WebDriver
	}
	
	@Given("^that Diego wants to enters into the New Tours page$") // Precondiciones de la prueba - Ingreso a la pagina de New Tours
	public void thatDiegoWantsToEntersIntoTheNewToursPage() {
		diego.wasAbleTo(OpenTheBrowser.on(newToursHomePage)); // El ACTOR abre el navegador en la pagina de New Tours en esta TAREA, con la instancia de la pagina creada anteriormente
	}

	@When("^he logins into the page with his credentials$") // Ejecucion de la prueba - Ingreso de credenciales en la pagina de entrada
	public void heLoginsIntoThePageWithHisCredentials(List<LoginModel> credentials) { // Se reciben los datos del feature como una lista del modelo de Login creado
		diego.attemptsTo(Login.withHis(credentials.get(0))); // El ACTOR ingresa su informacion de logueo e ingresa a New Tours, en esta TAREA
	}
	
	@Then("^he should see in the screen the flight search window$") // Validación de la prueba - Verificación de un login correcto
	public void heShouldSeeInTheScreenTheFlightSearchWindow() { // Se revisa que la ventana de busqueda de vuelo aparece
		diego.should(seeThat(theFlightSearch.windowIsDisplayed()));  // El ACTOR verifica que en la pantalla se observe el formulario de bsuqueda de vuelo
	}
}
