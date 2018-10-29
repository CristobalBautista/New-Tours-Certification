package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

	/** UI donde se mapean los elementos de la pagina principal de New Tours. 
	 * <p>
	 * Se mapean los botones de login y de ingreso a la pagina de registro, las areas de texto para usuario y contraseña.<br>
	 * Se mapea el formulario de login para certificar que ha cargado la pagina.
	 */

@DefaultUrl("http://newtours.demoaut.com/") // Con la URL por defecto, se va a la pagina principal de New Tours
public class NewToursHomePage extends PageObject{
		
	public static final Target REGISTER_PAGE_BUTTON = Target.the("Register page button").locatedBy("//a[contains(text(),'REGISTER')]");
	public static final Target USERNAME = Target.the("Username").located(By.name("userName"));
	public static final Target PASSWORD = Target.the("Password").located(By.name("password"));
	public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.name("login"));
	public static final Target LOGIN_FORM = Target.the("Login form").locatedBy("//*[@name = 'home']/table/tbody/tr[4]");
}
