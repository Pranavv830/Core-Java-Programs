package sorting;

import java.util.Arrays;

public class ReverseTheString {
	
	public static String[] stringToArray(String s) {
		
		String[] a = {s};
		
		return reverse(a);
			
	}
	
	public static String[] reverse(String[]a) {
		
		String[] rev = new String[a.length] ; 
		for (int i = 1; i <= a.length-1; i++) {
			for (int j = 1; j <= a.length-1; j++) {
               
				String name = rev[j];
				 a[j] =  rev[j-1];
				 rev[j-1] = name;
				
			}
			
		}
		return rev;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(stringToArray("my name is pranav")));
		//System.out.println(Arrays.toString(reverse()));
        
	}
	
}
