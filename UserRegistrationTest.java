package lambda.userregistration;
import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void checkNameValidationReturnTrue() {
    	
    	UserRegistration checkName = new UserRegistration();
        try {
            Assert.assertEquals(true, checkName.nameValidation("Sumit"));
        } catch (Exception e) {
        	
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenNameAsNullReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkName = new UserRegistration();
        try {
            boolean name = checkName.nameValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenLNameAsEmptyReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkName = new UserRegistration();
        try {
            boolean name = checkName.nameValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }
    
    @Test
    public void checkLNameValidationReturnTrue() {
    	
    	UserRegistration checkName = new UserRegistration();
        try {
            Assert.assertEquals(true, checkName.lastnameValidation("Rajegore"));
        } catch (Exception e) {
        	
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenlNameAsNullReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkName = new UserRegistration();
        try {
            boolean name = checkName.nameValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNameAsEmptyReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkName = new UserRegistration();
        try {
            boolean name = checkName.nameValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkEmailValidationReturnTrue() {
    	
    	UserRegistration checkEmail = new UserRegistration();
        try {
            Assert.assertEquals(true, checkEmail.emailValidation("abc.Sumit@bl.co.in"));
        } catch (Exception e) {
        	
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenEmailAsNullReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkEmail = new UserRegistration();
        try {
            boolean email = checkEmail.emailValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenEmailAsEmptyReturnException() throws UserRegistrationTestException {
    	
        try {
        	UserRegistration checkEmail = new UserRegistration();
            boolean email = checkEmail.emailValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkPhoneValidationReturnTrue() {
    	
    	UserRegistration checkPhone = new UserRegistration();
        try {
            Assert.assertEquals(true, checkPhone.phoneValidation("91 9822654119"));
        } catch (Exception e) {
        	
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenNumberAsNullReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkPhone = new UserRegistration();
        try {
            boolean phone = checkPhone.phoneValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNumberEmpty_shouldThrowException() throws UserRegistrationTestException {
    	
    	UserRegistration checkPhone = new UserRegistration();
        try {
            boolean phone = checkPhone.phoneValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkPasswordValidationReturnTrue() {
    	
    	UserRegistration checkPassword = new UserRegistration();
        try {
            Assert.assertEquals(true, checkPassword.passwordValidation("Sumit@123"));
        } catch (Exception e) {
        	
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenPasswordAsNullReturnException() throws UserRegistrationTestException {
    	
    	UserRegistration checkPassword = new UserRegistration();
        try {
            boolean password = checkPassword.passwordValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenPasswordEmpty_shouldThrowException() throws UserRegistrationTestException {
    	UserRegistration checkPassword = new UserRegistration();
        try {
            boolean password = checkPassword.passwordValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationTestException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationTestException e) {
        	
            Assert.assertEquals(UserRegistrationTestException.ExceptionType.EmptyType, e.type);
        }
    }
}
