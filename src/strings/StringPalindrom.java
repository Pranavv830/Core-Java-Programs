package strings;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String s = "nayyyan";
		
		palindrom(s);
		
	}
	public static char[] convertToChar(String s) {
	
        char[] ch = new char[s.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
		
	}
	public static void palindrom(String ip) {
		
		char[] ch = convertToChar(ip);
		int i;
		int j = ch.length-1;
		for (i = 0; i < ch.length/2; i++) {
			if (ch[i] != ch[j]) {
				System.out.println("name is not a palindrom");
				return;
			}
			j--;
		}
		System.out.println("the name is palindrom");
	}
}
