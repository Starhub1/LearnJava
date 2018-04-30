package com.javaforTesters.LearnJava;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AclasswithaMethod {
	
	@Test
	public void amehtodOnaClass() {
		System.out.println("A method on a class");
		assertEquals(4,4,"2+2=4");
	}
	
	@Test
	public void checkDifference() {
		int answer = 2-2;
		assertEquals(0,answer, "2- 2 is zero");
	}
}
