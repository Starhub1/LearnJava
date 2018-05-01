package com.domainentities;

public class User {
	
	private static String username;
	private static String password;
	
	public User(){
		this("username","password");
	}
	
	public User(String username,String password) {
		this.username = username;
		this.password = password;
	}

	public String getusername() {
		return username;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password=password;
	}
}
