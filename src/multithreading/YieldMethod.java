package multithreading;

public class YieldMethod extends Thread{

	@Override
	public void run() {
		
		Thread.yield();  // when you want to give chance main method
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	
	public static void main(String[] args) {
		
		YieldMethod m1 = new YieldMethod();
		m1.start();
		
	//	Thread.yield();  // ----> when you want main method to stop and provide chance to other thread
		
		for (int i = 1; i <=5 ; i++) {
			
			System.out.println(Thread.currentThread().getName()+" - "+i);
			
		}
	}
	
}
