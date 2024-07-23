package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int ip [] = {1,3,5,4,2,3,5,6,7,6,5,4,9};
		
		System.out.println(Arrays.toString(ip));
		System.out.println(Arrays.toString(RemoveDuplicate(ip)));
		
	}
	public static int[] fequency(int [] ar) {
		int ct [] = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			
			for (int j = i+1; j < ct.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ct[j]=-1;
				}
			}
		}
		return ct;
		
	}
	public static int[] RemoveDuplicate(int [] ar) {
		int freq[] = fequency(ar);
		int unique[] = new int [ar.length];
		
		for (int i = 0,j = 0; i < ar.length; i++) {
			if(freq[i] >= 0) {
				unique[j] = ar[i];
				j++;
			}
		}
		return unique;
		
	}
}
