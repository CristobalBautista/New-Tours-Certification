package com.demoaut.newtours.certification.models;

	/** Modelo para almacenar los datos de usuario y contraseña, en las pruebas de Login.
	 * <p>
	 * Los datos almacenados son userName y password*/

public class LoginModel {

	private String userName;
	private String password;

	public String getuserName() {
		return this.userName;
	}
	
	public String getpassword() {
		return this.password;
	}

}