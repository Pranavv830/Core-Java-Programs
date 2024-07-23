package exeption_handling;

import java.util.Scanner;

public class Exp3 {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter ip1");
			String ip1 = sc.next();
			
			System.out.println("Enter ip2");
			String ip2 = sc.next();
			
			int res = ((Integer.parseInt(ip1))/Integer.parseInt(ip2));
			
			System.out.println(res);
			
		}
		catch (NullPointerException np) {
			
			System.out.println("please call with propper object created");
		}
		catch (NumberFormatException nf) {
			
			System.out.println("please enter valid number");
		}
		catch (ArithmeticException ar) {
			
			System.out.println("Don't devide by zero");
		}
		
	}
}
