package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet s1 = new TreeSet();
		
		s1.add(20);
		s1.add(22);
		s1.add(82);
		s1.add(50);
		s1.add(21);
		
		System.out.println(s1);
		
	//	System.out.println(s1.ceiling(20));
		
		Iterator i1 = s1.descendingIterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.floor(80));
		System.out.println(s1.headSet(50, true));
		System.out.println(s1.headSet(51));
		System.out.println(s1.higher(23));
		System.out.println(s1.pollFirst());
		System.out.println(s1.pollLast());
		System.out.println(s1);
		System.out.println(s1.pollFirst());
		System.out.println(s1.pollLast());
		System.out.println(s1);
		
	}
}
