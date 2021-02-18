import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter email id :");
		name = sc.nextLine();
		email(name);
	}
	public static void email(String name) {

                Pattern p = Pattern.compile("^[a-zA-Z0-9]{3}+(.{1}[a-zA-Z0-9]{3}+)*@{1}[a-zA-Z0-9]{2}+(.{1}[a-zA-Z0-9]{2}+)*(.{1}[a-zA-Z0-9]{2}+)$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("email-id is valid");
		}
		else
		{
			System.out.println("email-id is invalid");
		}
		System.out.println("length :"+name.length());
	}
}

