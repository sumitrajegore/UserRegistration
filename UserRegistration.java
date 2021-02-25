package lambda.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidation{
	
    boolean matchPattern(String pattern, String name);
}

public class UserRegistration {
	
    static String namePattern = "^[A-Z][a-zA-Z]{3,}";
    static String lastPattern = "^[A-Z][a-zA-Z]{3,}";
    static String emailPattern ="^abc.[a-zA-Z0-9]*@bl[.]co[.][a-z]{2,3}";
    static String phonePattern ="^[0-9]{2}[: :][0-9]{10}";
    static String passwordPattern ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
    UserValidation validate = (String pattern, String name) -> Pattern.matches(pattern, name);

    public boolean nameValidation(String name) throws UserRegistrationTestException {
    	
        try {
            if (name.isEmpty()) throw new UserRegistrationTestException("Entered value is empty",
            		UserRegistrationTestException.ExceptionType.EmptyType);
            return validate.matchPattern(namePattern,name);
        } catch (NullPointerException e) {
        	
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
        }
    }
    
    public boolean lastnameValidation(String name) throws UserRegistrationTestException {
    	
        try {
            if (name.isEmpty()) throw new UserRegistrationTestException("Entered value is empty",
            		UserRegistrationTestException.ExceptionType.EmptyType);
            return validate.matchPattern(lastPattern,name);
        } catch (NullPointerException e) {
        	
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
        }
    }

    public boolean emailValidation(String email) throws UserRegistrationTestException {
    	
        try {
            if (email.isEmpty()) throw new UserRegistrationTestException("Entered value is empty",
            		UserRegistrationTestException.ExceptionType.EmptyType);
            return validate.matchPattern(emailPattern,email);
        } catch (NullPointerException e) {
        	
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
        }
    }

    public boolean phoneValidation(String phoneNumber) throws UserRegistrationTestException {
    	
        try {
            if (phoneNumber.isEmpty()) throw new UserRegistrationTestException("Entered value is empty",
            		UserRegistrationTestException.ExceptionType.EmptyType);
            return validate.matchPattern(phonePattern,phoneNumber);
        } catch (NullPointerException e) {
        	
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
        }
    }

    public boolean passwordValidation(String password) throws UserRegistrationTestException {
    	
        try {
            if (password.isEmpty()) throw new UserRegistrationTestException("Entered value is empty",
            		UserRegistrationTestException.ExceptionType.EmptyType);
            return validate.matchPattern(passwordPattern,password);
        } catch (NullPointerException e) {
        	
            throw new UserRegistrationTestException("entered null", UserRegistrationTestException.ExceptionType.NullType);
        }
    }
}
