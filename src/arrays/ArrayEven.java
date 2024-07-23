package arrays;

public class ArrayEven {

	public static void main(String[] args) {
		
		int [] a = {12,22,55,57,26,45};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				
				System.out.println(a[i]);
			}
		}
	}
	
}
