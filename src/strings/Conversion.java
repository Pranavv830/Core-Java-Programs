package strings;

public class Conversion {

	public static void main(String[] args) {
		
		String s ="sam";
		
		StringBuilder sb1 = new StringBuilder(s);
		StringBuffer sb2 = new StringBuffer(s);
		
		String s1 = new String(sb1);
		String s2 = new String(sb2);
		
	}
}
