package collectionPractice;

public class Bike {

	String name;
	double price;
	int cc;
	String brand;
	
	public Bike() {
		
	}
	
	Bike(String name, double price, int cc, String brand){
		this.name = name;
		this.price = price;
		this.cc = cc;
		this.brand = brand; 
	}
	
	public String toString() {
		return "[name = "+ name +" , price = " + price + " , cc = " + cc + " , brand = " + brand + "]" ;
		
	}
	
}

