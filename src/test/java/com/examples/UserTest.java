package com.examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.domainentities.User;

public class UserTest {
	
	String a = "test";
	String A ="test";
	
	void Display() {
		boolean b = Boolean.TRUE;
		System.out.println(b);
	}
	
	void display() {
		System.out.println("THis is a default method");
		char a = '\u0026';
		System.out.println(a);
	}

	@Test
	public void canConstructaNewUser() {
		User user = new User();
		assertEquals(user.getusername(), "username");
		assertEquals(user.getpassword(), "password");
	}
	
	@Test
	public void canConstructaNewUserwithParameter() {
		User user = new User("aone","bone");
		assertEquals(user.getusername(),"aone");
		assertEquals(user.getpassword(),"bone");
	}
	
	@Test
	public void canSetPasswordAfterconstructed() {
		User user = new User();
		user.setpassword("12345");
		assertEquals(user.getpassword(), "12345");
	}
}
