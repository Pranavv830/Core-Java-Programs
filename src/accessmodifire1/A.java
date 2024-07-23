package accessmodifire1;

public class A {

	private static int a =100;
	private String s = "hello";
	
	private A() {
		
	}
	
    static void demo() {
		System.out.println("from static demo() of A");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(new A().s);
		demo();
	}
}
