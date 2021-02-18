import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter mobile number :");
		name = sc.nextLine();
		mobileno(name);
	}
	public static void mobileno(String name) {
		
		Pattern p = Pattern.compile("^[9][1][\\s][0-9]{10}+$");
               //Pattern p = Pattern.compile("^[.]{1}[a-z]{3,}[@]{1}[.]{1}[.]{1}[a-z]{2,}+$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("mobile no is valid");
		}
		else
		{
			System.out.println("mobile no is invalid");
		}
		System.out.println("length :"+name.length());
	}
}
