package polymorphism;

public class CalciMathDriver {

	public static void main(String[] args) {

		Math m1 = new Calci(); // Upcasting
		m1.add(); // overriding
		m1.sub();
		m1.add(); // overriding

	}

}
