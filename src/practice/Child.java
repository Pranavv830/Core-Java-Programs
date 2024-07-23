package practice;

public class Child extends Parent{
	
	String name = "Kaju";
	
	public void details() {
		System.out.println("its kaju");
	}
	
	public void displayAll() {
		
		System.out.println(name);
		details();
		
		System.out.println(super.name);
		super.details();
	}

}
