package practice;

public class Engine {

	String engine;
	double bhp;
	int cc;
	String fuel;
	int stroke;
	
	public Engine() {
		
	}

	public Engine(String engine, double bhp, int cc, String fuel, int stroke) {
		this.engine = engine;
		this.bhp = bhp;
		this.cc = cc;
		this.fuel = fuel;
		this.stroke = stroke;
		System.out.println("Engine is created");
	}
	public void displayEngine() {
		System.out.println("Engine: "+engine);
		System.out.println("BHP: "+bhp);
		System.out.println("CC: "+cc);
		System.out.println("Fuel: "+fuel);
		System.out.println("Stroke: "+stroke);
		
	}
	
}
