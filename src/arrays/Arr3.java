package arrays;

public class Arr3 {

	public static void main(String[] args) {
		
        int [] a = new int[5];
		
		try {
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			a[4] = 50;
			
		} catch (ArrayIndexOutOfBoundsException exp) {
			 
			System.out.println("access the elements within the size");
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
