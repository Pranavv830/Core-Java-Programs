package wrapper;

public class Parsing {

	public static void main(String[] args) {
		
		String phone = "623254765254";
		long l = Long.parseLong(phone);
	    System.out.println(l);
	    
	    String gen = "f";
	    char ch = gen.charAt(0);
	    System.out.println(ch);
	    
	    String str = "true";
	    boolean b = Boolean.getBoolean(str);
	    System.out.println(b);
	    
//	    String s = "Pranav1234";
//	    int a = Integer.parseInt(s);  // Number Format Exeption
	    
	}
}
