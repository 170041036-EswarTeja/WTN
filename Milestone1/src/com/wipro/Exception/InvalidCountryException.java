package com.wipro.Exception;
@SuppressWarnings("serial")
public class InvalidCountryException extends Exception {

	public InvalidCountryException() {
		System.out.println("User Outside India connot be registered");
	}
}
