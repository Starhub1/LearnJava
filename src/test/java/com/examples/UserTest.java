package com.examples;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.domainentities.User;

public class UserTest {

	String a = "test";
	String A = "test";

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
	public void countCat() {
		assertEquals(catOrcats(1), "cat");
		assertEquals(catOrcats(2), "cats");
	}

	public String catOrcats(int num) {
		String c = num > 1 ? "cats" : "cat";
		return c;

	}

	@Test
	public void truthycheck() {
		assertTrue(trueOrFalse(true));
		assertFalse(trueOrFalse(false));
	}

	public boolean trueOrFalse(boolean b) {
		if (b)
			return true;
		else
			return false;
	}

	@Test
	public void canConstructaNewUser() {
		User user = new User();
		assertEquals(user.getusername(), "username");
		assertEquals(user.getpassword(), "password");
	}

	@Test
	public void canConstructaNewUserwithParameter() {
		User user = new User("aone", "bone");
		assertEquals(user.getusername(), "aone");
		assertEquals(user.getpassword(), "bone");
	}

	@Test
	public void canSetPasswordAfterconstructed() {
		User user = new User();
		user.setpassword("12345");
		assertEquals(user.getpassword(), "12345");
	}
	
	@Test
	public void truthyorfalsy() {
		boolean truthy = true;
		boolean falsy = true;
		
		if(truthy) {
			if(!falsy) {
				if(truthy && !falsy) {
					if(falsy || truthy) {
						assertTrue(truthy);
						assertFalse(falsy);
					}
				}
			}
			else {
				assertTrue(truthy);
				assertTrue(falsy);
			}
		}
		else {
			if(!truthy) {
				if(falsy) {
						assertFalse(truthy);
						assertTrue(falsy);
				}
			}
			else {
				assertFalse(truthy);
				assertFalse(falsy);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
