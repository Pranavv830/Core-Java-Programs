package arrays;

public class PalindromeCheck {

	public static void main(String[] args) {
		
	
	    int a[] = {1,2,3,4,5,4,3,2,1};
	
	    int i=0 , j=a.length-1;
	    
	    while (i<a.length/2) {
			if (a[i] != a[j]) {
				break;
			}
			i++;
			j--;
		}
	    if (i>=j) {
			System.out.println("it is palindrome array");
		} else {
			System.out.println("it is not a palindrome array");
		}
	
	}
}
