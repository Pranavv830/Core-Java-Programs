package multithreading;

public class MyThread2 extends Thread{

	BookSeats b; 
	int seats;
	
	public MyThread2(BookSeats b, int seats) {
		this.b = b;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		b.bookSeat(seats);
	}
}
