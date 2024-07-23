package multithreading;

public class Testt implements Runnable {

	@Override
	public void run() {
		
		System.out.println("thread task 2");
		
	}
	
	public static void main(String[] args) {
		
		Testt t = new Testt();
		
		Thread th = new Thread(t);
		
		th.start();
	}


}
