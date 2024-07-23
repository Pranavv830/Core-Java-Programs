package interfaces;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		Calculator c1= new CalculatorImp();
		
		c1.add(10, 15);
		c1.division(12, 2);
		c1.subtract(15, 10);
		c1.multiplication(10, 20);
	}
}
