package wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		int a = 10;
		
		Integer i1 = new Integer(a);  // Boxing
		
		System.out.println(i1);
		
		Integer i2 = new Integer(a);  // Boxing
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Double d1 = new Double(23.40);  // Boxing
		System.out.println(d1.hashCode());
		
		Character ch1 = new Character('a');  // Boxing
		System.out.println(ch1.hashCode());
		
		
	}
	
}
