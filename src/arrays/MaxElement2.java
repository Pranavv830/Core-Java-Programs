package arrays;

public class MaxElement2 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,3,87,6,5,4,9};
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max element is : "+max);
	}
}
