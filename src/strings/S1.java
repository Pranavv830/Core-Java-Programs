package strings;

public class S1 {

	public static void main(String[] args) {
		
		String s1 = new String("hii");
		String s2 = new String("hii");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
}
