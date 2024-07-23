package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
	/*	int [] ar = {12,23,44,66,43,42};
		int [] rev = new int[ar.length];
		
		for (int first = ar.length-1,sec=0; sec < ar.length; first--,sec++) {
			rev[sec] = ar[first];
		}
		for (int i = 0; i < rev.length; i++) {
			System.out.println(rev[i]);
		}*/
		
		int [] ar = {12,23,44,66,43,42};
		int [] rev = new int[ar.length];
		
		for (int i = 0; i < rev.length; i++) {
			rev[i] = ar[ar.length-1-i];
		}
		for (int i = 0; i < rev.length; i++) {
			System.out.println(rev[i]);
		}
	}
}
