package com.userregistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegtrationTest {

    @Test
    public void nameValid() throws UserRegistrationTestException {

        UserRegistration checkName = new UserRegistration();
        try {
            boolean sname = checkName.nameValid(null);
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, sname);
        }catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }
    
    @Test
    public void lastValid() throws UserRegistrationTestException { 

        UserRegistration checkLastName = new UserRegistration();
        try {
            boolean lname = checkLastName.lastValid(null);
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);        
            Assert.assertEquals(true, lname);
        }catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void emailValid() throws UserRegistrationTestException {

        UserRegistration checkEmail = new UserRegistration();
        try {
            boolean email = checkEmail.emailValid(null);
            //boolean email = checkEmail.emailValid("abc.Sumit@bl.co.in");
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);     
            Assert.assertEquals(true, email);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void phoneValid() throws UserRegistrationTestException {

        UserRegistration checkPhone = new UserRegistration();
        try {
            boolean phone = checkPhone.phoneValid(null);
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void passwordValid() throws UserRegistrationTestException { 

        UserRegistration checkPassword = new UserRegistration();
        try {
            boolean password = checkPassword.passwordValid(null);
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            //Boolean mood = checkPassword.passwordValid("ssdSSW53#");
        	Assert.assertEquals(true, password);
        } catch (UserRegistrationTestException e) { 

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }
    
    @Test
    public void nameValidempty() throws UserRegistrationTestException {

        UserRegistration checkName = new UserRegistration();
        try {
            boolean sname = checkName.nameValid("Sumit");
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, sname);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }
    
    @Test
    public void lastValidempty() throws UserRegistrationTestException { 

        UserRegistration checkLastName = new UserRegistration();
        try {
            boolean lname = checkLastName.lastValid("Rajegore");
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);        
            Assert.assertEquals(true, lname);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void emailValidempty() throws UserRegistrationTestException { 

        UserRegistration checkEmail = new UserRegistration();
        try {
            //boolean email = checkEmail.emailValid(null);
            boolean email = checkEmail.emailValid("abc.Sumit@bl.co.in");
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);     
            Assert.assertEquals(true, email);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void phoneValidempty() throws UserRegistrationTestException {

        UserRegistration checkPhone = new UserRegistration();
        try {
            boolean phone = checkPhone.phoneValid("91 9822654119");
            @SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void passwordValidempty() throws UserRegistrationTestException {

        UserRegistration checkPassword = new UserRegistration();
        try {
            boolean password = checkPassword.passwordValid("ssdSSW53#");
            @SuppressWarnings("deprecation")
	    ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            //Boolean mood = checkPassword.passwordValid("ssdSSW53#");
        	Assert.assertEquals(true, password);
        } catch (UserRegistrationTestException e) {

            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }
    
}
