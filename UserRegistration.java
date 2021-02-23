package com.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean nameValid(String name) throws UserRegistrationTestException {
       try {
    	   if (name.isEmpty()) throw new UserRegistrationTestException("Entered value is empty", UserRegistrationTestException.ExceptionType.EmptyType);
    	   
 	       	Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{3,}");
        	Matcher m = p.matcher(name);
        	return m.find(); 
       } catch(NullPointerException e) {
           throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
  
       }
    }

    public boolean lastValid(String name) throws UserRegistrationTestException {
        try {
     	   if (name.isEmpty()) throw new UserRegistrationTestException("Entered value is empty", UserRegistrationTestException.ExceptionType.EmptyType);

        	Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{3,}");
        	Matcher m = p.matcher(name);
        	return m.find();
        } catch(NullPointerException e) { 
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType); 
            }
    }
    
    public boolean emailValid(String email) throws UserRegistrationTestException {
    	try { 
	    if (email.isEmpty()) throw new UserRegistrationTestException("Entered value is empty", UserRegistrationTestException.ExceptionType.EmptyType);

        	Pattern p = Pattern.compile("^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}");
        	Matcher m = p.matcher(email);
        	return m.find();
    	} catch(NullPointerException e) {
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
    	}
    }

    public boolean phoneValid(String phoneNumber) throws UserRegistrationTestException {
       try {
    	   if (phoneNumber.isEmpty()) throw new UserRegistrationTestException("Entered value is empty", UserRegistrationTestException.ExceptionType.EmptyType);

        	Pattern p = Pattern.compile("^[0-9]{2}[\\s][7-9]{2}[0-9]{8}");
        	Matcher m = p.matcher(phoneNumber);
        	return m.find();
       } catch(NullPointerException e) {
           throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
       }
    }

    public boolean passwordValid(String password) throws UserRegistrationTestException {
       try { 
 	   if (password.isEmpty()) throw new UserRegistrationTestException("Entered value is empty", UserRegistrationTestException.ExceptionType.EmptyType);
        
        	Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$");
      	  	Matcher m = p.matcher(password);
        	return m.find();
        } catch(NullPointerException e) {
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
	
        }
    }

}
