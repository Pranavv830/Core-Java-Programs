package wrapper;

public class Unboxing {

	public static void main(String[] args) {
		
		boolean b = true;
		
		Boolean b1 = new Boolean(b);  // Boxing
		System.out.println(b1.hashCode());
		
		boolean ans = b1.booleanValue();  // Unboxing
		System.out.println(ans);
		
		Double d = new Double(22.44);
	    
		double d2 = d.doubleValue();
		System.out.println(d2);
		
	}
}
