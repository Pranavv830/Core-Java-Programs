package multithreading;

public class DaemonThread1 extends Thread{

	@Override
	public void run() {
		
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		}
		else {
			System.out.println("child thread");
		}
		
	}
	
	public static void main(String[] args) {
		
		
	//	Thread.currentThread().setDaemon(true);   // runtime exception ----->  IllegalThreadStateException
		System.out.println("main thread");
		
		DaemonThread1 d1 = new DaemonThread1();
		
		d1.setDaemon(true);
		
		d1.start();
		
	//	d1.setDaemon(true);     // runtime exception    ----->  IllegalThreadStateException
	}
}
