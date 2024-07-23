package inheritance;

public class Parent {

	String str= "Qspider";
	static int a = 5;
	
	public static void demo() {
		System.out.println("from static demo() of parent class");
	}
	public void test() {
		System.out.println("from non static test() of parent class");
	}
}
