package arrays;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,50};
		
		System.out.println(Arrays.toString(insert(40,a,3)));
	}
	public static int[] insert(int value, int[]a, int index) {
		int [] ans = new int[a.length+1];
		
		for (int i = 0,j=0; i < ans.length;) {
			if (i != index) {
				ans[i] = a[j];
				i++;
				j++;
			} 
			else {
				ans[i] = value;
				i++;
			}
		}
		return ans;
	}
}
