package inheritance;

public class ABDriver {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.s);
		
		b1.displayA();
		System.out.println(b1.a);
		
		A a1=new B();
		System.out.println(a1.a);
		a1.displayA();
		
		//System.out.println(a1.s);    ............................CTE 

	}

}
