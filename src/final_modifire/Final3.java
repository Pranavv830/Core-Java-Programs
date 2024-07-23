package final_modifire;

import java.util.Scanner;

public class Final3 {

	static final double d;
	
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the final value");
		d = sc.nextDouble();
	}
	public static void main(String[] args) {
		
		System.out.println(d);
	}
}
