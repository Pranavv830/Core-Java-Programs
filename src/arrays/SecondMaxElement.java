package arrays;

public class SecondMaxElement {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,3};
		
		int max = Integer.MIN_VALUE , secMax = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				secMax = max;
				max = a[i];
			}
			else if (secMax < a[i] && a[i] != max) {
				secMax = a[i];
			}
		}
		System.out.println("Second max element is : "+secMax);
	}
}
