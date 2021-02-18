import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter last name :");
		name = sc.nextLine();
		lastname(name);
	}
	public static void lastname(String name) {
		
		Pattern p = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}+$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("lastname is valid");
		}
		else
		{
			System.out.println("lastname is invalid");
		}
		System.out.println("length :"+name.length());
	}
}
