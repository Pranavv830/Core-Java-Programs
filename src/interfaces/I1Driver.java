package interfaces;

public class I1Driver {

	public static void main(String[] args) {
		
		I1 i = new I1Imp();
		i.test();
		i.demo();
		i.demo2();
		
		System.out.println(i.s);
		System.out.println(i.s2);
		
		// i.s = "spiders";  CTE

	}

}
