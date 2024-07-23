package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer , String> m1 = new HashMap<>();
		
		m1.put(101, "raju");
		m1.put(102, "kiran");
		m1.put(103, "rajesh");
		m1.put(104, "nayan");
		m1.put(105, "tejas");
		m1.put(106, "mohit");
		
		System.out.println(m1);
		
		System.out.println(m1.containsKey(104));
		System.out.println(m1.containsValue("raju"));
		System.out.println(m1.get(104));
		System.out.println(m1.getOrDefault(100, "not found"));
	//	System.out.println(m1.put(105, "pranav"));
	//	System.out.println(m1);
	//	System.out.println(m1.remove(101));
	//	System.out.println(m1);
		
		for (Map.Entry<Integer, String> s : m1.entrySet()) {
			System.out.println(s);
		}
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		
		for (Integer s : m1.keySet()) {
			System.out.println(m1.get(s));
		}
		
		System.out.println(m1.putIfAbsent(100, "ganesh"));
		System.out.println(m1);
		
		System.out.println(m1.remove(101));
		System.out.println(m1);
	}
}
