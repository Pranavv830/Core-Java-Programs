package multithreading;

public class BookSeats {

	static int totalSeats = 20;
	
	static synchronized void bookSeat(int seat) {
		
		if (totalSeats >= seat) {
			System.out.println(seat+" Seat booked successfully! ");
			totalSeats -= seat;
			System.out.println("Seats left : "+totalSeats);
		}
		else {
			System.out.println(seat+"seat can't be booked");
			System.out.println("Seats left : "+totalSeats);
			
		}
	}
}
