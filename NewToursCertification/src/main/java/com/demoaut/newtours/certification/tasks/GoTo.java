package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.demoaut.newtours.certification.exceptions.NoConnectionException;
import com.demoaut.newtours.certification.ui.NewToursRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

/** Tarea donde se dirige a una sub-pagina de la pagina principal, dando clic sobre un elemento.
* <p>
* En caso que no cargue la pagina de registro, se realiza manejo de excepciones.
*/

public class GoTo implements Task{
	
	/* Variable que maneja el objecto Target recibido como parametro en el constructor
	   Con el target definido, se dirige a la pagina de New Tours a la que se desea ir*/
	private Target newToursPage; 
	
	public GoTo (Target newToursPage) { 
		this.newToursPage = newToursPage;
	}

	@Override
	@Step ("{0} has clicked on a button to go to the register page")
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Click.on(newToursPage));
		actor.should(seeThat(the(NewToursRegisterPage.REGISTER_BUTTON), isCurrentlyVisible())
				.orComplainWith(NoConnectionException.class, NoConnectionException.MESSAGE_CONNECTION_FAILED));
	}
	
	public static GoTo thePage(Target newToursPage) {
		return instrumented(GoTo.class, newToursPage);
	}

}