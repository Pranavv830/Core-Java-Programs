package multithreading;

public class JoinMethod extends Thread{

	static Thread t;
	@Override
	public void run() {
		
		try {
			
			t.join();
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread "+i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		t = Thread.currentThread();
		JoinMethod j1 = new JoinMethod();
		j1.start();
		
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread "+i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
	    }
	}
		
}
