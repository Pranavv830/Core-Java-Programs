package arrays;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,1,4,31,1,2,3,1,23,1};
		
		int key =1;
		int count = 0;
		int i;
		
		for (i = 0; i < a.length; i++) {
			if (a[i] == key) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("element not found");
		} else {
            System.out.println("element found : "+count+" times");
		}
	}
}
