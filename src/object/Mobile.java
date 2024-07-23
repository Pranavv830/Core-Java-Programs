package object;

public class Mobile extends Object {

	String name;
	double price;
	int ram;
	int rom;
	
	public Mobile() {
		
	}

	public Mobile(String name, double price, int ram, int rom) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
	}
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", ram=" + ram + ", rom=" + rom + "]";
	}
}
