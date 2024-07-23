package strings;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
	}
}
