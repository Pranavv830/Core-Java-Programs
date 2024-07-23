package multithreading;

public class Sleep2 extends Thread {

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000,200000);
				System.out.println(Thread.currentThread().getName());
				System.out.println(i);
			} 
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Sleep2 s2 = new Sleep2();
		s2.start();
	}
}
