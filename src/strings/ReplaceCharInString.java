package strings;

public class ReplaceCharInString {

	public static void main(String[] args) {
		
		System.out.println("New value after replace: "+replace("BANANA", 'A', 'E'));
	}
	
	public static char[] convertToChar(String ip) {
		System.out.println("Orignal value is: "+ip);
		char[] ans = new char[ip.length()];
		for (int i = 0; i < ip.length(); i++) {
			ans [i] = ip.charAt(i);
		}

		return ans;
		
	}
	public static String replace(String ip, char old, char naya) {
		
		char[] c = convertToChar(ip);
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == old) {
			    c[i] = naya;
			}
		}
		
		String s = new String(c);
		
		return s ;
	
		
	}
	
}
