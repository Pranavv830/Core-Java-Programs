package multithreading;

public class BookTheaterSeat {

	int totalSeat = 10 ;
	
	public synchronized void bookSeat(int seat) {
		
		if (totalSeat >= seat) {
			System.out.println("Seat booked Successfully");
			totalSeat -= seat;
			System.out.println("Total seats remaining : "+totalSeat);
		}
		else {
			System.out.println("seat can't be booked");
			System.out.println("Only "+totalSeat+" seats  left");
		}
	}
}
