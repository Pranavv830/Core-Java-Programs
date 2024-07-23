package inheritance;

public class Ab1 {

	// hyrarchicle inhritance
	
	public static void main(String[] args) {
		
		C1 c = new C1();
		c.A();
		//c.B(); CTE
		c.C();
		
		B1 b = new B1();
		b.A();
		b.B();
		//b.C(); CTE

	}

}
