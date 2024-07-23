package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class Linklist1 {
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.add("raju");
		l1.add(22);
		l1.add(54);
		l1.add(14.45);
		l1.add(1,'a');
		
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		
		l2.add("kaju");
		l2.add(2);
		
		System.out.println(l2);
		
	//	l1.addAll(l2);
	//	System.out.println(l1);
		
	//	l1.addLast(l2);
	//	System.out.println(l1);
		
	//	System.out.println(l1.containsAll(l2));
		
		System.out.println(l1.getFirst());
		
	}

}
