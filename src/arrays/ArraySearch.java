package arrays;

public class ArraySearch {

	public static void main(String[] args) {
		
		int a [] = {12,4,43,53,50,34,56,76};
		
		int key = 50;
		int i;
		
		for (i = 0; i < a.length; i++) {
			
			if (a[i] == key) {
				System.out.println("element found at index: "+i);
				break;
			}
		}
	    if (i==a.length) {
			System.out.println("element not found");
		}
		
		
	}
}
