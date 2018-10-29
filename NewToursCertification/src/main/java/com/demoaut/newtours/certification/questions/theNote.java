package com.demoaut.newtours.certification.questions;

import com.demoaut.newtours.certification.ui.NewToursRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

	/** Pregunta donde se verifica la nota mostrada en pantalla luego del registro.
	 * <p>
	 * Se devuelve un objeto Question tipo String, el cual contiene el texto de la nota.
	 */

public class theNote implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(NewToursRegisterPage.REGISTER_NOTE).viewedBy(actor).asString();		
	}

	public static Question<String> displayed() {
		return new theNote();
	}
	

}
