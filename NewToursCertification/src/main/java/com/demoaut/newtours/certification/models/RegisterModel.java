package com.demoaut.newtours.certification.models;

	/** Modelo para almacenar los datos de registro, en las pruebas de Register.
	 * <p>
	 * Los datos almacenados son firstName, lastName, phone, email, address1, address2, city, state, postalCode, country,
	 * userName, password and confirmPassword*/

public class RegisterModel {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String userName;
	private String password;
	private String confirmPassword;
	
	public String getfirstName() {
		return this.firstName;
	}
	
	public String getlastName() {
		return this.lastName;
	}
	
	public String getphone() {
		return this.phone;
	}
	
	public String getemail() {
		return this.email;
	}
	
	public String getaddress1() {
		return this.address1;
	}
	
	public String getaddress2() {
		return this.address2;
	}
	
	public String getcity() {
		return this.city;
	}
	
	public String getstate() {
		return this.state;
	}
	
	public String getpostalCode() {
		return this.postalCode;
	}
	
	public String getcountry() {
		return this.country;
	}
	
	public String getuserName() {
		return this.userName;
	}
	
	public String getpassword() {
		return this.password;
	}
	
	public String getconfirmPassword() {
		return this.confirmPassword;
	}		
}
