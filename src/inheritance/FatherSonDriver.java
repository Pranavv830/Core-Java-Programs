package inheritance;

public class FatherSonDriver {

	public static void main(String[] args) {

		Son s1 = new Son();
		s1.drinking();
		s1.smoking();
		
		Father f1 = new Son(); // UPCASTING
		f1.drinking();
	//	f1.smoking();  // CTE

		Son s2 =(Son) f1;  // DOWNCASTING
		s2.drinking();
		s2.smoking();
	}

}
