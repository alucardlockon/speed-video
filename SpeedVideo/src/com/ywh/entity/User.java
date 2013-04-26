package com.ywh.entity;

import java.util.Date;
import java.util.List;

public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String gender;
	private String intro;
	private String photo;
	private int rights;
	private Date last_login;
	private Date regist_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getRights() {
		return rights;
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date lastLogin) {
		last_login = lastLogin;
	}

	public Date getRegist_date() {
		return regist_date;
	}

	public void setRegist_date(Date registDate) {
		regist_date = registDate;
	}

}
