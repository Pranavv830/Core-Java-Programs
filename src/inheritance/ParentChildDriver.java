package inheritance;

public class ParentChildDriver {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		System.out.println(c1.s);
		System.out.println(c1.str);
		
		c1.xyz();
		c1.test();
		
		System.out.println("-------------------------------------");
		
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		c1.demo();
		c1.abc();
		

	}

}
