package strings;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String s = "Elephant";
		
		char[] ans = convertToChar(s);
		
		System.out.println(Arrays.toString(ans));
		
	}
	public static char[] convertToChar(String value) {
	
		char[] ch = new char[value.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = value.charAt(i);
		}
		
		return ch;	
	}
}
