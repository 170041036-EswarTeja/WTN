package com.wipro.Exception;

@SuppressWarnings("serial")
public class AgeException extends Exception {
	AgeException(){
		System.out.println("Age must be in between 18 and 60 only");
	}
}