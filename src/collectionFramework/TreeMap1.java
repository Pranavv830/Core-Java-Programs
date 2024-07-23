package collectionFramework;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap t1 = new TreeMap();
		
		t1.put(102, "raju");
		t1.put(105, "kiran");
		t1.put(106, "rajesh");
		t1.put(103, "nayan");
		t1.put(101, "tejas");
		t1.put(104, "mohit");
		
		System.out.println(t1);
		
		System.out.println(t1.ceilingKey(104));
		System.out.println(t1.ceilingEntry(102));
		System.out.println(t1.descendingKeySet());
		System.out.println(t1.keySet());
		System.out.println(t1.descendingMap());
		System.out.println(t1.firstEntry());
		System.out.println(t1.floorEntry(104));
		System.out.println(t1.headMap(104, false));
		System.out.println(t1.higherEntry(104));
		System.out.println(t1.lowerEntry(105));
	}
}
