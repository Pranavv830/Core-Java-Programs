package multithreading;

public class ThreadPriority extends Thread{
	
	public void run() {
		
		System.out.println("child thread");
		System.out.println("child thread priority "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		System.out.println("old priority of main thread "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("new priority of main thread "+Thread.currentThread().getPriority());
		
		ThreadPriority p1 = new ThreadPriority();
		p1.setPriority(MIN_PRIORITY);
		p1.start();
		
	}
}
