package strings;

public class DuplicateString {

	public static void main(String[] args) {
		
		String s1 = "hii";
		System.out.println(s1.hashCode());
		
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		String s3 = "hii";
		
		System.out.println(s1==s3);
	}
}
