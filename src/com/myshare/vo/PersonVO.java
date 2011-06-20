package com.myshare.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class PersonVO implements Serializable{
	
	private String name = "";
    private String login_id;
    private String password = "";
    private String	email = "";
    private Number user_id;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Number getUser_id() {
		return user_id;
	}
	public void setUser_id(Number user_id) {
		this.user_id = user_id;
	}

}
