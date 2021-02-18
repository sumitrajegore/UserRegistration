import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter email :");
		name = sc.nextLine();
		allemail(name);
	}
	public static void allemail(String name) {

                //Pattern p = Pattern.compile("^[a-zA-Z0-9]{3}+(.{1}[a-zA-Z0-9]{3}+)*@{1}[a-zA-Z0-9]{2}+(.{1}[a-zA-Z0-9]{2}+)*(.{1}[a-zA-Z0-9]{2}+)$");
		Pattern p = Pattern.compile("^[a-z]{3,}([\\.\\+\\-]?[0-9]{3,})?[@][a-z0-9]{1,}[.][a-z]{2,4}[,]?([.][a-z]{2,4}[.]?)?$");
                Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("email is valid");
		}
		else
		{
			System.out.println("email is invalid");
		}
		System.out.println("length :"+name.length());
	}
}

