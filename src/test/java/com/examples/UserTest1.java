package com.examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.domainentities.User;

public class UserTest1 extends UserTest {

	@Test
	public void Users() {
		User[] users = new User[100];
		for (int i = 0; i < 100; i++) {
			int userid = i + 1;
			users[i] = new User("user" + userid, "password" + userid);

		}
		for (User aUser : users) {
			System.out.println(aUser.getusername() + ", " + aUser.getpassword());
		}
	}

	@Test
	public void checkdefaultscope() {
		System.out.println("check default scoper : " + a);
		display();
	}

	@Test
	public void checkCountryName() {
		assertEquals(getShortCode("usa"), "United States");
	}

	public String getShortCode(String code) {
		String country;
		switch (code.toLowerCase()) {
		case "uk":
			country = "United Kingdom";
			break;
		case "us":
		case "usa":
			country = "United States";
			break;
		case "fr":
			country = "France";
			break;
		case "SE":
			country = "Sweden";
			break;
		default:
			country = "Rest of the World";
			break;
		}

		return country;

	}

	@Test
	public void checkNumAsString() {
		int[] a;
		a = new int[] { 2, 3, 4 };
		assertEquals(getNumasString(4), "Four");
	}

	public String getNumasString(int num) {
		String n;

		switch (num) {
		case 1:
			n = "One";
			break;
		case 2:
			n = "Two";
			break;
		case 3:
			n = "Three";
			break;
		case 4:
			n = "Four";
			break;
		default:
			if (num < 1)
				n = "Two small";
			else
				n = "Too Big";
			break;

		}

		return n;
	}

}
