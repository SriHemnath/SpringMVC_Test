package com.biju.model;

/**
 * @author Hemnath
 *
 */
public class UserModel {

	private String userName;
	private String userPassword;
	private UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserModel [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
