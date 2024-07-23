package arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int [] a = {12,39,50,4,509,20,394,55,32,2,34,4,3,24,};
		int [] dup = new int [a.length];
		
		for (int i = 0; i < dup.length; i++) {
			dup[i] = a[i];
		}
		for (int i = 0; i < dup.length; i++) {
			System.out.println(dup[i]);
		}
	}
}
