package com.demoaut.newtours.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

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

public class NewToursRegisterStepDefinitions {

	@Managed (driver = "chrome", uniqueSession = true) // Anotación para manejar el navegador Chrome
	private WebDriver hisBrowser; // Instancia del objeto WebDriver, que se pasa al ACTOR para que este lo maneje
	
	private Actor diego = Actor.named("Diego"); // Aplicando Screenplay, se define el actor llamado "Diego"
	
	private NewToursHomePage newToursHomePage; // Se crea una instancia de la pagina New Tours para pasarla a la TAREA que abre el navegador
	
	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser)); // Se usa la habilidad del ACTOR para navegar con la instancia del objeto WebDriver
	}
	
	@Given("^that Diego wants to register on New Tours$") // Precondiciones de la prueba - Ingreso a la pagina de registro de New Tours
	public void thatDiegoWantsToRegisterOnNewTours() {
		diego.wasAbleTo(
				OpenTheBrowser.on(newToursHomePage), // El ACTOR abre el navegador en la pagina de New Tours en esta TAREA, con la instancia de la pagina creada anteriormente
				GoTo.thePage(NewToursHomePage.REGISTER_PAGE_BUTTON));  // El ACTOR se dirige a la pagina de registro en esta TAREA, llamando el Target mapeado 
	}

	@When("^he enters all of the next personal information$") // Ejecucion de la prueba - Ingreso de datos en la pagina de registro
	public void heEntersAllOfTheNextPersonalInformation(List<RegisterModel> information) { // Se reciben los datos del feature como una lista del modelo de Registro creado
		diego.attemptsTo(Register.his(information.get(0))); // El ACTOR registra su informacion dentro de los campos y presiona click para registrarse, en esta TAREA
	}

	@Then("^he should see a note with his \"([^\"]*)\"$") // Validación de la prueba - Verificación de un registro correcto
	public void heShouldSeeANoteWithHis(String username) { // Se revisa que se haya creado un userName correcto	
		diego.should(seeThat(theNote.displayed(), containsString(username))); // El ACTOR verifica que la nota en pantalla contenga su nombre de usuario
	}
}
