package com.biju.model;

public class TestModel {
	private String userName;
	private Integer loginid;
	private String pwd;
	
	private TestModel() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getLoginid() {
		return loginid;
	}

	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "TestModel [userName=" + userName + ", loginid=" + loginid + ", pwd=" + pwd + "]";
	}
	
}
