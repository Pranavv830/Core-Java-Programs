package multithreading;

public class InteruptMethod extends Thread{

	@Override
	public void run() {
		
//		System.out.println("A : "+Thread.interrupted());    //  true ---->  false
		System.out.println(Thread.currentThread().isInterrupted());
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);                  // interrupt method work only when Thread is in sleep() or wait()
//				System.out.println("B : "+Thread.interrupted());
			}
		} 
		catch (Exception e) {
			System.out.println("thread interupted: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		InteruptMethod m1 = new InteruptMethod();
		m1.start();
		m1.interrupt();
	}
}
