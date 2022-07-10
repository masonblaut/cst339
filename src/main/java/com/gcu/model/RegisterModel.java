package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterModel {
	
	

	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=20, message="User name must be between 1 and 32 characters long!")
	private String userFirstName;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=20, message="User name must be between 1 and 32 characters long!")
	private String userLastName;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="User name must be between 1 and 32 characters long!")
	private String userEmail;

	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="User name must be between 1 and 32 characters long!")
	private String userUserName;

	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="User name must be between 1 and 32 characters long!")
	private String userPassword;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="User name must be between 1 and 32 characters long!")
	private String userRePassword;
	
	
	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserUserName() {
		return userUserName;
	}

	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRePassword() {
		return userRePassword;
	}

	public void setUserRePassword(String userRePassword) {
		this.userRePassword = userRePassword;
	}
	
}