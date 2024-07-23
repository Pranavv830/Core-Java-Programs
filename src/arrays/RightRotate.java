package arrays;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		
		int [] a = {10,34,55,4,56,54};
		int rotation = 4;
		
		for (int i = 0; i < rotation; i++) {
			rotateRight(a);
			System.out.println(Arrays.toString(a));
		}
		
	}
	public static void rotateRight(int [] a) {
		int last = a[a.length-1];
		
		for (int i = a.length-1; i > 0; i--) {
			a[i] = a[i-1];
		}
		a[0] = last;
	//	System.out.println(Arrays.toString(a));
	}
}
