package arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number you want to search: ");
		
		int num = sc.nextInt();
		
		int a[] = {3,8,14,20,22,25,28,78,88};
		
		int start = 0, end = a.length-1;
		int mid = (start + end /2);
		
		while (start<=end) {
			if (num == a[mid]) {
				break;
			}
			else if (num > a[mid]) {
				start = mid+1;
			}
			else if (num < mid) {
				end = mid-1;
			}
			mid = (start + end)/2;
		}
		if (num == a[mid]) {
			System.out.println("element found at "+mid+" index");
		} 
		else {
			System.out.println("element not found!");
		}
	}
}
