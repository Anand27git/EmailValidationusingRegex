package com.BridgeLabz.emailvalidation;

import static org.junit.Assert.*;

import org.junit.Test;

/*******************
 * 
 * @author ANAND 
 * UC-1 Test case to validate mandatory part start with abc
 * UC-2 Test case to Ensure the @ and mandatory 2nd part BridgeLabz
 * 
 *******************/
public class EmailValidationtest {

	@Test
	// UC-1 Test case to validate mandatory part start with abc
	public void EmailValidationItShouldReturnValidOrNot() {
		EmailValidation email = new EmailValidation();
		assertTrue(email.validemail("abc.xyz")); // validated
		assertTrue(email.validemail("Anand.256"));
		// test case passed
	}

	@Test
	// UC-2 Test case to Ensure the @ and mandatory 2nd part BridgeLabz
	public void EmailValidationItShouldReturnValidOrNotaddsymbolat() {
		EmailValidation email = new EmailValidation();
		assertTrue(email.validemail("abc.xyz@BridgeLabz")); // validated True
		assertTrue(email.validemail("Anand.256@BridgeLabz"));// validated True
		// test case passed
	}

}
