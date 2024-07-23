package arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = {10,3,58,40,60,32};
		
		int temp , j;
		
		for (int i = 1; i < a.length; i++) {
			
			temp = a[i];
			j = i;
			
			while (j>0 && a[j-1]>temp) {
				
				a[j]=a[j-1];
				j=j-1;
				
			}
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
