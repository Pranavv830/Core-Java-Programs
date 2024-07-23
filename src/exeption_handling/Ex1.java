package exeption_handling;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		System.out.println("Enter the Diameater");
		int dia = sc.nextInt();
		
		int res = num/dia;
		System.out.println(res);
	
		
	}
}
