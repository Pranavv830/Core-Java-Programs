package object;

public class EqualsMethodDriver {

	public static void main(String[] args) {
		
		EqualsMethod m1 = new EqualsMethod("raju",20,22,"SKN");
		System.out.println(m1);
		
		EqualsMethod m2 = new EqualsMethod("raju",20,22,"SKN");
		System.out.println(m2);
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m2.equals(m1));
	}

}


