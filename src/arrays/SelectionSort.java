package arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	
		int[] ar = {10,46,56,34,23,6,78};
		int min , temp;
		for (int i = 0; i < ar.length; i++) {
			min = i;
			
			for (int j = i+1; j < ar.length; j++) {
				
				if (ar[j] < ar[min]) {
					min = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
		System.out.println(Arrays.toString(ar));
	}
	
}
