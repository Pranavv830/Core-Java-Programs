package strings;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		
		String s = "pranav";
		
		char[] ch = new char[s.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		
		boolean[] counted = new boolean[s.length()];
		
		int count = 0;
		 
		for (int i = 0; i < ch.length; i++) {
		
			if(counted[i])
				continue;
		
			for (int j = i; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					counted[j] = true;
				}
			}
			System.out.println(ch[i]+" is occures "+ count +" times" );
			count = 0;
		}

	}
	
}
