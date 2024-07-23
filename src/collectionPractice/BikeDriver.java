package collectionPractice;

import java.util.ArrayList;

public class BikeDriver {

	public static void main(String[] args) {
		
		
		ArrayList bikes = new ArrayList<>();
		
		bikes.add(new Bike("Apache", 195000.00, 200, "TVS"));
		bikes.add(new Bike("Classic 350", 350000.00, 350, "Royal Enfield"));
		bikes.add(new Bike("Rx 100", 200000.00, 90, "Yamaha"));
		bikes.add(new Bike("GT 650", 425000.00, 650, "Royal Enfield"));
		bikes.add(new Bike("H2R", 350000.00, 1200, "Kawasaki"));
		bikes.add(new Bike("K16", 300000.00, 1600, "BMW"));
		bikes.add(new Bike("Pulsar", 160000.00, 160, "Bajaj"));
		
		for (Object o : bikes) {
			Bike b = (Bike) o ;
			
			if (b.brand.equalsIgnoreCase("royal enfield")) {
				System.out.println(b);
			}
		}
		
	}
}
