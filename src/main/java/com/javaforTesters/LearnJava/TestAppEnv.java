package com.javaforTesters.LearnJava;

public class TestAppEnv {

	public static final String DOMAIN = "192.123.0.3";
	public static final String PORT = "67";

	public static String geturl() {
		 	return	"http://"	+	DOMAIN	+	":"	+	PORT; 
	}

}
