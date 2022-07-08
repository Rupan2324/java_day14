package myio;
import java.util.Hashtable;
import java.util.Scanner;

public class Testhash {

	public static void main(String[] args) {

		Hashtable<String, String> h1 = new Hashtable<String, String>();
		h1.put("Rupan", "Rupan@23");
		h1.put("Praveen","Praveen@28");
		h1.put("Sridhar", "Sridhar@2000");
		try (Scanner sc = new Scanner(System.in)) {
			String User_name = sc.next();
			String Password = sc.next();
			if(h1.containsKey(User_name)) {
			 if(h1.get(User_name).equals(Password)){
				 System.out.println("Successfully logged in");
			 }
			 else {
				 System.out.println("Password is incorrect");
			 }
			}
			else {
				System.out.println("Username not available");
			}
		}
		
	}

}
