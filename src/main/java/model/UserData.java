package model;

public class UserData {

	private String userLastName;
	
	private String userEmail;
	private String userUserName;
	private String userPassword;
	private String userRePassword;
	
	
	public UserData(String userLastName, String userEmail, String userUserName, String userPassword,
			String userRePassword, String userFisrtName) {
		super();
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userUserName = userUserName;
		this.userPassword = userPassword;
		this.userRePassword = userRePassword;
		this.userFisrtName = userFisrtName;
	}
	
	private String userFisrtName;
	public String getUserFisrtName() {
		return userFisrtName;
	}
	public void setUserFisrtName(String userFisrtName) {
		this.userFisrtName = userFisrtName;
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
