package multithreading;

public class Case1 extends Thread{

	// performing single task from single thread
	
		public void run() {
			System.out.println("Thread task");
		}
		
		public static void main(String[] args) {
			
			Case1 c1 = new Case1();
			c1.start();
			
		}
}
