package interfaces;

public class CalculatorImp implements Calculator {

	@Override
	public void add(int a, int b) {

		System.out.println(a+b);
	}

	@Override
	public void division(double d1, double d2) {
		
		System.out.println(d1/d2);
		
	}

	@Override
	public void subtract(int a, int b) {
		
		System.out.println(a-b);
		
	}

	@Override
	public void multiplication(int x, int y) {
		
		System.out.println(x*y);
		
	}

}
