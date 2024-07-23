package practice;

public class PhoneDriver {

	public static void main(String[] args) {

		Phone p1 = new Phone("motorola", 25000, 8, 128, 865423945186l);
		
		p1.displayPhone();
		
		p1.insertSim("jio", 8308617398l, "true 5g", "prepaid");
		p1.s.displaySim();
		

	}

}
