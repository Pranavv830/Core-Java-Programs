package multithreading;

public class Test1 extends Thread {

//	public static void main(String[] args) {
//		
//		System.out.println("hello");
//		System.out.println(Thread.currentThread().getName());       //main
//		
//		Thread.currentThread().setName("Pranav");
//		System.out.println(Thread.currentThread().getName());
//		
//		System.out.println(10/0);  // exeption in thread pranav  
//	}
	
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("thread task");
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.start();
	
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t1.isAlive());
		
	}
}
