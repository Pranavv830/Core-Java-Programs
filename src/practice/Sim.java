package practice;

public class Sim {

	String service;
	long no;
	String network;
	String type;
	
	
	public Sim(String service, long no, String n4etwork, String type) {
		
		this.service = service;
		this.no = no;
		this.network = n4etwork;
		this.type = type;
		System.out.println("Sim created!");
	}
	
	public void displaySim() {
		System.out.println("Service: "+service);
		System.out.println("Sim No: "+no);
		System.out.println("Network: "+network);
		System.out.println("Type: "+type);
		System.out.println("_______________________________________");
	}
	
	
	
}
