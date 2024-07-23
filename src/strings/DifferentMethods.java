package strings;

import java.util.Arrays;
import java.util.Iterator;

public class DifferentMethods {

	public static void main(String[] args) {
		
		String s = "Hippopotamus";
		
		System.out.println(s.charAt(10));
		System.out.println(s.concat("bye"));
		System.out.println(s.contains("pop"));
		System.out.println(s.endsWith("mus"));
		System.out.println(s.equalsIgnoreCase("HipPoPotaMus"));
		System.out.println(s.equals("Hippopotamus"));
		System.out.println(s.indexOf('p'));
		System.out.println(s.indexOf('p', 8));
	    System.out.println(s.indexOf("pot"));
	    System.out.println(s.indexOf("pop", 3));
	    System.out.println("".isEmpty());
	    System.out.println(s.lastIndexOf('s'));
	    System.out.println(s.length());
	    System.out.println(s.replace('p', 'd'));
	    System.out.println(s.replaceAll("pop", "popcorn"));
	    
	    String[] ar = "my name is pranav".split("");
	    
	    for (int i = 0; i < ar.length; i++) {
			System.out.println(i);
		}
	    
	    System.out.println(s.startsWith("Hi"));
	    System.out.println(s.startsWith("hi"));
	    System.out.println(s.substring(3, 8));
	    System.out.println(s.substring(3));
	    
	    char[] ch = s.toCharArray();
	    System.out.println(Arrays.toString(ch));
	    System.out.println(s.toLowerCase());
	    System.out.println(s.toUpperCase());
	    System.out.println("pranav".trim());
	    System.out.println(s.charAt(0));
	}
}
