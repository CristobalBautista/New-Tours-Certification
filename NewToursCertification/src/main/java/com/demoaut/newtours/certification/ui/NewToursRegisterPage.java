package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

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
	
	public static final Target REGISTER_NOTE = Target.the("Register note result").locatedBy("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b");
}
