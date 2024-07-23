package inheritance;

public class FighterPlane extends Plane {
	
	// SINGLE LEVEL INHERITANCE
	
	String role;
	boolean ammo;
	String country;
	int seat;
	
	public FighterPlane(){	
		
	}
	public FighterPlane(String name, String makes, double price, double speed, double capacity, int engine, String role,
			boolean ammo, String country, int seat) {
		
		this.name= name;
		this.makes=makes;
		this.price=price;
		this.speed=speed;
		this.capacity=capacity;
		this.engine=engine;
		
		this.role = role;
		this.ammo = ammo;
		this.country = country;
		this.seat = seat;
	}
	
	public void displayFighterPlane() {
		
		displayPlane();
		System.out.println("Role: "+role );
		System.out.println("Ammo: "+ammo );
		System.out.println("Country: "+country );
		System.out.println("Seat: "+seat );
	}
	
	
}
