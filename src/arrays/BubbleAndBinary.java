package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleAndBinary {

	public static int[] bubbleSort(int[] ar ) {
		
		for (int i = 0; i < ar.length-1; i++) {
			
			for (int j = 0; j < ar.length-1-i; j++) {
				
				if (ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		return ar;
	}
	
	public static int binarySearch(int[] ar,  int search) {
		
		int start = 0;
		int end = ar.length-1;
		int mid = (start+end)/2;
		
		while (start <= end) {
			
			if (ar[mid] == search) {
				break;
			}
			else if (search > ar[mid]) {
				start = mid+1;
			}
			else if (search < ar[mid]) {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		if (ar[mid] == search) {
			System.out.println("element present at "+ mid +" index");
		}
		else {
			System.out.println("element not found");
		}
		return mid;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		
		try {
			int size = sc.nextInt();
			
			int[] ar = new int[size];
			
			System.out.println("start entering the element");
			for (int i = 0; i < ar.length; i++) {
				ar[i] = sc.nextInt();
			}
			System.out.println("element stored! ");
			System.out.println("your elements are : ");
			System.out.println(Arrays.toString(ar));
			
			bubbleSort(ar);
			System.out.println("After sorting your elements are : ");
			System.out.println(Arrays.toString(ar));
			
			System.out.println("Enter the number which you want to search");
			
			int search = sc.nextInt();
			
			binarySearch(ar, search);
			
			
		} catch (InputMismatchException e) {
			System.out.println("Enter proper input");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("Array size must be possitive");
		}
		finally {
			System.out.println("Thank you");
		}
		
	}
}
