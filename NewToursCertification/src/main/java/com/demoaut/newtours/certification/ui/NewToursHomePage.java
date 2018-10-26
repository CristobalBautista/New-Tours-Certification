package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/") // Con la URL por defecto, se va a la pagina principal de New Tours
public class NewToursHomePage extends PageObject{
	
	// Mapeo del boton que da ingreso a la pagina de registro de New Tours
	public static final Target REGISTER_PAGE_BUTTON = Target.the("Register page button").locatedBy("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]");
	// Mapeo de las areas de texto para el ingreso del usuario y contraseña
	public static final Target USERNAME = Target.the("Username").located(By.name("userName"));
	public static final Target PASSWORD = Target.the("Password").located(By.name("password"));
	// Mapeo del boton de login
	public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.name("login"));
	
	// Mapeo del formulario de login en la pagina principal de New Tours
	public static final Target LOGIN_FORM = Target.the("Login form").locatedBy("//*[@name = 'home']/table/tbody/tr[4]");
}
