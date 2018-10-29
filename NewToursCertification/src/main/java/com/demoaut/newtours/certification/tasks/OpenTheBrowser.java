package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.demoaut.newtours.certification.exceptions.NoConnectionException;
import com.demoaut.newtours.certification.ui.NewToursHomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

	/** Tarea donde se abre el navegador y se dirige a la pagina web ingresada como parametro.
	 * <p>
	 *  En caso que no abra el navegador y se cargue la pagina, se realiza manejo de excepciones.
	 */

public class OpenTheBrowser implements Task { 

	private PageObject page; // Variable que maneja el objecto PageObject recibido como parametro en el constructor
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} opens the Browser on the given page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));  // Se hace uso de la accion OPEN para abrir el navegador en la pagina web dada
		
		// Manejo de excepciones, en caso que el formulario de login no se cargue correctamente
		actor.should(seeThat(the(NewToursHomePage.LOGIN_FORM), isCurrentlyVisible())
				.orComplainWith(NoConnectionException.class, NoConnectionException.MESSAGE_PAGE_NOT_LOADED));
	}
	
	public static OpenTheBrowser on(PageObject page) { 
		return instrumented(OpenTheBrowser.class, page);
	}

}
