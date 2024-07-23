package arrays;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
		
		int a [] = {1,3,5,7,9,5,9};
		int b [] = {2,4,6,8,10};
		
		int c [] = new int[a.length+b.length];
		
		int min = a.length<b.length ? a.length : b.length;
		
		for (int i = 0, j = 0; j < c.length; i++) {
			if (i<min) {
				
				c[j] = a[i];
				j++;
				
				c[j] = b[i];
				j++;
				
			} 
			else if(a.length>min){
				
				c[j] = a[i];
				j++;
			}
			else if(b.length>min) {
				
				c[j] = b[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
