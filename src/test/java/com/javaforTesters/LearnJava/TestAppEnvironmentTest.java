package com.javaforTesters.LearnJava;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestAppEnvironmentTest {

	@Test
	public void cangeturlstatically() {

		assertEquals("http://192.123.0.3:67", TestAppEnv.geturl());
	}

	@Test
	public void cangetdomainandportstatically() {

		assertEquals("192.123.0.3", TestAppEnv.DOMAIN);

		assertEquals("67", TestAppEnv.PORT);
	}
}
