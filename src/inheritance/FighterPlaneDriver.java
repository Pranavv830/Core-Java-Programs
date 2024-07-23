package inheritance;

public class FighterPlaneDriver {

	public static void main(String[] args) {
		
		// SINGLE LEVEL INHERITANCE
		
		FighterPlane f1 =new FighterPlane("tejas", "hall", 320000000.00, 18, 5000, 4000, "multirolr", true, "bharat",1 );
		f1.displayFighterPlane();
		
		System.out.println("-----------------------------------------------------");
		
		f1.displayPlane();
		

	}

}
