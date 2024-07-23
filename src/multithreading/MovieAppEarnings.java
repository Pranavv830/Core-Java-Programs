package multithreading;

public class MovieAppEarnings {

	public static void main(String[] args) throws InterruptedException {
		
		TotleEarning te = new TotleEarning();
		te.start();
		
		//System.out.println("Total earnings : "+te.total+" rs");
		
		synchronized (te) {
			te.wait();
			System.out.println("Total earnings : "+te.total+" rs");
		}
	}
}
