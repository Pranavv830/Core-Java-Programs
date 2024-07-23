package strings;

public class ReverseTheString {

	public static void main(String[] args) {
		System.out.println(reverse("ABCDE"));
	}
	public static String reverse(String ip) {
		
		String ans = "";
		for (int i = ip.length()-1; i >= 0; i--) {
			ans += ip.charAt(i);
		}
		
		return ans;
		
	}
}
