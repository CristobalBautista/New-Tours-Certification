package com.demoaut.newtours.certification.tasks;

import com.demoaut.newtours.certification.models.LoginModel;
import com.demoaut.newtours.certification.ui.NewToursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;;

public class Login implements Task{

	private LoginModel loginModel;
	
	public Login (LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(loginModel.getuserName()).into(NewToursHomePage.USERNAME),
				Enter.theValue(loginModel.getpassword()).into(NewToursHomePage.PASSWORD),
				Click.on(NewToursHomePage.LOGIN_BUTTON));
	}

	public static Login withHis(LoginModel loginModel) {		
		return instrumented(Login.class, loginModel);
	}

}
