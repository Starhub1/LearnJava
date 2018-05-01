package com.examples;

import org.testng.annotations.Test;

public class UserTest1 extends UserTest{
	
	@Test
	public void checkdefaultscope() {
		System.out.println("check default scoper : " + a);
		display();
	}

}
