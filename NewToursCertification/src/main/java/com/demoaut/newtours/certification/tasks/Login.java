package com.demoaut.newtours.certification.tasks;

import com.demoaut.newtours.certification.models.LoginModel;
import com.demoaut.newtours.certification.ui.NewToursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;;

/** Tarea donde se realiza el login del usuario con sus credenciales.
* <p>
* Se ingresan los valores de usuario y contraseña en los campos respectivos, y se realiza click sobre el boton de ingreso.
*/

public class Login implements Task{

	private LoginModel loginModel; // Variable que maneja el objeto LoginModel recibido como parametro en el constructor
	
	public Login (LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	
	
	@Override
	@Step("{0} has entered all of the login values and click on the login button")
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