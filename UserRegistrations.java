package com.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

     	public boolean emailSampleValidation(String email) {
		Pattern p = Pattern.compile("^[a-z]{3,}([\\.\\+\\-]?[0-9]{3,}+)?[@][a-z0-9]{1,}[.]{1}[a-z]{2,4}?(.[a-z]{2,4}[.]?)?$");
        Matcher m = p.matcher(email);
        return m.find();		
	    }
}
