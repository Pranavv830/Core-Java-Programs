package abstraction;

abstract public class Dell {

	public Dell() {
		
	}
	public abstract void os();
	public void welcome(String name) {
		System.out.println("Hey "+name+" Welcome to the Dell Universe!");
	}
}
