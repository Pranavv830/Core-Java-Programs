package multithreading;

public class MoveBookApp extends Thread{

    static BookTheaterSeat b;
    int seat;
	@Override
	public void run() {
		
		b.bookSeat(seat);
		
	}
	
	public static void main(String[] args) {
		
		b = new BookTheaterSeat();
		
		MoveBookApp pranav = new MoveBookApp();
		pranav.seat = 7;
		pranav.start();
		
		MoveBookApp jayesh = new MoveBookApp();
		jayesh.seat = 6;
		jayesh.start();
		
	}
	
}
