package com.demoaut.newtours.certification.questions;

import com.demoaut.newtours.certification.ui.NewToursRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class theNote implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(NewToursRegisterPage.REGISTER_NOTE).viewedBy(actor).asString();		
	}

	public static Question<String> displayed() {
		return new theNote();
	}
	

}
