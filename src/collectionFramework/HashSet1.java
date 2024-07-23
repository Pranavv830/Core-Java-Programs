package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
        ArrayList a1 = new ArrayList();
		
		a1.add("rani");
		a1.add(25);
		
		System.out.println(a1);
		
		HashSet s1 = new HashSet();
		
		s1.addAll(a1);
		s1.add("pranav");
		s1.add(22);
		s1.add("raja");
		s1.add(40);
		
		
		System.out.println(s1);
		
		
	}
}
