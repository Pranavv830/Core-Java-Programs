package strings;

import java.util.Scanner;

public class PinVerify {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String stored = "Pranav@123";
		
		System.out.println("Enter the pin for login");
		
		String entered = sc.next();
		
		if ((stored.equals(entered))) {
			System.out.println("login Successful");
		}
		else {
			System.out.println("login faild");
		}
		
	}
}
