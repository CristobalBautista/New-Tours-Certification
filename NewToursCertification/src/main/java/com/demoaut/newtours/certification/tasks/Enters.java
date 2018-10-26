package com.demoaut.newtours.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.certification.models.RegisterModel;
import com.demoaut.newtours.certification.ui.NewToursRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class Enters implements Task{ // Tarea para ingresar la informacion de registro del usuario en los campos

	private RegisterModel registerModel; // Instancia 

	public Enters (RegisterModel registerModel) {
		this.registerModel = registerModel;
	}
	
	@Step("{0} has entered the register values")
	@Override	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(registerModel.getfirstName()).into(NewToursRegisterPage.FIRST_NAME),
				Enter.theValue(registerModel.getlastName()).into(NewToursRegisterPage.LAST_NAME),
				Enter.theValue(registerModel.getphone()).into(NewToursRegisterPage.PHONE),
				Enter.theValue(registerModel.getemail()).into(NewToursRegisterPage.USER_NAME),
				Enter.theValue(registerModel.getaddress1()).into(NewToursRegisterPage.ADDRESS1),
				Enter.theValue(registerModel.getaddress2()).into(NewToursRegisterPage.ADDRESS2),
				Enter.theValue(registerModel.getcity()).into(NewToursRegisterPage.CITY),
				Enter.theValue(registerModel.getstate()).into(NewToursRegisterPage.STATE),
				Enter.theValue(registerModel.getpostalCode()).into(NewToursRegisterPage.POSTAL_CODE),
				SelectFromOptions.byVisibleText(registerModel.getcountry()).from(NewToursRegisterPage.COUNTRY),
				Enter.theValue(registerModel.getuserName()).into(NewToursRegisterPage.EMAIL),				
				Enter.theValue(registerModel.getpassword()).into(NewToursRegisterPage.PASSWORD),
				Enter.theValue(registerModel.getconfirmPassword()).into(NewToursRegisterPage.CONFIRM_PASSWORD),
				Click.on(NewToursRegisterPage.REGISTER_BUTTON)				
				);
	}
	
	public static Enters the (RegisterModel registerModel) {
		return instrumented(Enters.class, registerModel);		
	}

}
