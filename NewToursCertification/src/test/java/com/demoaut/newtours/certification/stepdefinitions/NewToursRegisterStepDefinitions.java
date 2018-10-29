package com.demoaut.newtours.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.certification.models.RegisterModel;
import com.demoaut.newtours.certification.questions.theNote;
import com.demoaut.newtours.certification.tasks.GoTo;
import com.demoaut.newtours.certification.tasks.OpenTheBrowser;
import com.demoaut.newtours.certification.tasks.Register;
import com.demoaut.newtours.certification.ui.NewToursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

/** Clase que implementa los pasos de la la prueba definida en el archivo NewToursRegister.feature, usando el patron Screenplay. 
 * 
 * Se define el objeto "hisBrowser" para manejar el navegador.
 * Aplicando Screenplay, se define el actor llamado "Diego".
 * 
 * Se crea una instancia de la pagina New Tours para pasarla a la tarea "OpenTheBrowser", la cual abre el navegador.
 * El actor ingresa a la pagina de registro en la tarea "GoTo", llamando el target mapeado
 * 
 * Los datos de la prueba, definidos en el feature, se reciben como una lista del modelo Register creado en el paquete MODELS
 * Para verificar el correcto registro, se revisa que la nota en pantalla genere un nombre de usuario.*/

public class NewToursRegisterStepDefinitions {

	@Managed (driver = "chrome", uniqueSession = true)
	private WebDriver hisBrowser;
	
	private Actor diego = Actor.named("Diego");
	
	private NewToursHomePage newToursHomePage;
	
	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser));
	}
	
	// Precondiciones de la prueba - Ingreso a la pagina de registro de New Tours
	@Given("^that Diego wants to register on New Tours$")
	public void thatDiegoWantsToRegisterOnNewTours() {
		diego.wasAbleTo(
				OpenTheBrowser.on(newToursHomePage), 
				GoTo.thePage(NewToursHomePage.REGISTER_PAGE_BUTTON));
	}

	// Ejecucion de la prueba - Ingreso de datos en la pagina de registro
	@When("^he enters all of the next personal information$")
	public void heEntersAllOfTheNextPersonalInformation(List<RegisterModel> information) {
		diego.attemptsTo(Register.his(information.get(0)));
	}

	// Validación de la prueba - Verificación de un registro correcto
	@Then("^he should see a note with an userName$")
	public void heShouldSeeANoteWithAnUserName() {
		diego.should(seeThat(theNote.displayed(), is(not("Note: Your user name is ."))));
	}
}