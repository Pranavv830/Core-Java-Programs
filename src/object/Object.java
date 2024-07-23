package object;

public class Object {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("redmi",20000,8,32);
		System.out.println(m1);
		System.out.println(m1.toString());
		
		Object m2 = new Mobile("vivo",15000,4,64);
		System.out.println(m2);
		
		System.out.println(m1==m2);
	}

	public boolean name;

}
