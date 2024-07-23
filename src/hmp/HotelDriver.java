package hmp;

public class HotelDriver {

	public static void main(String[] args) {
		
		Hotel h1 = new HotelImp("Vedant Pure Veg", "Pune", "Veg", 8625489324l, "10Am to 10PM");
		
		h1.menu();
		h1.orderFood();

	}

}
