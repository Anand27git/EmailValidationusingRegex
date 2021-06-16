package com.BridgeLabz.emailvalidation;

import static org.junit.Assert.*;

import org.junit.Test;

/*******************
 * 
 * @author ANAND 
 * UC-1 Test case to validate mandatory part start with abc
 *
 *******************/
public class EmailValidationtest {

	@Test
	// UC-1 Test case to validate mandatory part start with abc
	public void EmailValidationItShouldReturnValidOrNot() {
		EmailValidation email = new EmailValidation();
		assertTrue(email.validemail("abc.123")); // validated
		assertTrue(email.validemail("Anand.256"));
		// test case passed
	}
}
