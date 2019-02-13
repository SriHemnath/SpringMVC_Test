package com.biju.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.sql.Array;
import java.sql.Date;


/**
 * The persistent class for the "userProfile" database table.
 * 
 */
@Entity
@Table(name="\"userProfile\"")
@NamedQuery(name="UserProfile.findAll", query="SELECT u FROM UserProfile u")
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"user_ID\"")
	private Integer user_ID;

	private String address;

	@Column(name="\"country_ID\"")
	private Integer country_ID;

	@Column(name="date_created")
	private Date dateCreated;

	@Column(name="date_modified")
	private Date dateModified;

	private Date dob;

	private Date doj;

	private String gender;

	@Column(name="\"login_ID\"")
	private Integer login_ID;

	@NotNull
	private String password;

	private String phone;

	@Column(name="\"role_ID\"")
	private Integer role_ID;

	@Column(name="\"user_Name\"")
	private String user_Name;

	public UserProfile() {
	}

	public Integer getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(Integer user_ID) {
		this.user_ID = user_ID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCountry_ID() {
		return country_ID;
	}

	public void setCountry_ID(Integer country_ID) {
		this.country_ID = country_ID;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getLogin_ID() {
		return login_ID;
	}

	public void setLogin_ID(Integer login_ID) {
		this.login_ID = login_ID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRole_ID() {
		return role_ID;
	}

	public void setRole_ID(Integer role_ID) {
		this.role_ID = role_ID;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	@Override
	public String toString() {
		return "UserProfile [user_ID=" + user_ID + ", address=" + address + ", country_ID=" + country_ID
				+ ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", dob=" + dob + ", doj=" + doj
				+ ", gender=" + gender + ", login_ID=" + login_ID + ", password=" + password + ", phone=" + phone
				+ ", role_ID=" + role_ID + ", user_Name=" + user_Name + "]";
	}

	

}