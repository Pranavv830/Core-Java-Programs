package collectionFramework;

import java.util.ArrayList;

public class EvenNumber {

	public static void main(String[] args) {
		
		ArrayList num = new ArrayList<>();
		 
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		
		System.out.println(num);
		
		ArrayList even = new ArrayList<>();
		
		for (Object o : num) {
			Integer i = (Integer)o;
			if (i%2 == 0) {
				even.add(i);
			}
		}
		num.removeAll(even);
		System.out.println(num);
		System.out.println(even);
		
	}
}
