package arrays;

public class SecMinElement {

	public static void main(String[] args) {
		
		int a [] = {2,43,65,7,8,9,5,4,3,5};
		
		int min = Integer.MAX_VALUE , secMin = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				secMin = min;
				min = a[i];
			}
			else if (a[i]<secMin && a[i] != min) {
				secMin = a[i];
			}
		}
		System.out.println("Sec min element is: "+secMin);
	}
}
