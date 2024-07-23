package multithreading;

public class Case2 extends Thread{

	// performing single task from multiple thread
	
	public void run() {
		System.out.println("Thread task");
	}
	
	public static void main(String[] args) {
		
		Case2 c2 = new Case2();
		c2.start();
		
		Case2 cc2 = new Case2();
		cc2.start();
		
	}
}
