package collectionPractice;

import java.util.ArrayList;

public class BikeUnique {

	public static void main(String[] args) {
		
		
		ArrayList bikes = new ArrayList<>();
		
		bikes.add(new Bike("Apache", 195000.00, 200, "TVS"));
		bikes.add(new Bike("Classic 350", 350000.00, 350, "Royal Enfield"));
		bikes.add(new Bike("Rx 100", 200000.00, 90, "Yamaha"));
		bikes.add(new Bike("GT 650", 425000.00, 650, "Royal Enfield"));
		bikes.add(new Bike("H2R", 350000.00, 1200, "Kawasaki"));
		bikes.add(new Bike("K16", 300000.00, 1600, "BMW"));
		bikes.add(new Bike("Pulsar", 160000.00, 160, "Bajaj"));
		
		ArrayList brands = getBrands(bikes);
		ArrayList unique = UniqueBrands(bikes);
		ArrayList organised = new ArrayList<>();
		
		for (int i = 0; i < unique.size(); i++) {
			String brand = (String)unique.get(i);
			for (int j = 0; j < bikes.size(); j++) {
				Bike b = (Bike)bikes.get(j);
				
				if (brand.equalsIgnoreCase(b.brand)) {
					organised.add(b);
				}
			}
		}
		System.out.println(organised);
	}

	public static ArrayList UniqueBrands(ArrayList brands) {
		
		for (int i = 0; i < brands.size(); i++) {
			String b1 = (String)brands.get(i);
			
			for (int j = 0; j < brands.size(); j++) {
				String b2 = (String)brands.get(j);
				
				if (b1.equalsIgnoreCase(b2)) {
					brands.remove(j);
				}
			}
		}
		return brands;
	}

	public static ArrayList getBrands(ArrayList bikes) {
		
		ArrayList brands = new ArrayList();
		
		for (int i = 0; i < bikes.size(); i++) {
			Bike b = (Bike)bikes.get(i);
			brands.add(b.brand);
		}
		return brands;
	}
	
}

