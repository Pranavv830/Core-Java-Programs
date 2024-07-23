package arrays;

import java.util.Arrays;

public class ArrayArrrange {

	public static void main(String[] args) {
		
		int a[] = {-1,2,-4,0,5,10,20};
		int p1=0, p2=a.length-1;
		
		while (true) {
			while (true) {
				if (a[p1]>=0) {
					break;
				}
				p1++;
			}
			while (true) {
				if (a[p2]<0) {
					break;
				}
				p2--;
			}
			if (p1<p2) {
				int temp = a[p1];
				a[p1] = a[p2];
				a[p2] = temp;
			}
			else {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
