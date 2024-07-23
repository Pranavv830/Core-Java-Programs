package final_modifire;

public class Final4 {

	final double d = 50.42;
	final int n;
	final char ch;
	
	{
		n = 20;
	}
	
	public Final4() {
		
		ch = 's';
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Final4().d);
		System.out.println(new Final4().n);
		System.out.println(new Final4().ch);
	}
}
