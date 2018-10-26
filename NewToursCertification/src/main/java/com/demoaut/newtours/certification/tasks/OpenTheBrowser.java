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
import net.serenitybdd.screenplay.actions. Open;
import net.thucydides.core.annotations.Step;;

public class OpenTheBrowser implements Task { // TAREA que Abre el navegador y se dirige a la pagina Web indicada

	private PageObject page; // PageObject
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} opens the Browser on the given page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
		actor.should(seeThat(the(NewToursHomePage.LOGIN_FORM), isCurrentlyVisible())
				.orComplainWith(NoConnectionException.class, NoConnectionException.MESSAGE_PAGE_NOT_LOADED));
	}
	
	public static OpenTheBrowser on(PageObject page) { 
		return instrumented(OpenTheBrowser.class, page);
	}

}
