package collectionFramework;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		
		s1.add("raju");
		s1.add(22);
	
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		
	}
}
