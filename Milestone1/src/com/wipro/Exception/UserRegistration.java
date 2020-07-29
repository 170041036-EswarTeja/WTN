package com.wipro.Exception;

public class UserRegistration {

	void userregister(String username,String userCountry) throws Exception {
		if (userCountry.contentEquals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException();
		}
	}
public static void main(String[] args) {
	UserRegistration ob = new UserRegistration();
	try {
		ob.userregister("Mickey", "Newzealand");
	} catch (Exception e) {
		e.getMessage();
	}
}
}
