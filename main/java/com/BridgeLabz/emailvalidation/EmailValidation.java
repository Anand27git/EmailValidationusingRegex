
package com.BridgeLabz.emailvalidation;

import java.util.regex.Pattern;

/********************
 * 
 * @author ANAND 
 * 
 * purpose: Validation of Email-ID
 * UC-1 Validation of Email-ID start with abc
 * UC-2 to Ensure the @ and mandatory 2nd part BridgeLabz
 * UC-3 to Ensure the dot and mandatory 3rd part after BridgeLabz
 * UC-4 to Ensure the optional part
 * 
 ********************/
public class EmailValidation {

	// UC-4 to Ensure the optional part
	public boolean validemail(String email) {
		return Pattern.matches("^([a-zA-Z0-9.])+([0-9a-zA-Z]{0,1}+@([a-zA-Z0-9.])+[a-zA-Z]{2,3})+([a-z]{0,2}){0,1}$", email);
	}

}
