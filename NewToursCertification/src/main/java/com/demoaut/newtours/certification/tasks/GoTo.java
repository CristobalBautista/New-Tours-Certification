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

public class GoTo implements Task{
	
	private Target newToursPage; // Target con el que se define la pestaña de New Tours a la que se desea ir
	
	public GoTo (Target newToursPage) { // Constructor de la TAREA para llevar el Target recibido al Target que se maneja internamente en la clase
		this.newToursPage = newToursPage;
	}

	@Override
	@Step ("")
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Click.on(newToursPage));
		actor.should(seeThat(the(NewToursRegisterPage.REGISTER_BUTTON), isCurrentlyVisible())
				.orComplainWith(NoConnectionException.class, NoConnectionException.MESSAGE_CONNECTION_FAILED));
	}
	
	public static GoTo thePage(Target newToursPage) {
		return instrumented(GoTo.class, newToursPage);
	}

}