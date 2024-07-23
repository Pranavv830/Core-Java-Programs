package strings;

public class StringBuilder2 {

	public static void main(String[] args) {
		 
		String s1 = "sam";
		String s2 = s1.concat("patil");
		
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuilder sb1 = new StringBuilder("patil");
		StringBuilder sb2 = sb1.append("Sam");
		
		System.out.println(sb1);
		System.out.println(sb2);

		
	}
}
