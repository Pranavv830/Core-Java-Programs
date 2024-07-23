package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		
		l1.add(5);
		l1.add(8);
		l1.add(10);
		l1.add(1);
		l1.add(9);
		l1.add(4);
		l1.add(3);
		l1.add(6);
		
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.shuffle(l1);
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.rotate(l1, 1);
		System.out.println(l1);
		Collections.rotate(l1, 1);
		System.out.println(l1);
		
		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.swap(l1, 0, 3);
		System.out.println(l1);
		
		System.out.println(Collections.binarySearch(l1, 4));
		
		System.out.println(Collections.frequency(l1, 5));
		
		Collections.replaceAll(l1, 6, 2);
		System.out.println(l1);
		
		Collections.reverse(l1);
		System.out.println(l1);
		
		
	}
}
