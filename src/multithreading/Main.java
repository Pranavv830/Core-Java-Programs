package multithreading;

public class Main {

	public static void main(String[] args) {
		
		Case4Mythred1 t1 = new Case4Mythred1();
		t1.start();
		
		Case4Mythred2 t2 = new Case4Mythred2();
		t2.start();
	}
}
