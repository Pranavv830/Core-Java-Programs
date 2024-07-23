package exeption_handling;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		
		try {
			
			int res = n1/n2;
			System.out.println(res);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Don't Devide by Zero! ");
		}
		
		System.out.println("Thank You");
	}
}
