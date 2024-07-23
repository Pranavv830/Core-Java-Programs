package inheritance;

public class Child extends Parent{

	String s="Jspider";
	static int b=1000;
	
	public static void abc() {
		System.out.println("from static block of abc() from child class");
	}
	public void xyz() {
		System.out.println("from non static block of xyz() from child class");
	}
}
