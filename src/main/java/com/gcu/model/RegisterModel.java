package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterModel {
	

	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=20, message="Your first name must be between 1 and 32 characters long!")
	private String userFirstName;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=20, message="Your last name must be between 1 and 32 characters long!")
	private String userLastName;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=50, message="Your email must be between 1 and 50 characters long!")
	private String userEmail;

	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="Your user name must be between 1 and 32 characters long!")
	private String userUserName;

	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="Your password must be between 1 and 32 characters long!")
	private String userPassword;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="Your re-enter password must be between 1 and 32 characters long!")
	private String userRePassword;
	
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=10, max=10, message="Your phone number must be contain 10 characters, (only numbers please)!")
	private String userPhoneNumber;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=4, max=60, message="Your address must be between 4 and 60 characters long!")
	private String userAddress1;
	
	@Size(min=0, max=60, message="Your address2 must be between 0 and 60 characters long!")
	private String userAddress2;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=1, max=32, message="Your city must be between 1 and 32 characters long!")
	private String userCity;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=4, max=14, message="Your state must be between 1 and 14 characters long!")
	private String userState;
	
	@NotNull(message="User name field cannot be empty!")
	@Size(min=5, max=5, message="Your zipcode must be between 5 characters long!")
	private String userZip;
	
	
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
	
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress1() {
		return userAddress1;
	}

	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserZip() {
		return userZip;
	}

	public void setUserZip(String userZip) {
		this.userZip = userZip;
	}

	
}