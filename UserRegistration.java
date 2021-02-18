import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter passward :");
		name = sc.nextLine();
		passward(name);
	}
	public static void passward(String name) {

                //Pattern p = Pattern.compile("^[a-zA-Z0-9]{3}+(.{1}[a-zA-Z0-9]{3}+)*@{1}[a-zA-Z0-9]{2}+(.{1}[a-zA-Z0-9]{2}+)*(.{1}[a-zA-Z0-9]{2}+)$");
		Pattern p = Pattern.complie("^[a-zA-Z0-9]{8,}$");
                Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("passward is valid");
		}
		else
		{
			System.out.println("passward is invalid");
		}
		System.out.println("length :"+name.length());
	}
}

