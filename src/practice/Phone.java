package practice;

public class Phone {

	String brand;
	double price;
	int ram;
	int hd;
	long imei;
	Sim s;
	
	
	public Phone(String brand, double price, int ram, int hd, long imei) {
		
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.hd = hd;
		this.imei = imei;
	}
	
	public void insertSim(String service,long no,String network,String type) {
		
		s= new Sim(service,no,network,type);
		System.out.println("Sim Insertede!");
	}
	
	public void displayPhone() {
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Ram: "+ram);
		System.out.println("Hard Disk: "+hd);
		System.out.println("IMEI No: "+imei);
		System.out.println("_______________________________________");
	}
	
	
	
}
