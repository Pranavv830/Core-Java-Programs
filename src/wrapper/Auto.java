package wrapper;

public class Auto {

	public static void main(String[] args) {
		
		Integer a = 10;  // Autoboxing
		System.out.println(a.hashCode());
		
		int ans = a;  // Autounboxing
		System.out.println(ans);
		
		Double d = 50.41;
		System.out.println(d.hashCode());
		
		double ans2 = d;
		System.out.println(ans2);
	}
}
