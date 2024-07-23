package arrays;

public class MargeArray {

	public static void main(String[] args) {
		
	/*	int [] a = {10,20,30,40,50};
		int [] b = {60,70,80,90,100};
		
		int [] c = new int[a.length+b.length];
		
		int position = 0;
		
		for (int i = 0; i < a.length; i++,position++) {
			c[position] = a[i];
		}
		for (int i = 0; i < b.length; i++,position++) {
			c[position] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}*/
		
		
		int [] a = {10,20,30,40,50};
		int [] b = {60,70,80,90,100};
		
		int [] c = new int[a.length+b.length];
		
		for (int i = 0; i < c.length; i++) {
			
			if (i<a.length) {
				c[i] = a[i];
			}
			else {
				c[i] = b[i-a.length];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}
}
