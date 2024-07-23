package inheritance;

public class Plane {
	
	// SINGLE LEVEL INHERITANCE

	String name;
	String makes;
	double price;
	double speed;
	double capacity;
	int engine;
	
    public Plane() {
		
	}
	public Plane(String name, String makes, double price, double speed, double capacity, int engine) {
		
		this.name = name;
		this.makes = makes;
		this.price = price;
		this.speed = speed;
		this.capacity = capacity;
		this.engine = engine;
	}
	
	public void displayPlane() {
		System.out.println("Name: "+name );
		System.out.println("Make: "+makes );
		System.out.println("Price: "+price );
		System.out.println("Speed: "+speed );
		System.out.println("Capacity: "+capacity );
		System.out.println("Engine: "+engine );
	
	}
	
	
}
