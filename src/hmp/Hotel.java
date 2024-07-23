package hmp;

public abstract class Hotel {

	public abstract void displayDetails();
	public abstract void menu();
	public abstract void orderFood();
	public abstract void payment(double toBePaid);
	public abstract void review();
	
	public void gritings() {
		System.out.println("Thank You Visit Again");
	}
	
}
