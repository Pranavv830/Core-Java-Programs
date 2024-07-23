package abstraction;

public class CalculatorImp extends Calculator {

	public void addition(double a, double b) {
		
		double res = a+b;
		System.out.println(res);
	}
	
	public void subtraction(double c, double d) {
		
		double res= c-d;
		System.out.println(res);
	}
	
	public void myOpinion() {
		
		System.out.println("Good Job");
	}
}
