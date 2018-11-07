package com.demoaut.newtours.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class NewToursFlightBookingPage {

	public static final Target FIRST_NAME_PASS0 = Target.the("Passenger 1 first name").located(By.name("passFirst0"));
	public static final Target LAST_NAME_PASS0 = Target.the("Passenger 1 last name").located(By.name("passLast0"));
	public static final Target PASS_MEAL_0 = Target.the("Passenger 1 meal").located(By.name("pass.0.meal"));
	public static final Target FIRST_NAME_PASS1 = Target.the("Passenger 2 first name").located(By.name("passFirst1"));
	public static final Target LAST_NAME_PASS1 = Target.the("Passenger 2 last name").located(By.name("passLast1"));
	public static final Target PASS_MEAL_1 = Target.the("Passenger 2 meal").located(By.name("pass.1.meal"));
	public static final Target FIRST_NAME_PASS2 = Target.the("Passenger 3 first name").located(By.name("passFirst2"));
	public static final Target LAST_NAME_PASS2 = Target.the("Passenger 3 last name").located(By.name("passLast2"));
	public static final Target PASS_MEAL_2 = Target.the("Passenger 3 meal").located(By.name("pass.2.meal"));
	public static final Target FIRST_NAME_PASS3 = Target.the("Passenger 4 first name").located(By.name("passFirst3"));
	public static final Target LAST_NAME_PASS3 = Target.the("Passenger 4 last name").located(By.name("passLast3"));
	public static final Target PASS_MEAL_3 = Target.the("Passenger 4 meal").located(By.name("pass.3.meal"));
	
	public static final Target CREDIT_CARD_TYPE = Target.the("Credit card type").located(By.name("creditCard"));
	public static final Target CREDIT_CARD_NUMBER = Target.the("Credit card number").located(By.name("creditnumber"));
	public static final Target CREDIT_CARD_EXP_MONTH = Target.the("Credit card expiration month").located(By.name("cc_exp_dt_mn"));
	public static final Target CREDIT_CARD_EXP_YEAR = Target.the("Credit card expiration year").located(By.name("cc_exp_dt_yr"));
	public static final Target CREDIT_CARD_FIRST_NAME = Target.the("Credit card first name").located(By.name("cc_frst_name"));
	public static final Target CREDIT_CARD_MID_NAME = Target.the("Credit card middle name").located(By.name("cc_mid_name"));
	public static final Target CREDIT_CARD_LAST_NAME = Target.the("Credit card last name").located(By.name("cc_last_name"));
	
	public static final Target BILLING_ADDRESS1 = Target.the("Billing address 1").located(By.name("billAddress1"));
	public static final Target BILLING_ADDRESS2 = Target.the("Billing address 2").located(By.name("billAddress2"));
	public static final Target BILLING_CITY = Target.the("Billing city").located(By.name("billCity"));
	public static final Target BILLING_STATE = Target.the("Billing state").located(By.name("billState"));
	public static final Target BILLING_ZIP = Target.the("Billing postal code").located(By.name("billZip"));
	public static final Target BILLING_COUNTRY = Target.the("Billing country").located(By.name("billCountry"));
	
	public static final Target DELIVERY_ADDRESS1 = Target.the("Delivery address 1").located(By.name("delAddress1"));
	public static final Target DELIVERY_ADDRESS2 = Target.the("Delivery address 2").located(By.name("delAddress2"));
	public static final Target DELIVERY_CITY = Target.the("Delivery city").located(By.name("delCity"));
	public static final Target DELIVERY_STATE = Target.the("Delivery state").located(By.name("delState"));
	public static final Target DELIVERY_ZIP = Target.the("Delivery postal code").located(By.name("delZip"));
	public static final Target DELIVERY_COUNTRY = Target.the("Delivery country").located(By.name("delCountry"));
	
	public static final Target PURCHASE_BUTTON = Target.the("Purchase button").located(By.name("buyFlights"));
}