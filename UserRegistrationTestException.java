package lambda.userregistration;
	
public class UserRegistrationTestException extends Exception {
	
	    enum ExceptionType {
	    	
	        NullType,EmptyType
	    }
	    ExceptionType type;
	    public UserRegistrationTestException(String message,ExceptionType type) {
	    	
	        super(message);
	        this.type= type;
	    }
}
