package polymorphism;

public class Son extends Father {

	static String staticvar="Static var from son";
	String nonstaticvar="Non static var form son";
	
	public void health() {
		System.out.println("Good Health");
	}
	
	public void finance() {
		System.out.println("poor");
	}
}
