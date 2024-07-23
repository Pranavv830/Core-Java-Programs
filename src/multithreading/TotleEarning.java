package multithreading;

public class TotleEarning extends Thread{

	int total=0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			for (int i = 1; i <= 10; i++) {
				   total = total + 100;
				}
			this.notify();
		}
		
	}
}
