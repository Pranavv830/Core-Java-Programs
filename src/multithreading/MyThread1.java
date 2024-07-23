package multithreading;

public class MyThread1 extends Thread{

	BookSeats b; 
	int seats;
	
	public MyThread1(BookSeats b, int seats) {
		this.b = b;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		b.bookSeat(seats);
	}
}
