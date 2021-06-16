package com.BridgeLabz.emailvalidation;

import java.util.regex.Pattern;

/********************
 * 
 * @author ANAND 
 * purpose: Validation of Email-ID start with abc
 *
 ********************/
public class EmailValidation {

	// UC-1 method to validate mandatory part start with abc
	public boolean validemail(String email) {
		return Pattern.matches("([a-zA-Z0-9.]+)", email);
	}

}
