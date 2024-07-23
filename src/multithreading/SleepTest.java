package multithreading;

public class SleepTest extends Thread{

	@Override
	public void run() {
	
		try {
			for (int i = 1; i <= 5; i++) 
			{
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		SleepTest t1 = new SleepTest();
		t1.start();
		
		SleepTest t2 = new SleepTest();
		t2.start();
	}
}
