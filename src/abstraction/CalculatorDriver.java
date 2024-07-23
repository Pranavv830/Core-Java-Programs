package abstraction;

public class CalculatorDriver {

	public static void main(String[] args) {

		Calculator c1 = new CalculatorImp(); // Upcasting
		
		c1.addition(10,15);
		c1.subtraction(20,30);
		
		c1.massage();
	 // c1.myOpinion(); // CTE
	}

}
