package exeption_handling;

public class Finally {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		try {
			int res = a/b;
			System.out.println(res);
		} 
		catch (ArithmeticException e) {
			System.out.println("don't devide by zero");
		}
		finally {
			System.out.println("Thank you!");
		}
	}
}
