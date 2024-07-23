package practice;

public class Car {

	String brand;
	String color;
	String model;
	int milage;
	double price;
	
	Engine e = new Engine("v engine",530,1493,"diesel",4);

	public Car(String brand, String color, String model, int milage, double price) {
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.milage = milage;
		this.price = price;
		System.out.println("car created");
	}
	

	public void displayCar() {
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Model: "+model);
		System.out.println("Milage: "+milage);
		System.out.println("Price: "+price);
		System.out.println("__________________________________________");
	}
	
}
