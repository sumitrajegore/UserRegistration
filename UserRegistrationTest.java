package com.userregistration;
<<<<<<< HEAD
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
=======
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
>>>>>>> UC12_custum_exception

public class UserRegtrationTest {

    @Test
<<<<<<< HEAD
    public void nameValid() {
        UserRegistration checkName = new UserRegistration();
        Boolean mood = checkName.nameValid("Sumit");
        Assert.assertEquals(true, mood);
    }
    
    @Test
    public void lastValid() {
        UserRegistration checkLastName = new UserRegistration();
        Boolean mood = checkLastName.nameValid("Rajegore");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void emailValid() {
        UserRegistration checkEmail = new UserRegistration();
        Boolean mood = checkEmail.emailValid("abc.Sumit@bl.co.in");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void phoneValid() {
        UserRegistration checkPhone = new UserRegistration();
        Boolean mood = checkPhone.phoneValid("91 9822654119");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void passwordValid() {
        UserRegistration checkPassword = new UserRegistration();
        Boolean mood = checkPassword.passwordValid("ssdSSW53#");
        Assert.assertEquals(true, mood);
    }
    
    @Test
    public void happy_ShouldReturnHappy() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyseMood("this is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void sad_ShouldReturnSad() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyseMood("this is is Sad Message");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void allemailValid() {
        UserRegistration checkEmail = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any gmail :");
        String gmail = sc.nextLine();
		Boolean mood = checkEmail.allemailValid(gmail);
        Assert.assertEquals(true, mood);
    }
=======
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
    
>>>>>>> UC12_custum_exception
}
