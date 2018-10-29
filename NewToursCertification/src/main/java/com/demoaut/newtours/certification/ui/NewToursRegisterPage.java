package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

/** UI donde se mapean los elementos de la pagina de registro de New Tours. 
 * <p>
 * Se mapean las areas de texto para cada uno de los elementos a ingresar y el boton de enviar informacion.<br>
 * Se mapea la nota donde se indica el nombre de usuario, para verificar que se creo un usuario correcto.
 */

public class NewToursRegisterPage {
	
	public static final Target FIRST_NAME = Target.the("First name").located(By.name("firstName"));	
	public static final Target LAST_NAME = Target.the("Last name").located(By.name("lastName"));
	public static final Target PHONE = Target.the("Phone").located(By.name("phone"));
	public static final Target EMAIL = Target.the("Email").located(By.name("email"));
	public static final Target ADDRESS1 = Target.the("Address 1").located(By.name("address1"));
	public static final Target ADDRESS2 = Target.the("Address 2").located(By.name("address2"));
	public static final Target CITY = Target.the("City").located(By.name("city"));
	public static final Target STATE = Target.the("State").located(By.name("state"));
	public static final Target POSTAL_CODE = Target.the("Postal code").located(By.name("postalCode"));
	public static final Target COUNTRY = Target.the("Country").located(By.name("country"));
	public static final Target USER_NAME = Target.the("User Name").located(By.name("userName"));
	public static final Target PASSWORD = Target.the("Password").located(By.name("password"));
	public static final Target CONFIRM_PASSWORD = Target.the("Confirm password").located(By.name("confirmPassword"));
	public static final Target REGISTER_BUTTON = Target.the("Register button").located(By.name("register"));
	
	public static final Target REGISTER_NOTE = Target.the("Register note result").locatedBy("//b[contains(text(),'Note:')]");
}
