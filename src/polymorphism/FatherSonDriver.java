package polymorphism;

public class FatherSonDriver {

	public static void main(String[] args) {
		
		Father f1=new Son(); // upcasting
		
		f1.finance();; // Shadowing (CT polymorphism)
		
		f1.health(); // overriding (runtime polymorphism)
	
		System.out.println(f1.staticvar); // Variable Shadowing At Compiletime
		
		System.out.println(f1.nonstaticvar);

	}

}
